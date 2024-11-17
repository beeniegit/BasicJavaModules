package com.example.Nov15.Tutorial;

/**
 * 속성을 생성하고 속성을 반환, 조건에 맞게 수정하는 클래스
 */
public class Human {
	private Long height;
	private Long weight;
	private Blood blood;
	
	/**
	 * 인스턴스를 생성하고, 모든 속성을 초기화하는 메서드
	 * @param height
	 * @param weight
	 * @param blood
	 */
	public Human(long height, long weight, Blood blood) {
		checkAndSetHeight(height);
		checkAndSetWeight(weight);
		this.blood = blood;
	}
	
	/**
	 * height 속성을 반환하는 메서드
	 * @return
	 */
	public long getHeight() {
		return height;
	}
	
	/**
	 * weight 속성을 반환하는 메서드
	 * @return
	 */
	public long getWeight() {
		return weight;
	}
	
	/**
	 * blood 속성을 반환하는 메서드
	 * @return
	 */
	public Blood getBlood() {
		return blood;
	}
	
	/**
	 * blood 를 받아 속성 blood 를 수정하는 메서드
	 * @param blood
	 */
	public void setBlood(Blood blood) {
		this.blood = blood;
	}
	
	/**
	 * height 를 받아 확인 후 적정 값일 경우 속성 height 를 수정하는 메서드
	 * @param height
	 */
	public void setHeight(long height) {
		checkAndSetHeight(height);
	}
	
	/**
	 * weight 를 받아 확인 후 적정 값일 경우 속성 weight 를 수정하는 메서드
	 * @param weight
	 */
	public void setWeight(long weight) {
		checkAndSetWeight(weight);
	}
	
	/**
	 * height 를 받아 확인 후 적정 값일 경우 속성 height 를 수정하는 메서드
	 * @param height
	 */
	private void checkAndSetHeight (long height) {
		if (height > 0 & height < 200) {
			this.height = height;
		} else {
			System.out.println("[EXCEPTION] 0 초과 200 미만의 long 데이터를 입력해야 합니다.");
		}
	}
	
	/**
	 * weight 를 받아 확인 후 적정 값일 경우 속성 weight 를 수정하는 메서드
	 * @param weight
	 */
	private void checkAndSetWeight (long weight) {
		if (weight > 0 & weight < 200) {
			this.weight = weight;
		} else {
			System.out.println("[EXCEPTION] 0 초과 200 미만의 long 데이터를 입력해야 합니다.");
		}
	}
	
}
