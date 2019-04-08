/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BD;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author hp_pc
 */
public class Conexion {

    private final String bd = "abogado";
    private final String login = "root";
    private final String password = "usbw";
    private final String url = "jdbc:mysql://localhost:3307/" + bd;

    private final Connection con;

    public Conexion() throws Exception {
        Class.forName("com.mysql.jdbc.Driver");

        con = DriverManager.getConnection(url, login, password);

        if (con == null) {
            throw new Exception("Problemas con la conexión");
        }
    }

    public Connection getConnection() {
        return con;
    }

    public void desconectar() throws Exception {
        con.close();
    }
}
