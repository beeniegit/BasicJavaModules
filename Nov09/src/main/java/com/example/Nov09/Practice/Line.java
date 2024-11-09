package com.example.Nov09.Practice;

import java.util.HashMap;

public class Line extends Model{
	
	private Integer 노선;
	private HashMap<Integer, Model> 차량목록 = new HashMap<>();
	
	/**
	 * 인스턴스를 생성하고, 모든 속성을 초기화하는 메서드
	 * @param 차종
	 * @param 시리얼
	 * @param 칸2
	 * @param 노선
	 */
	public Line(Integer 차종, Integer 시리얼, Integer 칸2, Integer 노선) {
		super(차종, 시리얼, 칸2);
		this.노선 = 노선;
	}
	
	/**
	 * 차량을 입력받아 차량목록에 집어넣는 메서드
	 * @param 차량
	 */
	public void 아잉(Model 차량) {
		차량목록.put(차량.get시리얼(), 차량);
	}
	
	/**
	 * 시리얼을 입력받아 해당 시리얼의 Model 값을 반환하는 메서드
	 * @param 시리얼
	 * @return
	 */
	public Model 오잉(Integer 시리얼) {
		return 차량목록.get(시리얼);
	}

	/**
	 * 시리얼을 입력받아 해당 시리얼의 Model 값을 반환하는 메서드
	 * 단, Model 의 칸 수가 입력받은 칸보다 작으면 null 을 반환하는 메서드
	 * @param 시리얼
	 * @param 칸2
	 * @return
	 */
	public Model 뿌잉(Integer 시리얼, Integer 칸2) {
		if (칸 < 칸2) {
			return null;
		} else {
			return 차량목록.get(시리얼);
		}
	}

}
