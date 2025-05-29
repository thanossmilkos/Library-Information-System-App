/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TBD;

import java.sql.*;
/**
 *
 * @author eliss
 */
public class CONNECTION {
    public static Connection getCon()
    {
        try{
            Class.forName("oracle.jdbc.OracleDriver");
            Connection con= DriverManager.getConnection("jdbc:oracle:thin:@192.168.6.21:1521:dblabs","it185445","elissabeT2018!");
            return con;       
        }
        catch(Exception e){
            System.out.println(e);
            return null;
        }
    }
    
}
