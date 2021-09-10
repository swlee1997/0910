package array;

import java.util.Scanner;

public class Array_Text2 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		final int students = 5;
		int total = 0;
		
		int[]scores = new int[students];
		for (int i = 0; i < scores.length; i++) {
			System.out.print("성적을 입력하세요. :");
			scores[i] = scan.nextInt();
		}
		for (int i = 0; i < scores.length; i++) 
			total += scores[i];
		
		System.out.print("평균 성적은" + total/students + "입니다.");
	}
}
