package edu.miu.cs.cs425.inventorymgmt.service;

import edu.miu.cs.cs425.inventorymgmt.model.Product;

import java.util.List;

public interface ProductService {
    public abstract List<Product> getAllProductsSorted();
}
