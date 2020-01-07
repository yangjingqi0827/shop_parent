package com.yzit.project.shop.entity;

public class SysAttribute {
    private Integer attributeId;

    private Integer shopType;

    private String attributeName;

    private Integer attributeSort;

    private String attributeValue;

    public Integer getAttributeId() {
        return attributeId;
    }

    public void setAttributeId(Integer attributeId) {
        this.attributeId = attributeId;
    }

    public Integer getShopType() {
        return shopType;
    }

    public void setShopType(Integer shopType) {
        this.shopType = shopType;
    }

    public String getAttributeName() {
        return attributeName;
    }

    public void setAttributeName(String attributeName) {
        this.attributeName = attributeName == null ? null : attributeName.trim();
    }

    public Integer getAttributeSort() {
        return attributeSort;
    }

    public void setAttributeSort(Integer attributeSort) {
        this.attributeSort = attributeSort;
    }

    public String getAttributeValue() {
        return attributeValue;
    }

    public void setAttributeValue(String attributeValue) {
        this.attributeValue = attributeValue == null ? null : attributeValue.trim();
    }
}