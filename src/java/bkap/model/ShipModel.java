/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bkap.model;

import bkap.entity.Ship;
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
public class ShipModel {

    public List<Ship> getAllShip() {
        Connection conn = null;
        CallableStatement callSt = null;
        List<Ship> listShip = new ArrayList<>();
        
        try {
            conn = ConnectionDB.openConnection();
            callSt = conn.prepareCall("{call GetAllShip()}");
            ResultSet rs = callSt.executeQuery();
            while (rs.next()) {
                Ship ship = new Ship();
                ship.setShipId(rs.getString("ShipId"));
                ship.setDistance(rs.getFloat("Distance"));
                ship.setPriceOder(rs.getFloat("PriceOder"));
                ship.setPriceOfShip(rs.getFloat("PriceOfShip"));
                listShip.add(ship);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            ConnectionDB.closeConnection(conn, callSt);
        }
        return listShip;
    }

    public boolean insertShip(Ship ship) {
        Connection conn = null;
        CallableStatement callSt = null;
        boolean check = false;
        try {
            conn = ConnectionDB.openConnection();
            callSt = conn.prepareCall("{call InsertShip(?,?,?,?");
            callSt.setString(1, ship.getShipId());
            callSt.setFloat(2, ship.getDistance());
            callSt.setFloat(3, ship.getPriceOder());
            callSt.setFloat(4, ship.getPriceOfShip());
            callSt.executeUpdate();
            check = true;
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            ConnectionDB.closeConnection(conn, callSt);
        }
        return check;
    }

    public boolean updateShip(Ship ship) {
        Connection conn = null;
        CallableStatement callSt = null;
        boolean check = false;
        try {
            conn = ConnectionDB.openConnection();
            callSt = conn.prepareCall("{call UpdateShip(?,?,?,?");
            callSt.setString(1, ship.getShipId());
            callSt.setFloat(2, ship.getDistance());
            callSt.setFloat(3, ship.getPriceOder());
            callSt.setFloat(4, ship.getPriceOfShip());
            callSt.executeUpdate();
            check = true;
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            ConnectionDB.closeConnection(conn, callSt);
        }
        return check;
    }

    public boolean deleteShip(String shipId) {
        Connection conn = null;
        CallableStatement callSt = null;
        boolean check = false;
        try {
            conn = ConnectionDB.openConnection();
            callSt = conn.prepareCall("{call DeleteShip(?)}");
            callSt.setString(1, shipId);
            callSt.executeUpdate();
            check = true;
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            ConnectionDB.closeConnection(conn, callSt);
        }
        return check;
    }
}
