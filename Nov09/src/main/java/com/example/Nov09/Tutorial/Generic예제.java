package com.example.Nov09.Tutorial;

public class Generic예제<T> {
	
	public Object makeObject(T t) {
		return t;
	}
	
	public T makeData(Object o) {
		return (T) o;
	}

}
