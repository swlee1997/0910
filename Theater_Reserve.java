package array;

import java.util.Scanner;

public class Theater_Reserve 
{
	public static void main(String[] args) 
	{
		final int SIZE = 10;
		int[] seats = new int[SIZE];
		
		while(true)
		{
//		System.out.print("\033\033");
//        System.out.flush();
        System.out.println();
			System.out.println("---------------------------");
			for (int i = 0; i < SIZE; i++) 
				System.out.printf("%3d" , i);
			System.out.println();
			System.out.println("---------------------------");
			for (int i = 0; i < SIZE; i++) 
				System.out.printf("%3d" , seats[i]);
			
			System.out.println();
			System.out.println("---------------------------");		
			Scanner scn = new Scanner(System.in);
			
			System.out.print("예약할 좌석 번호 입력(종료는 -1) :");
			int s = scn.nextInt();
			if(s == -1) 
				break;
			if(seats[s-1] == 0)
			{
				seats[s-1] = 1;
				System.out.println(s+"빈 좌석이 예약되었습니다.");
			}
			else
			{
				System.out.println(s + "번 좌석은 이미 예약된 좌석 입니다.");
			}
		}
	}
}
