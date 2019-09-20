package com.boot.template.pojo;

/**
 * @author: shangshanshan
 * @date: 2019-4-18 13:44
 * @Description: 部门递归算法
 */
public class DepartmentRecursionDto {

    //父类外键
    private String parentFkCode;
    //父类名称
    private String parentName;
    //子类信息
    private DepartmentRecursionDto sonInfor;

    public String getParentFkCode() {
        return parentFkCode;
    }

    public void setParentFkCode(String parentFkCode) {
        this.parentFkCode = parentFkCode;
    }

    public String getParentName() {
        return parentName;
    }

    public void setParentName(String parentName) {
        this.parentName = parentName;
    }

    public DepartmentRecursionDto getSonInfor() {
        return sonInfor;
    }

    public void setSonInfor(DepartmentRecursionDto sonInfor) {
        this.sonInfor = sonInfor;
    }
}
