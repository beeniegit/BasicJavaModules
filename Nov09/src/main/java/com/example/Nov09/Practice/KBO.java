package com.example.Nov09.Practice;

public class KBO {
	
	private Integer 타율;
	private Integer 장타율;
	private Integer 홈런;
	
	/**
	 * 인스턴스를 생성하고, 모든 속성을 초기화하는 메서드
	 * @param 타율
	 * @param 장타율
	 * @param 홈런
	 */
	public KBO(Integer 타율, Integer 장타율, Integer 홈런) {
		this.타율 = 타율;
		this.장타율 = 장타율;
		this.홈런 = 홈런;
	}
	
	/**
	 * 타율 속성을 반환하는 메서드
	 * @return
	 */
	public Integer 타율() {
		return 타율;
	}

}
