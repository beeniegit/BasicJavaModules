package com.example.Nov19.Homework;

public class Furniture {
	
	private int 생산년도;
	private String 제품명;
	
	public Furniture(int 생산년도, String 제품명) {
		this.생산년도 = 생산년도;
		this.제품명 = 제품명;
	}
	
	public int get생산년도() {
		return 생산년도;
	}
	
	public String get제품명() {
		return 제품명;
	}
	
	public void set생산년도(int 생산년도) {
		this.생산년도 = 생산년도;
	}
	
	public void set제품명(String 제품명) {
		this.제품명 = 제품명;
	}

}
