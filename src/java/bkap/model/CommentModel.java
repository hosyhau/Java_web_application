/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bkap.model;

import bkap.entity.Comment;
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
public class CommentModel {
    public List<Comment> getAllComment()
    {
        Connection conn= null;
        CallableStatement callSt= null;
        
        List<Comment>listComment = new ArrayList<>();
        try {
            conn=ConnectionDB.openConnection();
            callSt=conn.prepareCall("{call GetAllComment()}");
            ResultSet rs = callSt.executeQuery();
            while (rs.next())
            {
                Comment com= new Comment();
                com.setCommentId(rs.getString("CommentId"));
                com.setUserId(rs.getInt("UserId"));
                com.setContent(rs.getString("Content"));
                com.setAuthor(rs.getString("Author"));
                com.setStatus(rs.getBoolean("Allow"));
                 com.setQuantityComment(rs.getInt("QuantityComment"));
                com.setProductId(rs.getString("ProductId"));
                listComment.add(com);
            }
            
        } catch (Exception e) {
            e.printStackTrace();
        }finally{
            ConnectionDB.closeConnection(conn, callSt);
        }
        return listComment;
    }
    
    public boolean insertComment(Comment com)
    {
        Connection conn= null;
        CallableStatement callSt= null;
        boolean check= true;
        try {
           conn=ConnectionDB.openConnection();
           callSt=conn.prepareCall("{call InsertComment(?,?,?,?,?)}");
           callSt.setString(1, com.getCommentId());
           callSt.setInt(2, com.getUserId());
           callSt.setString(3, com.getContent());
           callSt.setString(4, com.getAuthor());
           callSt.setBoolean(5,com.isStatus());
           callSt.executeUpdate();
           check= true;
        } catch (Exception e) {
            e.printStackTrace();
        }finally{
            ConnectionDB.closeConnection(conn, callSt);
        }
        return check;
    }
    public boolean updateComment(Comment com)
    {
        Connection conn= null;
        CallableStatement callSt= null;
        boolean check= true;
        try {
           conn=ConnectionDB.openConnection();
           callSt=conn.prepareCall("{call UpdateComment(?,?,?,?,?)}");
           callSt.setString(1, com.getCommentId());
           callSt.setInt(2, com.getUserId());
           callSt.setString(3, com.getContent());
           callSt.setString(4, com.getAuthor());
           callSt.setBoolean(5,com.isStatus());
           callSt.executeUpdate();
           check= true;
        } catch (Exception e) {
            e.printStackTrace();
        }finally{
            ConnectionDB.closeConnection(conn, callSt);
        }
        return check;
    }
    public boolean deleteComment(String commentId)
    {
        Connection conn= null;
        CallableStatement callSt= null;
        boolean check= true;
        try {
           conn=ConnectionDB.openConnection();
           callSt=conn.prepareCall("{call DeleteComment(?)}");
           callSt.setString(1, commentId);
           callSt.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }finally{
            ConnectionDB.closeConnection(conn, callSt);
        }
        return check;
    }
    
}
