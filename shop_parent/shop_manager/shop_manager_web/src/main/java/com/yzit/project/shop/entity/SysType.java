package com.yzit.project.shop.entity;

import java.util.List;

public class SysType {
    private Integer typeId;

    private String typeName;

    private Integer typeSort;

    private Integer typePid;

    private String typeTitle;

    private String typeKeyword;

    private String typeDesc;

    private List<SysType> children;

    public List<SysType> getChildren() {
        return children;
    }

    public void setChildren(List<SysType> children) {
        this.children = children;
    }

    public Integer getTypeId() {
        return typeId;
    }

    public void setTypeId(Integer typeId) {
        this.typeId = typeId;
    }

    public String getTypeName() {
        return typeName;
    }

    public void setTypeName(String typeName) {
        this.typeName = typeName == null ? null : typeName.trim();
    }

    public Integer getTypeSort() {
        return typeSort;
    }

    public void setTypeSort(Integer typeSort) {
        this.typeSort = typeSort;
    }

    public Integer getTypePid() {
        return typePid;
    }

    public void setTypePid(Integer typePid) {
        this.typePid = typePid;
    }

    public String getTypeTitle() {
        return typeTitle;
    }

    public void setTypeTitle(String typeTitle) {
        this.typeTitle = typeTitle == null ? null : typeTitle.trim();
    }

    public String getTypeKeyword() {
        return typeKeyword;
    }

    public void setTypeKeyword(String typeKeyword) {
        this.typeKeyword = typeKeyword == null ? null : typeKeyword.trim();
    }

    public String getTypeDesc() {
        return typeDesc;
    }

    public void setTypeDesc(String typeDesc) {
        this.typeDesc = typeDesc == null ? null : typeDesc.trim();
    }
}