/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bkap.model;

import bkap.entity.Order;
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
public class OrderModel {
    public List<Order> getAllOrder()
    {
        Connection conn= null;
        CallableStatement callSt= null;
        List<Order>listOrder = new ArrayList<>();
       
        try {
            conn=ConnectionDB.openConnection();
            callSt=conn.prepareCall("{call GetAllOder()}");
            ResultSet rs= callSt.executeQuery();
            while (rs.next())
            {
                 Order order = new Order();
                order.setOrderId(rs.getString("OderId"));
                order.setOrderName(rs.getString("OderName"));
                order.setOrderNumber(rs.getInt("OderNumber"));
                order.setStatus(rs.getBoolean("Status"));
                order.setTotalAmount(rs.getFloat("TotalAmount"));
                order.setPhone(rs.getString("Phone"));
                order.setEmail(rs.getString("Email"));
                order.setAddress(rs.getString("Address"));                
                order.setShipId(rs.getString("ShipId"));
                order.setPaymentDate(rs.getString("PaymentDate"));
                order.setCreateDate(rs.getString("Created"));
                order.setUserId(rs.getInt("UserId"));
                listOrder.add(order);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            ConnectionDB.closeConnection(conn, callSt);
        }
        return listOrder;
    }
    public boolean insertOrder(Order order){
        Connection conn= null;
        CallableStatement callSt= null;
        boolean check= false;
        try {
            conn=ConnectionDB.openConnection();
            callSt=conn.prepareCall("{call InsertOder(?,?,?,?,?,?,?,?,?,?,?,?)}");
            callSt.setString(1, order.getOrderId());
            callSt.setString(2, order.getOrderName());
            callSt.setInt(3, order.getOrderNumber());
            callSt.setBoolean(4, order.isStatus());
            callSt.setFloat(5, order.getTotalAmount());
            callSt.setString(6, order.getPhone());
            callSt.setString(7, order.getEmail());
            callSt.setString(8, order.getAddress());
            callSt.setInt(9, order.getUserId());
            callSt.setString(10, order.getShipId());
            callSt.setString(11, order.getPaymentDate());
            callSt.setString(12, order.getCreateDate());
            callSt.executeUpdate();
            check=true;
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            ConnectionDB.closeConnection(conn, callSt);
        }
        return check;
    }
    public boolean updateOrder(Order order){
        Connection conn= null;
        CallableStatement callSt= null;
        boolean check= false;
        try {
            conn=ConnectionDB.openConnection();
            callSt=conn.prepareCall("{call UpdateOder(?,?,?,?,?,?,?,?,?,?,?,?)}");
            callSt.setString(1, order.getOrderId());
            callSt.setString(2, order.getOrderName());
            callSt.setInt(3, order.getOrderNumber());
            callSt.setBoolean(4, order.isStatus());
            callSt.setFloat(5, order.getTotalAmount());
            callSt.setString(6, order.getPhone());
            callSt.setString(7, order.getEmail());
            callSt.setString(8, order.getAddress());         
            callSt.setString(9, order.getShipId());
            callSt.setString(10, order.getPaymentDate());
            callSt.setString(11, order.getCreateDate());
             callSt.setInt(12, order.getUserId());
            callSt.executeUpdate();
            check=true;
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            ConnectionDB.closeConnection(conn, callSt);
        }
        return check;
    }
    public Order getOrderById(String orderId)
    {
         Connection conn= null;
        CallableStatement callSt= null;
         Order order = new Order();
        try {
            conn=ConnectionDB.openConnection();
            callSt=conn.prepareCall("{call GetOderById(?)}");
              callSt.setString(1, orderId);
            ResultSet rs=callSt.executeQuery();
             
            if (rs.next())
                
            {
              
                order.setOrderId(rs.getString("OderId"));
                order.setOrderName(rs.getString("OderName"));
                order.setOrderNumber(rs.getInt("OderNumber"));
                order.setStatus(rs.getBoolean("Status"));
                order.setTotalAmount(rs.getFloat("TotalAmount"));
                order.setPhone(rs.getString("Phone"));
                order.setEmail(rs.getString("Email"));
                order.setAddress(rs.getString("Address"));                
                order.setShipId(rs.getString("ShipId"));
                order.setPaymentDate(rs.getString("PaymentDate"));
                order.setCreateDate(rs.getString("Created"));
                order.setUserId(rs.getInt("UserId"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        finally{
            ConnectionDB.closeConnection(conn, callSt);
        }
        return order;
    }
    public boolean deleteOrder(String orderId)
    {
         Connection conn= null;
        CallableStatement callSt= null;
        boolean check= false;
        try {
            conn=ConnectionDB.openConnection();
            callSt=conn.prepareCall("{call DeleteOder(?)}");
            callSt.setString(1, orderId);
            callSt.executeUpdate();
            check= true;
        } catch (Exception e) {
            e.printStackTrace();
        }finally{
            ConnectionDB.closeConnection(conn, callSt);
        }
        return check;
    }
}
