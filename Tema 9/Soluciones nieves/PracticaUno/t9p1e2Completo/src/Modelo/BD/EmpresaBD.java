
package Modelo.BD;

import Modelo.UML.Empresa;
import com.mysql.jdbc.exceptions.jdbc4.MySQLIntegrityConstraintViolationException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class EmpresaBD {
    
    private static PreparedStatement sentenciaCon;
    private static String plantilla;
    private static ResultSet resultado;
    
    private static Empresa e;
    
    public static Empresa queryByNif(String nif) throws Exception{
         
        // ¿¿¿¿¿¿¿¿¿¿¿  GenericoBD.abrirBD();
        if (GenericoBD.getCon() == null)
            GenericoBD.abrirBD();
            
        plantilla = "select * from empresas where nif = ?";
        sentenciaCon = GenericoBD.getCon().prepareStatement(plantilla);
        sentenciaCon.setString(1,nif);
        resultado = sentenciaCon.executeQuery();
        // Doy por hecho que existe
        resultado.next();
        
        // Crear objeto
        e = new Empresa();
        e.setNif(nif);
        e.setNombre(resultado.getString("nombre"));
        e.setRazonSocial(resultado.getString("razonSocial"));
        e.setCnae(resultado.getInt("cnae"));
        
        resultado.close();
        
       // GenericoBD.cerrarBD();
        return e;
    }
    
    public static void alta(Empresa e) throws Exception{
          try
          { 
            GenericoBD.abrirBD();
            plantilla = "INSERT INTO empresas VALUES (?,?,?,?)";
            sentenciaCon = GenericoBD.getCon().prepareStatement(plantilla);
            sentenciaCon.setString(1,e.getNif());
            sentenciaCon.setString(2,e.getNombre());
            sentenciaCon.setString(3,e.getRazonSocial());
            sentenciaCon.setInt(4,e.getCnae());
            
            sentenciaCon.executeUpdate();
            
            GenericoBD.cerrarBD();
            
          }
          catch(MySQLIntegrityConstraintViolationException ex){
             // La empresa existe, no es un problema
             // El resto de las excepciones si las relanzo
              GenericoBD.cerrarBD();
          }
    }
    
}
