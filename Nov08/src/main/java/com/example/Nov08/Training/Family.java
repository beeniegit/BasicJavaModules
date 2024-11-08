package com.example.Nov08.Training;

import java.util.HashMap;

public class Family {
	
	private HashMap<String , Member> 구성원들 = new HashMap<>();
	
	/**
	 * 구성원을 입력받아 구성원들에 집어넣는 메서드
	 * @param 구성원
	 */
	public void play(Member 구성원) {
		구성원들.put(구성원.get이름(), 구성원);
	}
	
	/**
	 * 이름을 입력받아 구성원들에서 해당 이름의 'Member'값을 반환하는 메서드(없는 이름을 입력할 경우 알려줌)
	 * @param 이름
	 * @return
	 */
	public Member joy(String 이름) {
		try {
			return 구성원들.get(이름);
		} catch (Exception e) {
			System.out.println("이름을 잘못 입력하셨어요.");
			return null;
		}
		
	}

}
