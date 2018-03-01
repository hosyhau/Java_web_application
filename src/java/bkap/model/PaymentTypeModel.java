/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bkap.model;

import bkap.entity.PaymentType;
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
public class PaymentTypeModel {
    public List<PaymentType> getAllPaymentType()
    {
        Connection conn= null;
        CallableStatement callSt= null;
       
        List<PaymentType>listPaymentType= new ArrayList<>();
        try {
            conn=ConnectionDB.openConnection();
            callSt=conn.prepareCall("{call GetAllPaymentType()}");
            ResultSet rs= callSt.executeQuery();
            while (rs.next())
            {
                 PaymentType pay= new PaymentType();
                pay.setPaymentTypeId(rs.getString("PaymentTypeId"));
                pay.setPaymentName(rs.getString("PaymentTypeName"));
                pay.setDisplayNumber(rs.getInt("DisplayNumber"));
                pay.setStatus(rs.getBoolean("Status"));
                listPaymentType.add(pay);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            ConnectionDB.closeConnection(conn, callSt);
        }
        return listPaymentType;
    }
    public PaymentType getPaymentTypeByID(String paymentTypeID) {
        Connection conn = null;
        CallableStatement callSt = null;
      PaymentType pay= new PaymentType();
        try {
            conn = ConnectionDB.openConnection();
            callSt = conn.prepareCall("{call GetPaymentTypeById(?)}");
            callSt.setString(1, paymentTypeID);
            ResultSet rs = callSt.executeQuery();
            if (rs.next()) {
                  
                pay.setPaymentTypeId(rs.getString("PaymentTypeId"));
                pay.setPaymentName(rs.getString("PaymentTypeName"));
                pay.setDisplayNumber(rs.getInt("DisplayNumber"));
                pay.setStatus(rs.getBoolean("Status"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            ConnectionDB.closeConnection(conn, callSt);
        }
        return pay;
    }
    public boolean insertPaymentType(PaymentType payment)
    {
        Connection conn= null;
        CallableStatement callSt= null;
        boolean check= false;
        try {
            conn=ConnectionDB.openConnection();
            callSt=conn.prepareCall("{call InsertPaymentType(?,?,?,?)}");
            callSt.setString(1, payment.getPaymentTypeId());
            callSt.setString(2, payment.getPaymentName());
            callSt.setInt(3, payment.getDisplayNumber());
            callSt.setBoolean(4, payment.isStatus());
            callSt.executeUpdate();
            check= true;
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            ConnectionDB.closeConnection(conn, callSt);
        }
        return check;
    }
    public boolean updatePaymentType(PaymentType payment)
    {
        Connection conn= null;
        CallableStatement callSt= null;
        boolean check= false;
        try {
            conn=ConnectionDB.openConnection();
            callSt=conn.prepareCall("{call UpdatePaymentType(?,?,?,?)}");
            callSt.setString(1, payment.getPaymentTypeId());
            callSt.setString(2, payment.getPaymentName());
            callSt.setInt(3, payment.getDisplayNumber());
            callSt.setBoolean(4, payment.isStatus());
            callSt.executeUpdate();
            check= true;
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            ConnectionDB.closeConnection(conn, callSt);
        }
        return check;
    }
    public boolean deletePaymentType(String paymentTypeId)
    {
        Connection conn= null;
        CallableStatement callSt= null;
        boolean check= false;
        try {
            conn=ConnectionDB.openConnection();
            callSt=conn.prepareCall("{call DeletePaymentType(?)");
            callSt.setString(1, paymentTypeId);
            callSt.executeUpdate();
            check=true;
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            ConnectionDB.closeConnection(conn, callSt);
        }
        return check;
    }
    
}
