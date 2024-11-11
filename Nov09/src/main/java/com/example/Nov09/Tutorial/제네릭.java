package com.example.Nov09.Tutorial;

import java.util.HashMap;

import com.example.Nov09.Practice.KBO;
import com.example.Nov09.Practice.LCK;
import com.example.Nov09.Practice.PL;

public class 제네릭 {
	
	private HashMap<Integer, Object> 맵 = new HashMap<>();
	
	/**
	 * 킬, 골, 타율, a 를 입력받아 맵에 집어넣는 메서드
	 * @param <T>
	 * @param 킬
	 * @param 골
	 * @param 타율
	 * @param a
	 */
	public <T> void 롤(LCK 킬, PL 골, KBO 타율, T a) {
		맵.put(킬.킬(), a);
		맵.put(골.골(), a);
		맵.put(타율.타율(), a);
	}
	
	/**
	 * 킬을 입력받아 밸류값을 반환하는 메서드
	 * @param <T>
	 * @param 킬
	 * @return
	 */
	public <T> T 발로(Integer 킬) {
		try {
			return (T) 맵.get(킬);
		} catch(Exception ex) {
			return null;
		}
	}

	/**
	 * 골을 입력받아 밸류값을 반환하는 메서드
	 * @param <T>
	 * @param 골
	 * @return
	 */
	public <T> T 메이플(Integer 골) {
		try {
			return (T) 맵.get(골);
		} catch(Exception ex) {
			return null;
		}
	}
	
	/**
	 * 타율을 입력받아 밸류값을 반환하는 메서드
	 * @param <T>
	 * @param 타율
	 * @return
	 */
	public <T> T 아이작(Integer 타율) {
		try {
			return (T) 맵.get(타율);
		} catch(Exception ex) {
			return null;
		}
	}
}
