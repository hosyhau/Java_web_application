/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bkap.model;

import bkap.entity.Color;
import bkap.util.ConnectionDB;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author admin
 */
public class ColorModel {
    public List<Color> getAllColor()
    {
        Connection conn=null;
        CallableStatement callSt= null;
        List<Color>listColor = new ArrayList<>();
        try {
           
            conn=ConnectionDB.openConnection();
            callSt=conn.prepareCall("{call GetAllColor()}");
            ResultSet rs =callSt.executeQuery();
            while (rs.next())
            {
                 Color color = new Color();
                color.setColorId(rs.getString("ColorId"));
               color.setColorName(rs.getString("ColorName"));
               color.setStatus(rs.getBoolean("Status"));
                listColor.add(color);
            }
            
           
        } catch (Exception e) {
            e.printStackTrace();
        }
        finally{
            ConnectionDB.closeConnection(conn, callSt);
        }
        return listColor;
    }
    public boolean insertColor(Color color)
    {
        Connection conn= null;
        CallableStatement callSt=null;
        boolean check=false;
        try {
            conn=ConnectionDB.openConnection();
            callSt=conn.prepareCall("{call InsertColor(?,?,?)}");
            callSt.setString(1, color.getColorId());
            callSt.setString(2, color.getColorName());
            callSt.setBoolean(3, color.isStatus());
            callSt.executeUpdate();
            check=true;
        } catch (Exception e) {
            e.printStackTrace();
        }finally{
            ConnectionDB.closeConnection(conn, callSt);
        }
        return check;
    }
    public boolean updateColor(Color color)
    {
        Connection conn= null;
        CallableStatement callSt=null;
        boolean check=false;
        try {
            conn=ConnectionDB.openConnection();
            callSt=conn.prepareCall("{call UpdateColor(?,?,?)}");
            callSt.setString(1, color.getColorId());
            callSt.setString(2, color.getColorName());
            callSt.setBoolean(3, color.isStatus());
            callSt.executeUpdate();
            check=true;
        } catch (Exception e) {
            e.printStackTrace();
        }finally{
            ConnectionDB.closeConnection(conn, callSt);
        }
        return check;
    }
    public boolean deleteColor(String colorId)
    {
        Connection conn= null;
        CallableStatement callSt=null;
        Color color =new Color();
        boolean check=false;
        try {
            conn=ConnectionDB.openConnection()
                    ;
            callSt=conn.prepareCall("{call DeleteColor(?)}");
            callSt.setString(1,color.getColorId());
            callSt.executeUpdate();
            check=true;
        } catch (Exception e) {
            e.printStackTrace();
        }finally{
            ConnectionDB.closeConnection(conn, callSt);
        }
        return check;
    }

    public Color getColorByID(String colorID) {
        Connection conn = null;
        CallableStatement callSt = null;
        Color cl = new Color();
        try {
            conn = ConnectionDB.openConnection();
            callSt = conn.prepareCall("{call GetColorById(?)}");
            callSt.setString(1, colorID);
            ResultSet rs = callSt.executeQuery();
            while (rs.next()) {
                cl.setColorId(rs.getString("ColorId"));
                cl.setColorName(rs.getString("ColorName"));
                cl.setStatus(rs.getBoolean("Status"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            ConnectionDB.closeConnection(conn, callSt);
        }
        return cl;
    }

    
}
