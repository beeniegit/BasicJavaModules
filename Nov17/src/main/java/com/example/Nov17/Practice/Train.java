package com.example.Nov17.Practice;

public class Train {
	
	private Line 노선;
	private int 칸;
	private int 차량번호;
	private int 생산년도;
	/**
	 * 인스턴스를 생성하고, 모든 속성을 초기화하는 메서드
	 * @param 노선
	 * @param 칸
	 * @param 차량번호
	 * @param 생산년도
	 */
	public Train(Line 노선, int 칸, int 차량번호, int 생산년도) {
		this.노선 = 노선;
		this.칸 = 칸;
		this.차량번호 = 차량번호;
		this.생산년도 = 생산년도;
	}
	/**
	 * 노선을 반환하는 메서드
	 * @return
	 */
	public Line get노선() {
		return 노선;
	}
	/**
	 * 칸을 반환하는 메서드
	 * @return
	 */
	public int get칸() {
		return 칸;
	}
	/**
	 * 차량번호를 반환하는 메서드
	 * @return
	 */
	public int get차량번호() {
		return 차량번호;
	}
	/**
	 * 생산년도를 반환하는 메서드
	 * @return
	 */
	public int get생산년도() {
		return 생산년도;
	}
 
 }
