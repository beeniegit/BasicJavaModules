package com.example.Nov09.Practice;

public class Model {

	private Integer 차종;
	private Integer 시리얼;
	protected Integer 칸;
	
	/**
	 * 인스턴스를 생성하고, Model 클래스의 모든 속성을 초기화하는 메서드
	 * @param 차종
	 * @param 시리얼
	 * @param 칸2
	 */
	public Model(Integer 차종, Integer 시리얼, Integer 칸2) {
		this.차종 = 차종;
		this.시리얼 = 시리얼;
		this.칸 = 칸2;
	}
	
	/**
	 * 시리얼 속성을 반환하는 메서드
	 * @return
	 */
	public Integer get시리얼() {
		return 시리얼;
	}
}
