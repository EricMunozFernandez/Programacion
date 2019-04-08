/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BD;

import java.sql.Connection;

/**
 *
 * @author hp_pc
 */
public class ClienteBD {

    private Connection con;

    public ClienteBD(Connection con) {
        this.con = con;
    }

    public ClienteBD() {

    }
    
    public void nuevoCliente() throws Exception{
        Conexion conexion = new Conexion();
    }
}
