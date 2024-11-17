package Practice.HOmework;

public class Players {
	
	private String name;
	private int age;
	
	public void setName(String name) {
		this.name = name;
	}
	
	public boolean setAge(int age) {
		if (age >= 15 & age < 60) {
			this.age = age;
			return true;
		} else {
			System.out.println("15세 이상 60세 미만 나이를 설정해주세요.");
			return false;
		}

	}
	
	public String getName() {
		return name;
	}
}
