package com.example.Nov19.Homework;

public class Product {
	
	protected int 생산년도;
	protected String 제품이름;
	protected Type 종류;
	
	public Product(int 생산년도, String 제품이름, Type 종류) {
		this.생산년도 = 생산년도;
		this.제품이름 = 제품이름;
		this.종류 = 종류;
	}
	
	public int get생산년도() {
		return 생산년도;
	}
	
	public String get제품이름() {
		return 제품이름;
	}
	
	public Type get종류() {
		return 종류;
	}

}
