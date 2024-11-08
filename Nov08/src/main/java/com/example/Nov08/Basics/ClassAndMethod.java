package com.example.Nov08.Basics;

public class ClassAndMethod {
	
	/**
	 * "Hello, World!" 를 출력합니다.
	 */
	public void sample() {
		System.out.println("Hello, World!");
	}
	
	/**
	 * 입력받은 message 값을 출력합니다.
	 * @param message
	 */
	public void printer(String message) {
		System.out.println(message);
	}
	
	/**
	 * 입력받은 count 횟수만큼 입력받은 message 값을 출력합니다.
	 * @param count
	 * @param message
	 */
	public void printers(int count, String message) {
		/**
		 * if (조건식) {
		 *     작업 내용
		 * }
		 */
		if (count >= 10) {
			System.out.println("너무 많이 출력하는데요..");
		}
		
		/**
		 * for (int i = 시작값; i < 기준값 (조건문 : true / false); i++) {
		 * 
		 *     반복작업 내용
		 *     
		 * }
		 */
		for (int i=0; i<count; i++) {
			System.out.println(message);
		}
	}
	
	/**
	 * 입력받은 count 횟수만큼 입력받은 message 값을 출력합니다.
	 * @param count
	 * @param message
	 */
	public void printwhile(int count, String message) {
		int cnt = 0;
		
		/**
		 * while (조건문 : true / false) {
		 * 
		 *     반복작업 내용
		 * 
		 * }
		 */
		while (cnt != count) {
			cnt += 1;
			System.out.println(message);
		}
		
	}
	
}
