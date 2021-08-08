package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
Product product=new Product("kalem",15,"yiyecek",56);

assert product.getProductName()!=null && product.getProductName().length()>2:"Ürünün adı minimum iki karakter olmalıdır.";
assert !product.getCategoryName().equalsIgnoreCase("yiyecek"):"Yiyecek kategorisinde ürün kabul edilmemektedir.";
assert product.getUnitsInStock()>0 && product.getUnitsInStock()<100 :"Ürünün stok adedi 100 ile 0 arasında olmalıdır.";
assert product.getUnitPrice()<10000:"Ürün ücreti 10000 tl nin altında olmalıdır.";

    }
}
