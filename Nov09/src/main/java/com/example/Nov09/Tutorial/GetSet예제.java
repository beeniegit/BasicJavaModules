package com.example.Nov09.Tutorial;

public class GetSet예제 {
	/**
	 * private 속성은 인스턴스 바깥에서 사용할 수 없습니다.
	 * - 사용하기 위해서는 public 메서드를 만들어야 합니다. (Getter, Setter)
	 */
	private String name;
	private Integer age;
	
	/**
	 * 생성자는 여러개를 만들 수 있습니다.
	 * - 여러개의 생성자 중, 상황에 맞는 1가지만 사용됩니다.
	 */
	public GetSet예제() {
		
	}
	
	public GetSet예제(String name, Integer age) {
		this.name = name;
		this.age = age;
	}
	
	/**
	 * 속성을 밖에서 사용하기 위해서는 get 메서드로 속성을 return 합니다.
	 * @return
	 */
	public String getName() {
		return this.name;
	}
	
	/**
	 * 속성을 밖에서 사용하기 위해서는 get 메서드로 속성을 return 합니다.
	 * @return
	 */
	public Integer getAge() {
		return this.age;
	}
	
	/**
	 * 속성을 밖에서 수정하기 위해서는 set 메서드로 값을 입력받아 속성값을 설정합니다.
	 */
	public void setAll(String name, Integer age) {
		this.name = name;
		this.age = age;
	}
	
}
