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
public class PaymentType {
    
    private String paymentTypeId;
    private String paymentName;
    private int displayNumber;
    private boolean status;

    public PaymentType() {
    }

    public PaymentType(String paymentTypeId, String paymentName, int displayNumber, boolean status) {
        this.paymentTypeId = paymentTypeId;
        this.paymentName = paymentName;
        this.displayNumber = displayNumber;
        this.status = status;
    }

    public String getPaymentTypeId() {
        return paymentTypeId;
    }

    public void setPaymentTypeId(String paymentTypeId) {
        this.paymentTypeId = paymentTypeId;
    }

    public String getPaymentName() {
        return paymentName;
    }

    public void setPaymentName(String paymentName) {
        this.paymentName = paymentName;
    }

    public int getDisplayNumber() {
        return displayNumber;
    }

    public void setDisplayNumber(int displayNumber) {
        this.displayNumber = displayNumber;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
    
    
}
