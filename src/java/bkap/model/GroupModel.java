/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bkap.model;

/**
 *
 * @author admin
 */
import bkap.entity.Function;
import bkap.entity.Group;
import bkap.entity.GroupFunction;
import java.sql.*;
import java.util.*;
import bkap.util.ConnectionDB;

/**
 *
 * @author tutk
 */
public class GroupModel {

   public List<Group> getAllGroup() {
        Connection conn = null;
        CallableStatement callSt = null;
        List<Group> listGr = new ArrayList<>();
        try {
            conn = ConnectionDB.openConnection();
            callSt = conn.prepareCall("{call Group_GetAll()}");
            ResultSet rs = callSt.executeQuery();
            while (rs.next()) {
                Group gr = new Group();
                gr.setGroupId(rs.getInt("GroupID"));
                gr.setGroupName(rs.getString("GroupName"));
                gr.setStatus(rs.getBoolean("Status"));
                listGr.add(gr);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            ConnectionDB.closeConnection(conn, callSt);
        }
        return listGr;
    }
   
   public List<GroupFunction> getFunctionByGroupID( int groupID) {
        Connection conn = null;
        CallableStatement callSt = null;
        List<GroupFunction> listGf = new ArrayList<>();
        try {
            conn = ConnectionDB.openConnection();
            callSt = conn.prepareCall("{call Group_GetFunctionByGroupID(?)}");
            callSt.setInt(1, groupID);
            ResultSet rs = callSt.executeQuery();
            while (rs.next()) {
                GroupFunction gf = new GroupFunction();
                gf.setGroupId(rs.getInt("GroupId"));
                gf.setFunctionId(rs.getInt("FunctionId"));
                gf.setStatus(rs.getBoolean("Status"));
                listGf.add(gf);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            ConnectionDB.closeConnection(conn, callSt);
        }
        return listGf;
    }

    public Group getGroupByID(int groupID) {
        Connection conn = null;
        CallableStatement callSt = null;
        Group gr = new Group();
        try {
            conn = ConnectionDB.openConnection();
            callSt = conn.prepareCall("{call Group_GetByID(?) }");
            callSt.setInt(1, groupID);
            ResultSet rs = callSt.executeQuery();
            if (rs.next()) {
                gr.setGroupId(rs.getInt("GroupId"));
                gr.setGroupName(rs.getString("GroupName"));
                gr.setStatus(rs.getBoolean("Status"));
            }
            //callSt.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            ConnectionDB.closeConnection(conn, callSt);
        }
        return gr;
    }

    public boolean insertGroup(Group gr) {
        Connection conn = null;
        CallableStatement callSt = null;
        boolean check = false;
        
        try {

            conn = ConnectionDB.openConnection();
            callSt = conn.prepareCall("{call Group_Insert(?,?) }");
            callSt.setString(1, gr.getGroupName());
            callSt.setBoolean(2, gr.isStatus());
            callSt.executeUpdate();
            check = true;
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            ConnectionDB.closeConnection(conn, callSt);
        }
        return check;
    }
    public boolean insertFunctionInGroup(GroupFunction gf) {
        Connection conn = null;
        CallableStatement callSt = null;
        boolean check = false;
        
        try {

            conn = ConnectionDB.openConnection();
            callSt = conn.prepareCall("{call Group_Function_Insert(?.?,?) }");
            callSt.setInt(1,gf.getGroupId());
            callSt.setInt(2, gf.getFunctionId());
            callSt.setBoolean(3, gf.isStatus());
            callSt.executeUpdate();
            check = true;
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            ConnectionDB.closeConnection(conn, callSt);
        }
        return check;
    }

    public boolean updateGroup(Group gr) {
        Connection conn = null;
        CallableStatement callSt = null;
        boolean check = false;
        try {
            conn = ConnectionDB.openConnection();
            callSt = conn.prepareCall("{call Group_Update(?,?,?) }");
            callSt.setInt(1, gr.getGroupId());
            callSt.setString(2, gr.getGroupName());
            callSt.setBoolean(3, gr.isStatus());
            callSt.executeUpdate();
            check = true;
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            ConnectionDB.closeConnection(conn, callSt);
        }
        return check;
    }

    public boolean deleteGroup(int groupID) {
        Connection conn = null;
        CallableStatement callSt = null;
        boolean check = false;
        try {
            conn = ConnectionDB.openConnection();
            callSt = conn.prepareCall("{call Group_Delete(?) }");
            callSt.setInt(1, groupID);
            callSt.executeUpdate();
            check = true;
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            ConnectionDB.closeConnection(conn, callSt);
        }
        return check;
    } 
    public boolean deleteFunctionInGroup(int groupID,int functionID) {
        Connection conn = null;
        CallableStatement callSt = null;
        boolean check = false;
        try {
            conn = ConnectionDB.openConnection();
            callSt = conn.prepareCall("{call Group_DeleteFunctionInGroup(?,?) }");
            callSt.setInt(1, groupID);
            callSt.setInt(2, functionID);
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
