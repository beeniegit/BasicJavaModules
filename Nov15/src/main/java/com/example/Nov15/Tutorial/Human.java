package com.example.Nov15.Tutorial;

/**
 * 
 */
public class Human {
	private Long height;
	private Long weight;
	private Blood blood;
	
	public Human(long height, long weight, Blood blood) {
		checkAndSetHeight(height);
		checkAndSetWeight(weight);
		this.blood = blood;
	}
	
	/**
	 * 
	 * @param blood
	 */
	public void setBlood(Blood blood) {
		this.blood = blood;
	}
	
	/**
	 * 
	 * @param height
	 */
	public void setHeight(long height) {
		checkAndSetHeight(height);
	}
	
	/**
	 * 
	 * @param weight
	 */
	public void setWeight(long weight) {
		checkAndSetWeight(weight);
	}
	
	/**
	 * 
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
	 * 
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
