package edu.miu.cs.cs425.inventorymgmt.service.impl;

import edu.miu.cs.cs425.inventorymgmt.model.Product;
import edu.miu.cs.cs425.inventorymgmt.repository.ProductRepository;
import edu.miu.cs.cs425.inventorymgmt.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductRepository productRepository;


    @Override
    public List<Product> getAllProductsSorted() {
        return productRepository.findAll(Sort.by(Sort.Direction.DESC, "unitPrice"));
    }
}
