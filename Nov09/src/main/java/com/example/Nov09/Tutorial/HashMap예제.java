package com.example.Nov09.Tutorial;

import java.util.HashMap;

public class HashMap예제 {
	/**
	 * HashMap<K, V> 이란, (Key, Value) 의 쌍으로 이루어진 데이터 집합입니다.
	 */
	private HashMap<String, Object> 데이터집합;
	
	/**
	 * HashMap<K, V> 에 데이터를 입력할 때는, (Key, Value) 의 쌍이 필요합니다.
	 * - 데이터를 입력할 때는 'put(K, V)' 메서드를 사용합니다.
	 * @param K
	 * @param V
	 */
	public void 데이터입력(String K, Object V) {
		String key = K;
		Object value = V;
		
		데이터집합.put(key, value);
	}
	
	/**
	 * HashMap<K, V> 에서 데이터를 추출하려면, 추출할 데이터 쌍의 Key 값이 필요합니다.
	 * - 데이터를 추출할 때는 'get(K)' 메서드를 사용합니다.
	 * - 'get(K)' 메서드는 오류가 날 수 있으므로, 예외 처리를 같이 수행하면 좋습니다 :)
	 * @param Key
	 * @return
	 */
	public Object 데이터추출(String key) {
		try {
			Object value = 데이터집합.get(key);
			return value;
		} catch (Exception e) {
			return null;
		}
	}
	
}
