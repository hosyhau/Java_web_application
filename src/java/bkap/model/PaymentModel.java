/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bkap.model;

import bkap.entity.Payment;
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
public class PaymentModel {
    public List<Payment> getAllPayment()
    {
        Connection conn = null;
        CallableStatement callSt = null;
        Payment pay = new Payment();
        List<Payment>listPayment = new ArrayList<>();
        try {
            conn = ConnectionDB.openConnection();
            callSt = conn.prepareCall("{call GetAllPayment()}");
            ResultSet rs = callSt.executeQuery();
            while (rs.next())
            {
                pay.setPaymentId(rs.getString("PaymentId"));
                pay.setOrderId(rs.getString("OderId"));
                pay.setCreateDate(rs.getString("Created"));
                pay.setPaymentTypeId(rs.getString("PaymentTypeId"));
                pay.setTransactionId(rs.getString("TransactionId"));
                pay.setStatus(rs.getBoolean("Status"));
                listPayment.add(pay);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            ConnectionDB.closeConnection(conn, callSt);
        }
        return listPayment;
    }
    public boolean insertPayment(Payment payment)
    {
        Connection conn = null;
        CallableStatement callSt = null;
        boolean check= false;
        try {
            conn = ConnectionDB.openConnection();
            callSt = conn.prepareCall("{call InsertPayment(?,?,?,?,?,?)}");
            callSt.setString(1, payment.getPaymentId());
            callSt.setString(2, payment.getOrderId());
            callSt.setString(3,payment.getCreateDate());
            callSt.setString(4, payment.getPaymentTypeId());
            callSt.setString(5, payment.getTransactionId());
            callSt.setBoolean(6, payment.isStatus());
            callSt.executeUpdate();
            check = true;
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            ConnectionDB.closeConnection(conn, callSt);
        }
        return check;
    }
    public boolean updatePayment(Payment payment)
    {
        Connection conn = null;
        CallableStatement callSt = null;
        boolean check= false;
        try {
            conn = ConnectionDB.openConnection();
            callSt = conn.prepareCall("{call UpdatePayment(?,?,?,?,?,?)}");
            callSt.setString(1, payment.getPaymentId());
            callSt.setString(2, payment.getOrderId());
            callSt.setString(3,payment.getCreateDate());
            callSt.setString(4, payment.getPaymentTypeId());
            callSt.setString(5, payment.getTransactionId());
            callSt.setBoolean(6, payment.isStatus());
            callSt.executeUpdate();
            check = true;
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            ConnectionDB.closeConnection(conn, callSt);
        }
        return check;
    }
    public boolean deletePayment(String paymentId)
    {
        Connection conn = null;
        CallableStatement callSt = null;
        boolean check= false;
        try {
            conn = ConnectionDB.openConnection();
            callSt = conn.prepareCall("{call DeletePayment(?)}");
            callSt.setString(1, paymentId);
            callSt.executeUpdate();
            check= true;
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            ConnectionDB.closeConnection(conn, callSt);
        }
        return check;
    }
    public Payment getPaymentById(String paymentId)
    {
        Connection conn = null;
        CallableStatement callSt = null;
        Payment pay = new Payment();
        try {
            conn = ConnectionDB.openConnection();
            callSt = conn.prepareCall("{call GetPaymentById(?)}");
            callSt.setString(1, paymentId);
            ResultSet rs = callSt.executeQuery();
            if (rs.next())
            {
                pay.setPaymentId(rs.getString("PaymentId"));
                pay.setOrderId(rs.getString("OderId"));
                pay.setCreateDate(rs.getString("Created"));
                pay.setPaymentTypeId(rs.getString("PaymentTypeId"));
                pay.setTransactionId(rs.getString("TransactionId"));
                pay.setStatus(rs.getBoolean("Status"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }finally{
           ConnectionDB.closeConnection(conn, callSt);
        }
        return pay;
    }
}
