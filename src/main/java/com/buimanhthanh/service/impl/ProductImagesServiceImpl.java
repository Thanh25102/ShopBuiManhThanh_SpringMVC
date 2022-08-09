package com.buimanhthanh.service.impl;

import com.buimanhthanh.dao.ProductImagesDAO;
import com.buimanhthanh.dto.ProductImagesDTO;
import com.buimanhthanh.service.ProductImagesService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProductImagesServiceImpl implements ProductImagesService {
    @Autowired
    private ProductImagesDAO productImagesDAO;
    @Autowired
    private ModelMapper modelMapper;


    @Override
    @Transactional
    public List<ProductImagesDTO> getAllProductImages() {
        List<ProductImagesDTO> list = new ArrayList<>();
        productImagesDAO.getAllProductImages().forEach(p->list.add(modelMapper.map(p, ProductImagesDTO.class)));
        return list;
    }
}
