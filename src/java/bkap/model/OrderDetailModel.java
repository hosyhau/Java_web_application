/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bkap.model;

import bkap.entity.OrderDetail;
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
public class OrderDetailModel {
    public List<OrderDetail> getAllOrderDetail()
    {
        Connection conn= null;
        CallableStatement callSt=null;
      
        List<OrderDetail>listOrderDetail = new ArrayList<>();
        try {
            conn=ConnectionDB.openConnection();
            callSt=conn.prepareCall("{call GetAllOderDetail()}");
            ResultSet rs = callSt.executeQuery();
            while (rs.next())
            {
                  OrderDetail order= new OrderDetail();
                order.setOderId(rs.getString("OderId"));
                order.setProductId(rs.getString("ProductId"));
                order.setAmount(rs.getFloat("Amount"));
                order.setQuantity(rs.getFloat("Quantity"));
                order.setStatus(rs.getBoolean("Status"));
                listOrderDetail.add(order);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            ConnectionDB.closeConnection(conn, callSt);
        }
        return listOrderDetail;
    }
    public boolean insertOrderDetail(OrderDetail order)
    {
        Connection conn= null;
        CallableStatement callSt=null;
        boolean check=false;
        try {
            conn=ConnectionDB.openConnection();
            callSt=conn.prepareCall("{call InsertOderDetail(?,?,?,?,?)}");
            callSt.setString(1, order.getOderId());
            callSt.setString(2, order.getProductId());
            callSt.setFloat(3, order.getAmount());
            callSt.setFloat(4, order.getQuantity());
            callSt.setBoolean(3, order.isStatus());
            callSt.executeUpdate();
            check=true;
            
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            ConnectionDB.closeConnection(conn, callSt);
        }
        return check;
    }
    public boolean updateOrderDetail(OrderDetail order)
    {
        Connection conn= null;
        CallableStatement callSt=null;
        boolean check=false;
        try {
            conn=ConnectionDB.openConnection();
            callSt=conn.prepareCall("{call UpdateOderDetail(?,?,?,?,?)}");
            callSt.setString(1, order.getOderId());
            callSt.setString(2, order.getProductId());
            callSt.setFloat(3, order.getAmount());
            callSt.setFloat(4, order.getQuantity());
            callSt.setBoolean(5, order.isStatus());
            callSt.executeUpdate();
            check=true;
            
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            ConnectionDB.closeConnection(conn, callSt);
        }
        return check;
    }
    public boolean deleteOrderDetail(String orderId,String productId)
    {
        Connection conn= null;
        CallableStatement callSt=null;
        boolean check=false;
        try {
            conn=ConnectionDB.openConnection();
            callSt=conn.prepareCall("{call DeleteOderDetail(?,?)}");
            callSt.setString(1, orderId);
            callSt.setString(2, productId);
            callSt.executeUpdate();
            check = true;
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            ConnectionDB.closeConnection(conn, callSt);
        }
        return check;
    }
    public OrderDetail getOrderDetailById(String orderId,String productId)
    {
        Connection conn = null;
        CallableStatement callSt = null;
       OrderDetail order = new OrderDetail();
        try {
            conn=ConnectionDB.openConnection();
            callSt=conn.prepareCall("{call GetOderDetailById(?,?)}");
            callSt.setString(1, orderId);
            callSt.setString(2, productId);
            ResultSet rs = callSt.executeQuery();
            if (rs.next())
            {
                order.setOderId(rs.getString("OderId"));
                order.setProductId(rs.getString("ProductId"));
                order.setAmount(rs.getFloat("Amount"));
                order.setQuantity(rs.getFloat("Quantity"));
                order.setStatus(rs.getBoolean("Status"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            ConnectionDB.closeConnection(conn, callSt);
        }
        return order;
    }
}
