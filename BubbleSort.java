package quiz;

import java.util.Scanner;

public class BubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner rd = new Scanner(System.in);
		System.out.println("Type 10 numbers you want to sort.");
		int[] arr = new int[10];
		for (int i = 0; i < arr.length; i++) {
			int num = rd.nextInt();
			arr[i] = num;
		}
		for (int i = 0; i < arr.length ; i++) {
			for (int j = 0; j < arr.length - 1 - i; j++) {
				if (arr[j] > arr[j+1]){
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
		for (int i = 0; i < arr.length; i++) 
			System.out.printf("%d ",arr[i]);
	}

}
