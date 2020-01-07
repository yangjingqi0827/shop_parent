package com.yzit.project.shop.entity;

public class SysParameter {
    private Integer parameterId;

    private Integer shopType;

    private String parameterName;

    private Integer parameterSort;

    private String parameterValue;

    public Integer getParameterId() {
        return parameterId;
    }

    public void setParameterId(Integer parameterId) {
        this.parameterId = parameterId;
    }

    public Integer getShopType() {
        return shopType;
    }

    public void setShopType(Integer shopType) {
        this.shopType = shopType;
    }

    public String getParameterName() {
        return parameterName;
    }

    public void setParameterName(String parameterName) {
        this.parameterName = parameterName == null ? null : parameterName.trim();
    }

    public Integer getParameterSort() {
        return parameterSort;
    }

    public void setParameterSort(Integer parameterSort) {
        this.parameterSort = parameterSort;
    }

    public String getParameterValue() {
        return parameterValue;
    }

    public void setParameterValue(String parameterValue) {
        this.parameterValue = parameterValue == null ? null : parameterValue.trim();
    }
}