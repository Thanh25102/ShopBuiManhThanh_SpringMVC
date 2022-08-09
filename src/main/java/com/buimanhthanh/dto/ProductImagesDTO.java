package com.buimanhthanh.dto;

public class ProductImagesDTO {
    private Integer id;
    private Integer productId;
    private String url;

    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getProductId() {
        return this.productId;
    }

    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    public String getUrl() {
        return this.url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    @Override
    public String toString() {
        return "ProductImagesDTO{" +
                "id=" + id +
                ", productId=" + productId +
                ", url='" + url + '\'' +
                '}';
    }
}
