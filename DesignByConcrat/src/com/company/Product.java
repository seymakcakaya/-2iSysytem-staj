package com.company;

public class Product {
    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public int getUnitsInStock() {
        return unitsInStock;
    }

    public void setUnitsInStock(int unitsInStock) {
        this.unitsInStock = unitsInStock;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }

    private  String productName;
    private int unitsInStock;
            private String categoryName;
    private double unitPrice;

    public Product(String productName, int unitsInStock, String categoryName, double unitPrice) {
        this.productName = productName;
        this.unitsInStock = unitsInStock;
        this.categoryName = categoryName;
        this.unitPrice = unitPrice;
    }
}
