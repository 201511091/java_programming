package quiz;

import java.util.Scanner;

public class ChangeMoney {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner a = new Scanner(System.in);
		
		System.out.println("ȯ�� �Ϸ��� �ݾ��� �Է� �Ͻʽÿ�.");
		
		int money = a.nextInt();
		
		int won50000 = money / 50000;
		int won10000 = (money % 50000) / 10000;
		int won5000 = (money % 10000) / 5000;
		int won1000 = (money % 5000) / 1000;  
		int won500 = (money % 1000) / 500;
		int won100 = (money % 500) / 100;
		int won50 = (money % 100) / 50;
		int won10 = (money % 50) / 10;
		int won1 = (money % 10);
		
		System.out.println("ȯ�� ���: �������� "+won50000+"��, ������ "+won10000+
				"��, ��õ���� "+won5000+"��, õ���� "+won1000+"��, �����"+won500+
				"��, ��� "+won100+"��, ���ʿ�"+won50+"��, �ʿ� "+won10+"��, �Ͽ� "+won1+"�� �Դϴ�.");
		
	}

}
