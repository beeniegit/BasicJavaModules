package com.example.Nov09.Tutorial;

import java.util.HashMap;

public class Generic예제2 {
	
	private HashMap<String, Object> map = new HashMap<>();

	public <T> void put (String name, T data) {
		this.map.put(name, data);
	}
	
	public <T> T get (String name) {
		try {
			return (T) this.map.get(name);
		} catch (Exception ex) {
			return null;
		}
	}
	
}
