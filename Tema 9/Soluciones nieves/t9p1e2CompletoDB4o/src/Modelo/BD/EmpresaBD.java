
package Modelo.BD;

import Modelo.UML.Empresa;


public class EmpresaBD {
    
    
    
    public static Empresa queryByNif(String nif) throws Exception{
         
       return null;
    }
    
    public static void alta(Empresa e) throws Exception{
       GenericoBD.getCon().store(e);
       // ¿¿ Query??
    }
    
}
