/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bkap.entity;

/**
 *
 * @author hien1_000
 */
public class Product {
    
    private String productId;
    private String productName;
    private String content;
    private String contentDetail;
    private String image;
    private int viewOfProduct;
    private float priceExport;
    private float priceImport;
    private int quantity;
    private String categoryId;
    private String colorId;
    private boolean status;
    private String country;
    private int year;
    private String guarantee;
    private String size;
    private String material;
    private float discount;
    private float pin;
    private String shape;
    private String manufacter;
    private int rate;
    private String colorName;
    public Product() {
    }

    public Product(String productId, String productName, String content, String contentDetail, String image, int viewOfProduct, float priceExport, float priceImport, int quantity, String categoryId, String colorId, boolean status, String country, int year, String guarantee, String size, String material, float discount, float pin, String shape, String manufacter, int rate, String colorName) {
        this.productId = productId;
        this.productName = productName;
        this.content = content;
        this.contentDetail = contentDetail;
        this.image = image;
        this.viewOfProduct = viewOfProduct;
        this.priceExport = priceExport;
        this.priceImport = priceImport;
        this.quantity = quantity;
        this.categoryId = categoryId;
        this.colorId = colorId;
        this.status = status;
        this.country = country;
        this.year = year;
        this.guarantee = guarantee;
        this.size = size;
        this.material = material;
        this.discount = discount;
        this.pin = pin;
        this.shape = shape;
        this.manufacter = manufacter;
        this.rate = rate;
        this.colorName = colorName;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getContentDetail() {
        return contentDetail;
    }

    public void setContentDetail(String contentDetail) {
        this.contentDetail = contentDetail;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public int getViewOfProduct() {
        return viewOfProduct;
    }

    public void setViewOfProduct(int viewOfProduct) {
        this.viewOfProduct = viewOfProduct;
    }

    public float getPriceExport() {
        return priceExport;
    }

    public void setPriceExport(float priceExport) {
        this.priceExport = priceExport;
    }

    public float getPriceImport() {
        return priceImport;
    }

    public void setPriceImport(float priceImport) {
        this.priceImport = priceImport;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(String categoryId) {
        this.categoryId = categoryId;
    }

    public String getColorId() {
        return colorId;
    }

    public void setColorId(String colorId) {
        this.colorId = colorId;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getGuarantee() {
        return guarantee;
    }

    public void setGuarantee(String guarantee) {
        this.guarantee = guarantee;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public float getDiscount() {
        return discount;
    }

    public void setDiscount(float discount) {
        this.discount = discount;
    }

    public float getPin() {
        return pin;
    }

    public void setPin(float pin) {
        this.pin = pin;
    }

    public String getShape() {
        return shape;
    }

    public void setShape(String shape) {
        this.shape = shape;
    }

    public String getManufacter() {
        return manufacter;
    }

    public void setManufacter(String manufacter) {
        this.manufacter = manufacter;
    }

    public int getRate() {
        return rate;
    }

    public void setRate(int rate) {
        this.rate = rate;
    }

    public String getColorName() {
        return colorName;
    }

    public void setColorName(String colorName) {
        this.colorName = colorName;
    }

}