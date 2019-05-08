package 공부;

public class Complex {
	public double num,com;

	public Complex(double d) {
		num = d;
		com = 0.0;
	}//Complex에 매개변수로 double형 1개 호출
	
	public Complex(double d, double e) {
		num = d;
		com = e;
	}//Complex에 매개변수로 double형 2개 호출

	public void print() {
		System.out.println(num + " + " + com + "i");
		
	}//print 메소드

}
