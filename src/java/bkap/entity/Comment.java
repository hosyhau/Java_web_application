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
public class Comment {
    private String commentId;
    private int userId;
    private String content;
    private String author;
    private boolean status;
    private String productId;
    private int quantityComment;

    public Comment() {
    }

    public Comment(String commentId,int userId, String content, String author, boolean status, String productId,int quantityComment) {
        this.commentId=commentId;
        this.userId = userId;
        this.content = content;
        this.author = author;
        this.status = status;
        this.productId=productId;
        this.quantityComment=quantityComment;
    }

    public String getCommentId() {
        return commentId;
    }

    public void setCommentId(String commentId) {
        this.commentId = commentId;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public int getQuantityComment() {
        return quantityComment;
    }

    public void setQuantityComment(int quantityComment) {
        this.quantityComment = quantityComment;
    }
    
    
}
