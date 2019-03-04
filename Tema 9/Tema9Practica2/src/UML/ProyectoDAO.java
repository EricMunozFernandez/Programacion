/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UML;

import java.sql.*;

/**
 *
 * @author 1gdaw07
 */
public class ProyectoDAO {
    private Connection con;

    public ProyectoDAO(Connection con) {
        this.con=con;
    }
}
