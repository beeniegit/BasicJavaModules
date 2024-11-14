package com.example.Nov14.Payphone;

import java.util.ArrayList;
import java.util.List;

public class PlayerList <T> {
	
	private List<T> 리스트 = new ArrayList<>();
	
	public T get(int index) {
		return this.리스트.get(index);
	}
	
	public void put(T value) {
		this.리스트.add(value);
	}
	
	public void printer() {
		System.out.println(리스트.size());
	}

}
