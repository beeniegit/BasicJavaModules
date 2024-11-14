package com.example.Nov14.Generics;

import java.util.ArrayList;
import java.util.List;

import lombok.Getter;
import lombok.Setter;
 
@Getter @Setter
public class DataList <T> {
	private List<T> list = new ArrayList<>();
	
	public T get(int index) {
		return this.list.get(index);
	}
	
	public void put(T value) {
		this.list.add(value);
	}
	
	public void printEverything() {
		for (T value : list) {
			System.out.println(value);
		}
	}
}
