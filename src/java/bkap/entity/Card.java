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
public class Card {
    
    private String cardId;
    private String cardSeri;
    private float priceUnit;
    private String cardNumber;
    private boolean status;

    public Card() {
    }

    public Card(String cardId, String cardSeri, float priceUnit, String cardNumber, boolean status) {
        this.cardId = cardId;
        this.cardSeri = cardSeri;
        this.priceUnit = priceUnit;
        this.cardNumber = cardNumber;
        this.status = status;
    }

    public String getCardId() {
        return cardId;
    }

    public void setCardId(String cardId) {
        this.cardId = cardId;
    }

    public String getCardSeri() {
        return cardSeri;
    }

    public void setCardSeri(String cardSeri) {
        this.cardSeri = cardSeri;
    }

    public float getPriceUnit() {
        return priceUnit;
    }

    public void setPriceUnit(float priceUnit) {
        this.priceUnit = priceUnit;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    
}
