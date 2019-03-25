/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;
import com.db4o.*;
public class BaseDatos {
    private ObjectContainer oc;
    public BaseDatos() throws Exception{
          oc = Db4o.openFile("bdejemplo");
    }
    public void cerrar(){
        oc.close();
    }
    public ObjectContainer getConexion(){
        return oc;
    }
    
}
