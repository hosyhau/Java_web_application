/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bkap.model;

import bkap.entity.Product;
import bkap.entity.Color;
import bkap.entity.Category;
import bkap.entity.ImageLink;
import bkap.util.ConnectionDB;
import bkap.util.Pagination;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 *
 * @author admin
 */
public class ProductModel {

    //Bussiness: Get All Product
    public List<Product> getAllProduct() {
        Connection conn = null;
        CallableStatement callSt = null;
        List<Product> listProduct = new ArrayList<>();
        try {
            conn = ConnectionDB.openConnection();
            callSt = conn.prepareCall("{call GetAllProduct()}");
            ResultSet rs = callSt.executeQuery();
            while (rs.next()) {
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
        } finally {
            ConnectionDB.closeConnection(conn, callSt);
        }
        return listProduct;
    }

    public Product getProductById(String productId) {
        Connection conn = null;
        CallableStatement callSt = null;
        Product product = new Product();
        try {
            conn = ConnectionDB.openConnection();
            callSt = conn.prepareCall("{call GetProductById(?)}");
            callSt.setString(1, productId);
            ResultSet rs = callSt.executeQuery();
            if (rs.next()) {
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
                product.setColorName(rs.getString("ColorName"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            ConnectionDB.closeConnection(conn, callSt);
        }
        return product;
    }

    public List<Product> getAllProductByCategory(String categoryId) {
        Connection conn = null;
        CallableStatement callSt = null;
        List<Product> listProduct = new ArrayList<>();
        Category category = new Category();
        try {
            conn = ConnectionDB.openConnection();
            callSt = conn.prepareCall("{call GetProductByCategory(?)}");
            callSt.setString(1, categoryId);
            ResultSet rs = callSt.executeQuery();
            while (rs.next()) {
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
        } finally {
            ConnectionDB.closeConnection(conn, callSt);
        }
        return listProduct;
    }
    public List<Product> getAllProductBySize(String size) {
        Connection conn = null;
        CallableStatement callSt = null;
        List<Product> listProduct = new ArrayList<>();
        Category category = new Category();
        try {
            conn = ConnectionDB.openConnection();
            callSt = conn.prepareCall("{call GetAllProductSize(?)}");
            callSt.setString(1, size);
            ResultSet rs = callSt.executeQuery();
            while (rs.next()) {
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
        } finally {
            ConnectionDB.closeConnection(conn, callSt);
        }
        return listProduct;
    }
     public List<Product> getAllProductByMaterial(String material){
        Connection conn = null;
        CallableStatement callSt = null;
        List<Product> listProduct = new ArrayList<>();
        Category category = new Category();
        try {
            conn = ConnectionDB.openConnection();
            callSt = conn.prepareCall("{call GetAllProductMaterial(?)}");
            callSt.setString(1, material);
            ResultSet rs = callSt.executeQuery();
            while (rs.next()) {
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
        } finally {
            ConnectionDB.closeConnection(conn, callSt);
        }
        return listProduct;
    }
     public List<Product> getAllProductPrice(float price) {
        Connection conn = null;
        CallableStatement callSt = null;
        List<Product> listProduct = new ArrayList<>();
        Category category = new Category();
        try {
            conn = ConnectionDB.openConnection();
            callSt = conn.prepareCall("{call GetAllProductPrice(?)}");
            callSt.setFloat(1, price);
            ResultSet rs = callSt.executeQuery();
            while (rs.next()) {
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
        } finally {
            ConnectionDB.closeConnection(conn, callSt);
        }
        return listProduct;
    }
    public HashMap getDataPagination(int page, int pageSize) {
        HashMap map = Pagination.getDataForPagination(page, pageSize, "Product", "ProductId",
                "getDataPagging.htm");
        return map;
    }

    public List<Product> topSeller() {
        Connection conn = null;
        CallableStatement callSt = null;
        List<Product> listProduct = new ArrayList<>();
        try {
            conn = ConnectionDB.openConnection();
            callSt = conn.prepareCall("{call TopSeller()}");
            ResultSet rs = callSt.executeQuery();
            while (rs.next()) {
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
        } finally {
            ConnectionDB.closeConnection(conn, callSt);
        }
        return listProduct;
    }
    public List<Product> getSizeProduct()
    {
        Connection conn = null;
        CallableStatement callSt= null;
        List<Product>listSize= new ArrayList<>();
        try {
            conn= ConnectionDB.openConnection();
            callSt= conn.prepareCall("{call GetSizeProduct()}");
            ResultSet rs= callSt.executeQuery();
            while (rs.next())
            {
                Product product = new Product();
                product.setSize(rs.getString("Size"));
                
                listSize.add(product);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        finally {
            ConnectionDB.closeConnection(conn, callSt);
        }
        return listSize;
    }
     public List<Product> getMaterialProduct()
    {
        Connection conn = null;
        CallableStatement callSt= null;
        List<Product>listMaterial= new ArrayList<>();
        try {
            conn= ConnectionDB.openConnection();
            callSt= conn.prepareCall("{call GetMaterialProduct()}");
            ResultSet rs= callSt.executeQuery();
            while (rs.next())
            {
                Product product = new Product();
                product.setMaterial(rs.getString("Material"));               
                listMaterial.add(product);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        finally {
            ConnectionDB.closeConnection(conn, callSt);
        }
        return listMaterial;
    }
      public List<Product> getManufacter()
    {
        Connection conn = null;
        CallableStatement callSt= null;
        List<Product>listManufacter= new ArrayList<>();
        try {
            conn= ConnectionDB.openConnection();
            callSt= conn.prepareCall("{call GetManufacterProduct()}");
            ResultSet rs= callSt.executeQuery();
            while (rs.next())
            {
                Product product = new Product();
                
                product.setManufacter(rs.getString("Manufacter"));
               
                listManufacter.add(product);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        finally {
            ConnectionDB.closeConnection(conn, callSt);
        }
        return listManufacter;
    }
      public List<Product> getManufacter_2()
    {
        Connection conn = null;
        CallableStatement callSt= null;
        List<Product>listManufacter= new ArrayList<>();
        try {
            conn= ConnectionDB.openConnection();
            callSt= conn.prepareCall("{call GetManufacterProduct_2()}");
            ResultSet rs= callSt.executeQuery();
            while (rs.next())
            {
                Product product = new Product();
                
                product.setManufacter(rs.getString("Manufacter"));
               
                listManufacter.add(product);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        finally {
            ConnectionDB.closeConnection(conn, callSt);
        }
        return listManufacter;
    }
        public List<Product> getManufacter_3(String manufacter)
    {
        Connection conn = null;
        CallableStatement callSt= null;
        List<Product>listManufacter= new ArrayList<>();
        try {
            conn= ConnectionDB.openConnection();
            callSt= conn.prepareCall("{call GetManufacter(?)}");
            callSt.setString(1, manufacter);
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
                listManufacter.add(product);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        finally {
            ConnectionDB.closeConnection(conn, callSt);
        }
        return listManufacter;
    }
       public boolean updateProduct(Product pro) {
        Connection conn = null;
        CallableStatement callSt = null;
        boolean check = false;
        try {
            conn = ConnectionDB.openConnection();
            callSt = conn.prepareCall("{call UpdateProduct(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)}");
            callSt.setString(1, pro.getProductId());
            callSt.setString(2, pro.getProductName());
            callSt.setString(3, pro.getContent());
            callSt.setString(4, pro.getContentDetail());
            callSt.setFloat(5, pro.getPriceExport());
            callSt.setFloat(6, pro.getPriceImport());
            callSt.setInt(7, pro.getQuantity());
            callSt.setString(8, pro.getCategoryId());
            callSt.setString(9, pro.getColorId());
            callSt.setBoolean(10, pro.isStatus());
            callSt.setString(11, pro.getCountry());
            callSt.setInt(12, pro.getYear());
            callSt.setString(13, pro.getGuarantee());
            callSt.setString(14, pro.getSize());
            callSt.setString(15, pro.getMaterial());
            callSt.setFloat(16, pro.getDiscount());
            callSt.setFloat(17, pro.getPin());
            callSt.setString(18, pro.getShape());
            callSt.setString(19, pro.getManufacter());
            callSt.setInt(20, pro.getRate());
            callSt.setString(21, pro.getImage());
            callSt.setInt(22, pro.getViewOfProduct());
            callSt.executeUpdate();
            check = true;
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            ConnectionDB.closeConnection(conn, callSt);
        }
        return check;
    }
       public boolean insertProduct(Product pro) {
        Connection conn = null;
        CallableStatement callSt = null;

        boolean check = false;
        try {
            conn = ConnectionDB.openConnection();
            callSt = conn.prepareCall("{call InsertProduct(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)}");
            callSt.setString(1, pro.getProductId());
            callSt.setString(2, pro.getProductName());
            callSt.setString(3, pro.getContent());
            callSt.setString(4, pro.getContentDetail());
            callSt.setFloat(5, pro.getPriceExport());
            callSt.setFloat(6, pro.getPriceImport());
            callSt.setInt(7, pro.getQuantity());
            callSt.setString(8, pro.getCategoryId());
            callSt.setString(9, pro.getColorId());
            callSt.setBoolean(10, pro.isStatus());
            callSt.setString(11, pro.getCountry());
            callSt.setInt(12, pro.getYear());
            callSt.setString(13, pro.getGuarantee());
            callSt.setString(14, pro.getSize());
            callSt.setString(15, pro.getMaterial());
            callSt.setFloat(16, pro.getDiscount());
            callSt.setFloat(17, pro.getPin());
            callSt.setString(18, pro.getShape());
            callSt.setString(19, pro.getManufacter());
            callSt.setInt(20, pro.getRate());
            callSt.setString(21, pro.getImage());
            callSt.setInt(22, pro.getViewOfProduct());
            callSt.executeUpdate();
            check = true;
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            ConnectionDB.closeConnection(conn, callSt);
        }
        return check;
    }
        public boolean deleteProduct(String productId) {
        Connection conn = null;
        CallableStatement callSt = null;
        boolean check = false;
        try {
            conn = ConnectionDB.openConnection();
            callSt = conn.prepareCall("{call DeleteProduct(?)}");
            callSt.setString(1, productId);
            callSt.executeUpdate();
            check = true;
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            ConnectionDB.closeConnection(conn, callSt);
        }
        return check;
    }

 public Product getProductByIdBackEnd(String productId) {
        Connection conn = null;
        CallableStatement callSt = null;
        Product product = new Product();
        try {
            conn = ConnectionDB.openConnection();
            callSt = conn.prepareCall("{call GetProductById(?)}");
            callSt.setString(1, productId);
            ResultSet rs = callSt.executeQuery();
            if (rs.next()) {                             
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
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            ConnectionDB.closeConnection(conn, callSt);
        }
        return product;
    }
  public List<Product> getColor()
    {
        Connection conn = null;
        CallableStatement callSt= null;
        List<Product>listColor= new ArrayList<>();
        try {
            conn= ConnectionDB.openConnection();
            callSt= conn.prepareCall("{call GetColorProduct()}");
          
            ResultSet rs= callSt.executeQuery();
            while (rs.next())
            {
                Product product = new Product();
                product.setColorId(rs.getString("ColorId"));
                
                listColor.add(product);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        finally {
            ConnectionDB.closeConnection(conn, callSt);
        }
        return listColor;
    }
}
