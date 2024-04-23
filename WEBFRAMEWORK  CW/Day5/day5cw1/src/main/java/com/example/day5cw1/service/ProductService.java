package com.example.day5cw1.service;

import org.springframework.stereotype.Service;

import com.example.day5cw1.model.dayanandProduct;
import com.example.day5cw1.repository.dayanandProductRepo;

@Service
public class ProductService {
    public dayanandProductRepo productRepo;
    public ProductService(dayanandProductRepo productRepo)
    {
        this.productRepo = productRepo;
    }
    public boolean saveProduct(dayanandProduct product)
    {
        try
        {
            productRepo.save(product);
        }
        catch(Exception e)
        {
            return false;
        }
        return true;
    }
    public boolean updateDetails(int id,dayanandProduct product)
    {
        if(this.getProductById(id)==null)
        {
            return false;
        }
        try{
            productRepo.save(product);
        }
        catch(Exception e)
        {
            return false;
        }
        return true;
    }
    public boolean deleteProduct(int id)
    {
        if(this.getProductById(id) == null)
        {
            return false;
        }
        productRepo.deleteById(id);
        return true;
    }
    public dayanandProduct getProductById(int id)
    {
        return productRepo.findById(id).orElse(null);
    }
}
