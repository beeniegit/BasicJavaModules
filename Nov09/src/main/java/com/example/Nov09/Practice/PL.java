package com.example.Nov09.Practice;

public class PL {
	
	private Integer 골;
	private Integer 도움;
	private Integer 득실;
	
	/**
	 * 인스턴스를 생성하고, 모든 속성을 초기화하는 메서드
	 * @param 골
	 * @param 도움
	 * @param 득실
	 */
	public PL(Integer 골, Integer 도움, Integer 득실) {
		this.골 = 골;
		this.도움 = 도움;
		this.득실 = 득실;
	}
	
	/**
	 * 골 속성을 반환하는 메서드
	 * @return
	 */
	public Integer 골() {
		return 골; 
	}

}
