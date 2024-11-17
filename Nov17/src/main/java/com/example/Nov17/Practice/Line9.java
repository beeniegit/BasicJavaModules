package com.example.Nov17.Practice;

public class Line9 {
	
	private int 칸;
	private int 차량번호;
	private int 생산년도;
	
	/**
	 * 칸을 받아 속성을 수정하는 메서드
	 * @param 칸
	 */
	public void set칸(int 칸) {
		this.칸 = 칸;
	}
	/**
	 * 차량번호를 받아 속성을 수정하는 메서드
	 * @param 차량번호
	 */
	public void set차량번호(int 차량번호) {
		this.차량번호 = 차량번호;
	}
	/**
	 * 생산년도를 받아 속성을 수정하는 메서드
	 * @param 생산년도
	 */
	public void set생산년도(int 생산년도) {
		this.생산년도 = 생산년도;
	}
	/**
	 * 생산년도를 반환하는 메서드
	 * @return
	 */
	public int get생산년도() {
		return 생산년도;
	}
	
}
