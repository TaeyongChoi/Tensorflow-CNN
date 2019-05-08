package 공부;

public class GolfClub {
	int num;
	String kind;
	
	public GolfClub() {
		num = 7;
		kind = "아이언";
	}//GolfClub 호출
	public GolfClub(int a) {
		num = a;
		kind = "아이언";
	}//GolfClub에 매개변수로 int형 1개 호출
	public GolfClub(String b) {
		kind = b;
	}//GolfClub에 매개변수로 string형 호출
	
	
	
	public void print() {
		if(kind =="아이언")//문자열을 받지 않으면 kind는 아이언이 된다
			System.out.println(num + "번 " + kind + "입니다.");
		else
			System.out.println(kind + "입니다.");
	}//print 메소드
}
