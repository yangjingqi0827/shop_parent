package com.yzit.project.shop.entity;

public class SysBrand {
    private Integer brandId;

    private String brandName;

    private Integer brandType;

    private String brandLogo;

    private String brandWangzhi;

    private Integer brandSort;

    private String brandSug;

    public Integer getBrandId() {
        return brandId;
    }

    public void setBrandId(Integer brandId) {
        this.brandId = brandId;
    }

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName == null ? null : brandName.trim();
    }

    public Integer getBrandType() {
        return brandType;
    }

    public void setBrandType(Integer brandType) {
        this.brandType = brandType;
    }

    public String getBrandLogo() {
        return brandLogo;
    }

    public void setBrandLogo(String brandLogo) {
        this.brandLogo = brandLogo == null ? null : brandLogo.trim();
    }

    public String getBrandWangzhi() {
        return brandWangzhi;
    }

    public void setBrandWangzhi(String brandWangzhi) {
        this.brandWangzhi = brandWangzhi == null ? null : brandWangzhi.trim();
    }

    public Integer getBrandSort() {
        return brandSort;
    }

    public void setBrandSort(Integer brandSort) {
        this.brandSort = brandSort;
    }

    public String getBrandSug() {
        return brandSug;
    }

    public void setBrandSug(String brandSug) {
        this.brandSug = brandSug == null ? null : brandSug.trim();
    }
}