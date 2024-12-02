package com.example.Nov19.Homework;

public class Furniture extends Product {
	
	public Furniture(int 생산년도, String 제품이름, Type 종류) {
		super(생산년도, 제품이름, 종류);
	}
	public void set생산년도(int 생산년도) {
		chechAndSet생산년도(생산년도);
	}
	
	public void set제품명(String 제품이름) {
		this.제품이름 = 제품이름;
	}
	
	public void set종류(Type 종류) {
		this.종류 = 종류;
	}
	
	public void chechAndSet생산년도(int 생산년도) {
		if (생산년도 > 220101) {
			this.생산년도 = 생산년도;
		} else {
			System.out.println("2022년 1월 1일 이후 생산만 등록 가능합니다.");
		}
	}
}
