package ����;

public class Complex {
	public double num,com;

	public Complex(double d) {
		num = d;
		com = 0.0;
	}//Complex�� �Ű������� double�� 1�� ȣ��
	
	public Complex(double d, double e) {
		num = d;
		com = e;
	}//Complex�� �Ű������� double�� 2�� ȣ��

	public void print() {
		System.out.println(num + " + " + com + "i");
		
	}//print �޼ҵ�

}
