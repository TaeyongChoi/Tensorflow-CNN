package ����;

public class GolfClub {
	int num;
	String kind;
	
	public GolfClub() {
		num = 7;
		kind = "���̾�";
	}//GolfClub ȣ��
	public GolfClub(int a) {
		num = a;
		kind = "���̾�";
	}//GolfClub�� �Ű������� int�� 1�� ȣ��
	public GolfClub(String b) {
		kind = b;
	}//GolfClub�� �Ű������� string�� ȣ��
	
	
	
	public void print() {
		if(kind =="���̾�")//���ڿ��� ���� ������ kind�� ���̾��� �ȴ�
			System.out.println(num + "�� " + kind + "�Դϴ�.");
		else
			System.out.println(kind + "�Դϴ�.");
	}//print �޼ҵ�
}
