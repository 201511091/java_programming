package quiz;

import java.util.Scanner;

public class ChangeMoney {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner a = new Scanner(System.in);
		
		System.out.println("환산 하려는 금액을 입력 하십시오.");
		
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
		
		System.out.println("환산 결과: 오만원권 "+won50000+"매, 만원권 "+won10000+
				"매, 오천원권 "+won5000+"매, 천원권 "+won1000+"매, 오백원"+won500+
				"개, 백원 "+won100+"개, 오십원"+won50+"개, 십원 "+won10+"개, 일원 "+won1+"개 입니다.");
		
	}

}
