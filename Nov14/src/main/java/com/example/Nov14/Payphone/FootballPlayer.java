package com.example.Nov14.Payphone;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
/**
 * Player 클래스의 속성 포함 모든 속성의 값을 반환, 수정, 초기화하는 메서드
 */
public class FootballPlayer extends Player {
	
	private String position;
	private int goal;
	private int assist;
	
	/**
	 * 인스턴스를 생성하고, 모든 속성을 초기화하는 메서드
	 * @param name
	 * @param age
	 * @param position
	 * @param goal
	 * @param assist
	 */
	public FootballPlayer(String name, int age, String position, int goal, int assist) {
		super(name, age);
		this.position = position;
		this.goal = goal;
		this.assist = assist;
	}
	

}
