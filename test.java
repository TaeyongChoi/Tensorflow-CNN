package 공부;

public class HW1Demo {


	public static void main(String[] args) {
		Complex c1 = new Complex(2.0);//Complex 객체 생성
		c1.print();//print 메소드 호출
		Complex c2 = new Complex(1.5, 2.5);//Complex 객체 생성
		c2.print();//print 메소드 호출
		
		GolfClub g1 = new GolfClub();//GolfClub 객체 생성
		g1.print();//print 메소드 호출
		GolfClub g2 = new GolfClub(8);//GolfClub 객체 생성
		g2.print();//print 메소드 호출
		GolfClub g3 = new GolfClub("퍼터");//GolfClub 객체 생성
		g3.print();//print 메소드 호출
	}

}
