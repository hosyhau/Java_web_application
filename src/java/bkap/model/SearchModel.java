/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bkap.model;

import bkap.entity.Product;
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
public class SearchModel {
    public List<Product> searchProduct(String productName)
    {
        Connection conn= null;
        CallableStatement callSt= null;
        List<Product> listProduct= new ArrayList<>();
        try {
            conn=ConnectionDB.openConnection();
            callSt=conn.prepareCall("{call SearchProductByName(?)}");
            callSt.setString(1, productName);
            ResultSet rs= callSt.executeQuery();
            while (rs.next())
            {
                Product product = new Product();
                product.setProductId(rs.getString("ProductId"));
                product.setProductName(rs.getString("ProductName"));
                product.setContent(rs.getString("Content"));
                product.setContentDetail(rs.getString("ContentDetail"));
                product.setPriceExport(rs.getFloat("PriceExport"));
                product.setPriceImport(rs.getFloat("PriceImport"));
                product.setQuantity(rs.getInt("Quantity"));
                product.setCategoryId(rs.getString("CategoryId"));
                product.setColorId(rs.getString("ColorId"));
                product.setStatus(rs.getBoolean("Status"));
                product.setCountry(rs.getString("Country"));
                product.setYear(rs.getInt("Year"));
                product.setGuarantee(rs.getString("Guarantee"));
                product.setSize(rs.getString("Size"));
                product.setMaterial(rs.getString("Material"));
                product.setDiscount(rs.getFloat("Discount"));
                product.setPin(rs.getFloat("Pin"));
                product.setShape(rs.getString("Shape"));
                product.setManufacter(rs.getString("Manufacter"));
                product.setRate(rs.getInt("Rate"));
                product.setImage(rs.getString("Image"));
                product.setViewOfProduct(rs.getInt("ViewOfProduct"));
                listProduct.add(product);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }finally{
            ConnectionDB.closeConnection(conn, callSt);
        }
        return listProduct;
    }
    
}
