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
public class PackageHistory {
    
    private int historyId;
    private int packageId;
    private String createDate;
    private float amount;
    private boolean status;

    public PackageHistory() {
    }

    public PackageHistory(int historyId, int packageId, String createDate, float amount, boolean status) {
        this.historyId = historyId;
        this.packageId = packageId;
        this.createDate = createDate;
        this.amount = amount;
        this.status = status;
    }

    public int getHistoryId() {
        return historyId;
    }

    public void setHistoryId(int historyId) {
        this.historyId = historyId;
    }

    public int getPackageId() {
        return packageId;
    }

    public void setPackageId(int packageId) {
        this.packageId = packageId;
    }

    public String getCreateDate() {
        return createDate;
    }

    public void setCreateDate(String createDate) {
        this.createDate = createDate;
    }

    public float getAmount() {
        return amount;
    }

    public void setAmount(float amount) {
        this.amount = amount;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    } 
    
}
