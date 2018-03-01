/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bkap.controller;

import bkap.entity.Category;
import bkap.entity.Color;
import bkap.entity.ImageLink;
import bkap.entity.Product;
import bkap.model.CategoryModel;
import bkap.model.ImageLinkModel;
import bkap.model.ProductModel;
import bkap.model.SearchModel;
import bkap.util.ConnectionDB;
import java.io.File;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author admin
 */
@Controller
@RequestMapping(value = "/product", method = RequestMethod.GET)
public class ProductController {

    private ProductModel productModel;
    private CategoryModel categoryModel;
    private SearchModel searchModel;
    private ImageLinkModel imageModel;
    public ProductController() {
        productModel = new ProductModel();
        categoryModel = new CategoryModel();
        searchModel = new SearchModel();
        imageModel = new ImageLinkModel();
    }
    // phan chuyen trang den listProduct
    @RequestMapping(value = "/getAll")
    public ModelAndView getDataProduct() {
        ModelAndView model = new ModelAndView("FrontEnd/listProduct");
        int sizeRowofPage = 9;
        HashMap map = productModel.getDataPagination(1, sizeRowofPage);
        String url = (String) map.get("url");
        List<Product> listProduct = new ArrayList<>();
        try {
            ResultSet rs = (ResultSet) map.get("rs");
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
            Connection conn = (Connection) map.get("conn");
            CallableStatement callSt = (CallableStatement) map.get("callSt");
            ConnectionDB.closeConnection(conn, callSt);
        }
        // phan lay size
        List<Product>listSize=productModel.getSizeProduct();
        model.getModelMap().put("listSize", listSize);
        // phan lay material
        List<Product>listMaterial=productModel.getMaterialProduct();
        model.getModelMap().put("listMaterial", listMaterial);
        //phan lay manufacter
        List<Product>listManufacter=productModel.getManufacter();
        model.getModelMap().put("listManufacter", listManufacter);
        List<Product>listManufacter_2=productModel.getManufacter_2();
        model.getModelMap().put("listManufacter_2", listManufacter_2);
        // lay danh sach san pham top seller
        List<Product> listTopSeller= productModel.topSeller();
        model.getModelMap().put("listTopSeller", listTopSeller);
        // lay all category
        List<Category> listCategory = categoryModel.getAllCategory();
        model.getModelMap().put("listCategory", listCategory);
        // get All product
        model.getModelMap().put("listProduct", listProduct);
        model.getModelMap().put("url", url);
        return model;
    }
    // phan trang
    @RequestMapping(value = "/getDataPagging")
    public ModelAndView getDataProductPagging(@RequestParam("page") String page) {
        ModelAndView model = new ModelAndView("FrontEnd/listProduct");
        int pageInt = Integer.parseInt(page);
        int sizeRowofPage = 9;
        HashMap map = productModel.getDataPagination(pageInt, sizeRowofPage);
        String url = (String) map.get("url");
        List<Product> listProduct = new ArrayList<>();
        try {
            ResultSet rs = (ResultSet) map.get("rs");
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
            Connection conn = (Connection) map.get("conn");
            CallableStatement callSt = (CallableStatement) map.get("callSt");
            ConnectionDB.closeConnection(conn, callSt);
        }
        List<Product>listSize=productModel.getSizeProduct();
        model.getModelMap().put("listSize", listSize);
        // phan lay material
        List<Product>listMaterial=productModel.getMaterialProduct();
        model.getModelMap().put("listMaterial", listMaterial);
        //phan lay manufacter
        List<Product>listManufacter=productModel.getManufacter();
        model.getModelMap().put("listManufacter", listManufacter);
        List<Product>listManufacter_2=productModel.getManufacter_2();
        model.getModelMap().put("listManufacter_2", listManufacter_2);
        // lay danh sach san pham top seller
        List<Product> listTopSeller= productModel.topSeller();
        model.getModelMap().put("listTopSeller", listTopSeller);
        // lay all category
        List<Category> listCategory = categoryModel.getAllCategory();
        model.getModelMap().put("listCategory", listCategory);
        // get All product
        model.getModelMap().put("listProduct", listProduct);
        model.getModelMap().put("url", url);
        return model;
    }
    // san pham chi tiet
    @RequestMapping(value = "/initSingle")
    public ModelAndView getProductById(@RequestParam("productID") String productId) {
        ModelAndView model = new ModelAndView("FrontEnd/single");
        Product single = productModel.getProductById(productId);
        model.addObject("single", single);
        List<ImageLink> listImage = imageModel.getAllImageLink(productId);
        model.getModelMap().put("listImage",listImage);
        return model;
    }
    // phan lay nhieu anh cua san pham chi tiet
  
    // lay danh sach san pham theo loai
    @RequestMapping(value="/getAllCategogy")
    public ModelAndView getAllCateogy(@RequestParam("categoryId")String categoryId)
    {
        ModelAndView model= new ModelAndView("FrontEnd/listCate");
        int sizeRowofPage = 9;
        HashMap map = productModel.getDataPagination(1, sizeRowofPage);
        String url = (String) map.get("url");
 
        List<Product> listCate= productModel.getAllProductByCategory(categoryId);
        model.getModelMap().put("listCate", listCate);
        List<Category> listCategory = categoryModel.getAllCategory();
        model.getModelMap().put("listCategory", listCategory);
         // phan lay size
          List<Product>listManufacter=productModel.getManufacter();
        model.getModelMap().put("listManufacter", listManufacter);
        List<Product>listManufacter_2=productModel.getManufacter_2();
        model.getModelMap().put("listManufacter_2", listManufacter_2);
        List<Product>listSize=productModel.getSizeProduct();
        model.getModelMap().put("listSize", listSize);
        // phan lay material
        List<Product>listMaterial=productModel.getMaterialProduct();
        model.getModelMap().put("listMaterial", listMaterial);
         model.getModelMap().put("listCate", listCate);
        model.getModelMap().put("url", url);
        return model;
    }
     @RequestMapping(value = "/getDataPaggingCategory")
    public ModelAndView getDataPaggingCategory(@RequestParam("page,categoryId") String page,String categoryId) {
        ModelAndView model = new ModelAndView("FrontEnd/listCate");
        int pageInt = Integer.parseInt(page);
        int sizeRowofPage = 9;
        HashMap map = productModel.getDataPagination(pageInt, sizeRowofPage);
        String url = (String) map.get("url");
        List<Product> listCate= productModel.getAllProductByCategory(categoryId);
        List<Product>listSize=productModel.getSizeProduct();
        model.getModelMap().put("listSize", listSize);
        // phan lay material
        List<Product>listMaterial=productModel.getMaterialProduct();
        model.getModelMap().put("listMaterial", listMaterial);
        //phan lay manufacter
        List<Product>listManufacter=productModel.getManufacter();
        model.getModelMap().put("listManufacter", listManufacter);
        List<Product>listManufacter_2=productModel.getManufacter_2();
        model.getModelMap().put("listManufacter_2", listManufacter_2);
        // lay danh sach san pham top seller
        List<Product> listTopSeller= productModel.topSeller();
        model.getModelMap().put("listTopSeller", listTopSeller);
        // lay all category
        List<Category> listCategory = categoryModel.getAllCategory();
        model.getModelMap().put("listCategory", listCategory);
        // get All product
        model.getModelMap().put("listCate", listCate);
        model.getModelMap().put("url", url);
        return model;
    }
    // phan tim kiem san pham
    @RequestMapping(value="/byName",method=RequestMethod.POST)
    public ModelAndView detailProduct(@RequestParam("productName")String productName)
    {
        ModelAndView model = new ModelAndView("FrontEnd/search");
        List<Product> listProduct =searchModel.searchProduct(productName);
        model.addObject("listProduct",listProduct);
        // phan lay size
        List<Product>listSize=productModel.getSizeProduct();
        model.getModelMap().put("listSize", listSize);
        // phan lay material
        List<Product>listMaterial=productModel.getMaterialProduct();
        model.getModelMap().put("listMaterial", listMaterial);
        //phan lay manufacter
        List<Product>listManufacter=productModel.getManufacter();
        model.getModelMap().put("listManufacter", listManufacter);
        List<Product>listManufacter_2=productModel.getManufacter_2();
        model.getModelMap().put("listManufacter_2", listManufacter_2);
        // lay danh sach san pham top seller
        List<Product> listTopSeller= productModel.topSeller();
        model.getModelMap().put("listTopSeller", listTopSeller);
        // lay all category
        List<Category> listCategory = categoryModel.getAllCategory();
        model.getModelMap().put("listCategory", listCategory);
        return model;
    }
   @RequestMapping(value="/getManufacter")
   public ModelAndView getManufacter(@RequestParam("Manufacter")String manufacter)
   {
       ModelAndView model =new ModelAndView("FrontEnd/listManufacter");
       List<Product> listProductMenufacter = productModel.getManufacter_3(manufacter);
       model.getModelMap().put("listProductMenufacter", listProductMenufacter);
       List<Product>listSize=productModel.getSizeProduct();
        model.getModelMap().put("listSize", listSize);
        // phan lay material
        List<Product>listMaterial=productModel.getMaterialProduct();
        model.getModelMap().put("listMaterial", listMaterial);
        //phan lay manufacter
        List<Product>listManufacter=productModel.getManufacter();
        model.getModelMap().put("listManufacter", listManufacter);
        List<Product>listManufacter_2=productModel.getManufacter_2();
        model.getModelMap().put("listManufacter_2", listManufacter_2);
        // lay danh sach san pham top seller
        List<Product> listTopSeller= productModel.topSeller();
        model.getModelMap().put("listTopSeller", listTopSeller);
        // lay all category
        List<Category> listCategory = categoryModel.getAllCategory();
        model.getModelMap().put("listCategory", listCategory);
       return model;
   }
   @RequestMapping(value="/getProductPrice")
   public ModelAndView getProductPrice(@RequestParam("Price")float price)
   {
       ModelAndView model = new ModelAndView("FrontEnd/listPrice");
       List<Product>listPrice = productModel.getAllProductPrice(price);
       model.getModelMap().put("listPrice", listPrice);
       return model;
       }
    @RequestMapping(value="/getProductMaterial")
   public ModelAndView getProductPrice(@RequestParam("Material")String material)
   {
       ModelAndView model = new ModelAndView("FrontEnd/listMaterial");
       List<Product>listMaterial = productModel.getAllProductByMaterial(material);
       model.getModelMap().put("listMaterial", listMaterial);
       return model;
       }
    @RequestMapping(value="/getProductSize")
   public ModelAndView getProductBySize(@RequestParam("Size")String size)
   {
       ModelAndView model = new ModelAndView("FrontEnd/listSize");
       List<Product>listSize = productModel.getAllProductBySize(size);
       model.getModelMap().put("listSize", listSize);
       return model;
       }
}
