package edu.miu.cs.cs425.inventorymgmt.model;


import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.time.LocalDate;

@Entity
@Table(name ="products")
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long productId;
    @NotNull
    @NotBlank
    @Column(nullable =false, unique =true)
    private String productNumber;
    @NotNull
    @NotBlank
    @Column(nullable =false)
    private String productName;
    @NotNull
    @NotBlank
    @Column(nullable =false)
    private String unitPrice;
    @NotNull
    @NotBlank
    @Column(nullable =false)
    private Integer quantityInStock;
    @DateTimeFormat(pattern ="yyyy-mm-dd")
    private LocalDate dateSupplied;


    public Product(){

    }

    public Product(Long productId, String productNumber, String productName, String unitPrice, Integer quantityInStock, LocalDate dateSupplied) {
        this.productId = productId;
        this.productNumber = productNumber;
        this.productName = productName;
        this.unitPrice = unitPrice;
        this.quantityInStock = quantityInStock;
        this.dateSupplied = dateSupplied;
    }

    public Product(String productNumber, String productName, String unitPrice, Integer quantityInStock, LocalDate dateSupplied) {
        this.productNumber = productNumber;
        this.productName = productName;
        this.unitPrice = unitPrice;
        this.quantityInStock = quantityInStock;
        this.dateSupplied = dateSupplied;
    }

    public Long getProductId() {
        return productId;
    }

    public void setProductId(Long productId) {
        this.productId = productId;
    }

    public String getProductNumber() {
        return productNumber;
    }

    public void setProductNumber(String productNumber) {
        this.productNumber = productNumber;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(String unitPrice) {
        this.unitPrice = unitPrice;
    }

    public Integer getQuantityInStock() {
        return quantityInStock;
    }

    public void setQuantityInStock(Integer quantityInStock) {
        this.quantityInStock = quantityInStock;
    }

    public LocalDate getDateSupplied() {
        return dateSupplied;
    }

    public void setDateSupplied(LocalDate dateSupplied) {
        this.dateSupplied = dateSupplied;
    }

    @Override
    public String toString() {
        return "Product{" +
                "productId=" + productId +
                ", productNumber='" + productNumber + '\'' +
                ", productName='" + productName + '\'' +
                ", unitPrice='" + unitPrice + '\'' +
                ", quantityInStock=" + quantityInStock +
                ", dateSupplied=" + dateSupplied +
                '}';
    }
}

