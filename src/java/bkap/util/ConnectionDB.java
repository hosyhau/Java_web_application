/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bkap.util;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author hien1_000
 */
public class ConnectionDB {
    private static final String URL = "jdbc:sqlserver://localhost:1433;databaseName=Project";
    private static final String DRIVER_DB = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
    private static final String user_db = "sa";
    private static final String pass_db = "1997";
    
    public static Connection openConnection(){
        Connection conn = null;
        try {
            Class.forName(DRIVER_DB);
            conn = DriverManager.getConnection(URL, user_db, pass_db);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return conn;
    }
    
    public static void closeConnection(Connection conn, CallableStatement callSt){
        try {
            if(conn!=null){
                conn.close();
            }
            if(callSt!=null){
                callSt.close();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
