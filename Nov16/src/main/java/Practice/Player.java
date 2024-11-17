package Practice;

public class Player {
	private String 이름;
	private int 나이;
	
	public void set이름(String 이름) {
		this.이름 = 이름;
	}
	
	public boolean set나이(int 나이) {
		if (나이 <= 35) {
			this.나이 = 나이;
			return true;
		} else {
			System.out.println("35세 이하의 나이를 설정해주세요.");
			return false;
		}
		
	}
	
	public String get이름() {
		return this.이름;
	}
	
}
