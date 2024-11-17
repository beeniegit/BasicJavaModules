package Practice.HOmework;

public class People {
	
	private String name;
	private int age;
	private long height;
	private long weight;
	private String hobby;
	
	public People(String name, int age, long height, long weight, String hobby) {
		this.name = name;
		this.age = age;
		this.height = height;
		this.weight = weight;
		this.hobby = hobby;
	}
	
	public String getName() {
		return this.name;
	}
	
	public int getAge() {
		return this.age;
	}
	
	public long getHeight() {
		return this.height;
	}
	
	public long getWeight() {
		return this.weight;
	}
	
	public String getHobby() {
		return this.hobby;
	}

}
