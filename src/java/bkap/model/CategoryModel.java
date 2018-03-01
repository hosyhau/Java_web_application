/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bkap.model;

import bkap.entity.Category;
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
public class CategoryModel {
    
    public List<Category> getAllCategory()
    {
        Connection conn=null;
        CallableStatement callSt=null;
       
        List<Category> listCategory= new ArrayList<>();
        try {
            conn=ConnectionDB.openConnection();
            callSt=conn.prepareCall("{call GetAllCategory()}");
            ResultSet rs=callSt.executeQuery();
            while (rs.next())
            {
                 Category category = new Category();
                category.setCategoryId(rs.getString("CategoryId"));
                category.setCategoryName(rs.getString("CategoryName"));
                category.setDescription(rs.getString("Description"));
                category.setStatus(rs.getBoolean("Status"));
                category.setParentId(rs.getString("ParentId"));                
                listCategory.add(category);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        finally{
            ConnectionDB.closeConnection(conn, callSt);
        }
        return listCategory;
    }
    public Category getCategoryById(String categoryId)
    {
         Connection conn=null;
        CallableStatement callSt=null;
        Category category = new Category();
        try {
            conn=ConnectionDB.openConnection();
            callSt=conn.prepareCall("{call GetCategoryById(?)}");
            callSt.setString(1, category.getCategoryId());
            ResultSet rs=callSt.executeQuery();
            if (rs.next())
            {
                 category.setCategoryId(rs.getString("CategoryId"));
                category.setCategoryName(rs.getString("CategoryName"));
                category.setDescription(rs.getString("Description"));
              
                category.setStatus(rs.getBoolean("Status"));
                  category.setParentId(rs.getString("ParentId"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        finally{
            ConnectionDB.closeConnection(conn, callSt);
        }
        return category;
    }
    public boolean insertCategory(Category category)
    {
        Connection conn=null;
        CallableStatement callSt=null;
        boolean check= false;
        try {
            conn=ConnectionDB.openConnection();
            callSt=conn.prepareCall("{call InsertCategory(?,?,?,?,?)}");
            callSt.setString(1, category.getCategoryId());
            callSt.setString(2, category.getCategoryName());
            callSt.setString(3, category.getDescription());
            callSt.setString(4, category.getParentId());
            callSt.setBoolean(5, category.isStatus());
            callSt.executeUpdate();
            check= true;
   
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        finally{
            ConnectionDB.closeConnection(conn, callSt);
        }
        return check;
    }
     public boolean updateCategory(Category category)
    {
        Connection conn=null;
        CallableStatement callSt=null;
        boolean check= false;
        try {
            conn=ConnectionDB.openConnection();
            callSt=conn.prepareCall("{call UpdateCategory(?,?,?,?,?)}");
            callSt.setString(1, category.getCategoryId());
            callSt.setString(2, category.getCategoryName());
            callSt.setString(3, category.getDescription());
            callSt.setString(4, category.getParentId());
            callSt.setBoolean(5, category.isStatus());
            callSt.executeUpdate();
            check= true;
   
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        finally{
            ConnectionDB.closeConnection(conn, callSt);
        }
        return check;
    }
     public boolean deleteCategory(String categoryId)
     {
         Connection conn=null;
        CallableStatement callSt=null;
        boolean check= false;
         try {
             conn=ConnectionDB.openConnection();
            callSt=conn.prepareCall("{call DeleteCategory(?)}");
            callSt.setString(1, categoryId);
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
}
