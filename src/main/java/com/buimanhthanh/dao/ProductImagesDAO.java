package com.buimanhthanh.dao;

import com.buimanhthanh.entity.ProductImages;

import java.util.List;


public interface ProductImagesDAO {
    public List<ProductImages> getAllProductImages();
    public ProductImages getProductImages(int id);
    public void saveProductImages(ProductImages productImages);
    public void deleteProductImages(int id);
}
