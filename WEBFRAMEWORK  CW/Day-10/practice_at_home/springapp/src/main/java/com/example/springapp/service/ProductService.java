package com.example.springapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.springapp.model.dayanandProduct;
import com.example.springapp.repository.dayanandProductRepo;

@Service
public class ProductService {
    @Autowired
    private dayanandProductRepo productRepo;

    public boolean saveProduct(dayanandProduct product)
    {
        try
        {
            productRepo.save(product);
            return true;
        }
        catch(Exception e)
        {
            return false;
        }
    }
    
    public List<dayanandProduct> findByCategoryList(String category)
    {
        return productRepo.findByCategoryList(category);
    }

    public dayanandProduct updateProduct(int productId, int quantityInStock)
    {
        productRepo.updateQuantity(productId, quantityInStock);
        return productRepo.findById(productId).orElse(null);
    }

    public dayanandProduct deleteProduct(int productId)
    {
        productRepo.deleteProduct(productId);
        return productRepo.findById(productId).orElse(null);
    }
}