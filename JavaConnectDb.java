/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import oracle.jdbc.OraclePreparedStatement;


/**
 *
 * @author MAHE
 */
public class JavaConnectDb{ 
     private static Connection conn;
             public static Statement stmt;
       public static boolean makeConnection()
    {
        try 
        {
            conn=DriverManager.getConnection( "jdbc:oracle:thin:@localhost:1523:orcl", "system", "priyaN25");
            stmt= conn.createStatement();
            conn.setAutoCommit(false);
            
            //Statement stmt ;
           // stmt = con.createStatement();
            return true;  
        }catch(SQLException e){
            return false;
        }
    }

    public static boolean executeQuery(String query) throws SQLException
{
    stmt.executeQuery(query);
    return true;
}
 public static ResultSet executeSelectStatement(String query)
    {
        try {
            return stmt.executeQuery(query);
        } catch (SQLException ex) {
            return null;
        }
    }




  
}