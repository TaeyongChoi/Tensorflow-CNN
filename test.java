package ����;

public class HW1Demo {


	public static void main(String[] args) {
		Complex c1 = new Complex(2.0);//Complex ��ü ����
		c1.print();//print �޼ҵ� ȣ��
		Complex c2 = new Complex(1.5, 2.5);//Complex ��ü ����
		c2.print();//print �޼ҵ� ȣ��
		
		GolfClub g1 = new GolfClub();//GolfClub ��ü ����
		g1.print();//print �޼ҵ� ȣ��
		GolfClub g2 = new GolfClub(8);//GolfClub ��ü ����
		g2.print();//print �޼ҵ� ȣ��
		GolfClub g3 = new GolfClub("����");//GolfClub ��ü ����
		g3.print();//print �޼ҵ� ȣ��
	}

}
