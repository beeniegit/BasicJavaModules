package Practice;

public class Person {
	private String 이름;
	private int 나이;
	private long 키;
	private long 체중;
	private BloodType 혈액형;
	private String 취미;
	
	public Person(String 이름, int 나이, long 키, long 체중, BloodType 혈액형, String 취미) {
		this.이름 = 이름;
		this.나이 = 나이;
		this.키 = 키;
		this.체중 = 체중;
		this.혈액형 = 혈액형;
		this.취미 = 취미;
	}
	
	public String get이름() {
		return this.이름;
	}
	
	public int get나이() {
		return this.나이;
	}
	
	public String get취미() {
		return this.취미;
	}
}
