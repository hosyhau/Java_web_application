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
public class GroupFunction {
    
    private int groupId;
    private int functionId;
    private boolean status;

    
    public GroupFunction() {
    }

    public GroupFunction(int groupId, int functionId, boolean status) {
        this.groupId = groupId;
        this.functionId = functionId;
        this.status = status;
    }

    public int getGroupId() {
        return groupId;
    }

    public void setGroupId(int groupId) {
        this.groupId = groupId;
    }

    public int getFunctionId() {
        return functionId;
    }

    public void setFunctionId(int functionId) {
        this.functionId = functionId;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    
}
