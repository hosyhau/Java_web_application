/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bkap.model;

import bkap.entity.User;
import bkap.util.ConnectionDB;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Types;
import java.util.ArrayList;
import java.util.List;


/**
 *
 * @author admin
 */
public class UserModel {

    public List<User> GetAllUser() {
        Connection conn = null;
        CallableStatement call = null;
        List<User> listAllUser = new ArrayList<>();
        try {
            conn = ConnectionDB.openConnection();
            call = conn.prepareCall("{call GetAllUser()}");
            ResultSet rs = call.executeQuery();
            while (rs.next()) {
                User user = new User();
                user.setUserId(rs.getInt("UserId"));
                user.setUserName(rs.getString("UserName"));
                user.setPassWord(rs.getString("PassWord"));
                user.setPhone(rs.getString("Phone"));
                user.setAddress(rs.getString("Address"));
                user.setEmail(rs.getString("Email"));
                user.setGender(rs.getBoolean("Gender"));
                user.setBirthDay(rs.getString("Birthday"));
                user.setUserType(rs.getString("UserType"));
                user.setPackageId(rs.getInt("PackageId"));
                user.setGroupId(rs.getInt("GroupId"));
                user.setStatus(rs.getBoolean("Status"));
                listAllUser.add(user);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            ConnectionDB.closeConnection(conn, call);
        }
        return listAllUser;
    }
    public User getUserById(int userId)
    {
        Connection conn = null;
        CallableStatement callSt = null;
        User user = new User();
        try {
            conn = ConnectionDB.openConnection();           
            callSt = conn.prepareCall("{call GetUserById(?)}");             
            callSt.setInt(1, userId);
            ResultSet rs = callSt.executeQuery();
            if (rs.next()) {
               user.setUserId(rs.getInt("UserId"));
                user.setUserName(rs.getString("UserName"));
                user.setPassWord(rs.getString("UserName"));
                user.setPhone(rs.getString("Phone"));
                user.setAddress(rs.getString("Address"));
                user.setEmail(rs.getString("Email"));
                user.setGender(rs.getBoolean("Gender"));
                user.setBirthDay(rs.getString("Birthday"));
                user.setUserType(rs.getString("UserType"));
                user.setPackageId(rs.getInt("PackageId"));
                user.setGroupId(rs.getInt("GroupId"));
                user.setStatus(rs.getBoolean("Status"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            ConnectionDB.closeConnection(conn, callSt);
        }
        return user;
    }
   public boolean updateUser(User user)
    {
        Connection conn=null;
        CallableStatement callSt=null;
        boolean check=false;
        try {
            conn=ConnectionDB.openConnection();
            callSt=conn.prepareCall("{call UpdateUser(?,?,?,?,?,?,?,?,?,?,?,?)}");
            callSt.setInt(1, user.getUserId());
            callSt.setString(2, user.getUserName());
            callSt.setString(3,user.getPassWord());
            callSt.setString(4, user.getPhone());
            callSt.setString(5,user.getEmail());
            callSt.setString(6, user.getBirthDay());
            callSt.setString(7, user.getAddress());
            callSt.setBoolean(8, user.isGender());
            callSt.setString(9,user.getUserType());
            callSt.setInt(10, user.getGroupId());
            callSt.setInt(11, user.getPackageId());
            callSt.setBoolean(12,user.isStatus());
            callSt.executeUpdate();
            check=true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        finally{
            ConnectionDB.closeConnection(conn, callSt);
        }
        return check;
    }
    public boolean checkLogin(String email, String passWord) {
        Connection conn = null;
        CallableStatement callSt = null;
        boolean returnCheck = false;
        try {
            conn = ConnectionDB.openConnection();
            callSt = conn.prepareCall("{call CheckUser(?,?,?)}");
            callSt.setString(1, email);
            callSt.setString(2, passWord);
            callSt.registerOutParameter(3, Types.BOOLEAN);
            callSt.execute();
            returnCheck = callSt.getBoolean(3);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            ConnectionDB.closeConnection(conn, callSt);
        }
        return returnCheck;
    }
    public boolean insertUser(User user)
    {
        Connection conn=null;
        CallableStatement callSt= null;
        boolean check=false;
        try {
            conn=ConnectionDB.openConnection();
            callSt=conn.prepareCall("{call InsertUser(?,?,?,?,?,?,?,?,?,?,?)}");          
            callSt.setString(1, user.getUserName());
            callSt.setString(2,user.getPassWord());
            callSt.setString(3, user.getPhone());
            callSt.setString(4,user.getEmail());
            callSt.setString(5,user.getAddress());
            callSt.setBoolean(6, user.isGender());
            callSt.setString(7, user.getBirthDay());  
            callSt.setString(8,user.getUserType());
            callSt.setInt(9, user.getGroupId());
            callSt.setInt(10, user.getPackageId());
            callSt.setBoolean(11, user.isStatus());
            callSt.executeUpdate();
            check=true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        finally{
            ConnectionDB.closeConnection(conn, callSt);
        }
        return check;
    }
    public boolean deleteUser(int userId)
    {
        Connection conn=null;
        CallableStatement callSt= null;
        User user = new User();
        boolean check=false;
        try {
            conn=ConnectionDB.openConnection();
            callSt=conn.prepareCall("{call DeleteUser(?)}");
            callSt.setInt(1, userId);
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
