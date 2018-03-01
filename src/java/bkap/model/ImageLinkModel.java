/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bkap.model;
import bkap.entity.ImageLink;
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
public class ImageLinkModel {

    public List<ImageLink> getAllImageLink(String productId) {
        Connection conn = null;
        CallableStatement callSt = null;
        List<ImageLink> listImage = new ArrayList<>();
        
        try {
            conn = ConnectionDB.openConnection();
            callSt = conn.prepareCall("{call GetAllImageLink(?)}");
            ResultSet rs = callSt.executeQuery();
            while (rs.next()) {
                ImageLink image = new ImageLink();
                image.setImageId(rs.getString("ImageLinkId"));
                image.setURL(rs.getString("URL"));
                image.setDescription(rs.getString("Description"));
                image.setStatus(rs.getBoolean("Status"));
                image.setProductId(rs.getString("ProductId"));
                listImage.add(image);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            ConnectionDB.closeConnection(conn, callSt);
        }
        return listImage;
    }

    public boolean insertImageLink(ImageLink imageLink) {
        Connection conn = null;
        CallableStatement callSt = null;
        boolean check = false;
        try {
            conn = ConnectionDB.openConnection();
            callSt = conn.prepareCall("{call InsertImageLink(?,?,?,?,?)}");
            callSt.setString(1, imageLink.getImageId());
            callSt.setString(2, imageLink.getURL());
            callSt.setString(3, imageLink.getDescription());
            callSt.setBoolean(4, imageLink.isStatus());
            callSt.setString(5, imageLink.getProductId());
            callSt.executeUpdate();
            check = true;
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            ConnectionDB.closeConnection(conn, callSt);
        }
        return check;
    }

    public boolean updateImageLink(ImageLink imageLink) {
        Connection conn = null;
        CallableStatement callSt = null;
        boolean check = false;
        try {
            conn = ConnectionDB.openConnection();
            callSt = conn.prepareCall("{call UpdateImageLink(?,?,?,?,?)}");
            callSt.setString(1, imageLink.getImageId());
            callSt.setString(2, imageLink.getURL());
            callSt.setString(3, imageLink.getDescription());
            callSt.setBoolean(4, imageLink.isStatus());
            callSt.setString(5, imageLink.getProductId());
            callSt.executeUpdate();
            check = true;
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            ConnectionDB.closeConnection(conn, callSt);
        }
        return check;
    }

    public boolean deleteImageLink(String imageId) {
        Connection conn = null;
        CallableStatement callSt = null;
        boolean check = false;
        try {
            conn = ConnectionDB.openConnection();
            callSt = conn.prepareCall("{call DeleteImageLink(?)}");
            callSt.setString(1, imageId);
            callSt.executeUpdate();
            check = true;
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            ConnectionDB.closeConnection(conn, callSt);
        }
        return check;
    }

    public ImageLink getImageLinkById(String imageLinkId) {
         Connection conn = null;
        CallableStatement callSt = null;
       
          ImageLink image = new ImageLink();
        try {
            conn = ConnectionDB.openConnection();
            callSt = conn.prepareCall("{call GetImageLinkId(?)}");
            callSt.setString(1, imageLinkId);
            ResultSet rs = callSt.executeQuery();
            if (rs.next()) {
              
                image.setImageId(rs.getString("ImageLinkId"));
                image.setURL(rs.getString("URL"));
                image.setDescription(rs.getString("Description"));
                image.setStatus(rs.getBoolean("Status"));
                image.setProductId(rs.getString("ProductId"));
               
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            ConnectionDB.closeConnection(conn, callSt);
        }
        return image;
    }
}
