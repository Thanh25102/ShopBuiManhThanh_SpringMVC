package com.buimanhthanh.dao.impl;

import com.buimanhthanh.entity.ProductImages;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public class ProductImagesDAOImpl implements com.buimanhthanh.dao.ProductImagesDAO {

    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public List<ProductImages> getAllProductImages() {
        Session session = sessionFactory.getCurrentSession();
        Query<ProductImages> theQuery = session.createQuery("from ProductImages",ProductImages.class);
        return theQuery.getResultList();
    }

    @Override
    public ProductImages getProductImages(int id) {
        return null;
    }

    @Override
    public void saveProductImages(ProductImages productImages) {

    }

    @Override
    public void deleteProductImages(int id) {

    }
}
