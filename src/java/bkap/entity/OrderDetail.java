/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bkap.entity;

/**
 *
 * @author neo
 */
public class OrderDetail {
    
    private String orderId;
    private String productId;
    private float amount;
    private float quantity;
    private boolean status;

    public OrderDetail() {
    }

    public OrderDetail(String orderId, String productId, float amount, float quantity, boolean status) {
        this.orderId = orderId;
        this.productId = productId;
        this.amount = amount;
        this.quantity = quantity;
        this.status = status;
    }

    public String getOderId() {
        return orderId;
    }

    public void setOderId(String oderId) {
        this.orderId = oderId;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public float getAmount() {
        return amount;
    }

    public void setAmount(float amount) {
        this.amount = amount;
    }

    public float getQuantity() {
        return quantity;
    }

    public void setQuantity(float quantity) {
        this.quantity = quantity;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
    
    
}
