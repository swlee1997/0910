package array;

import java.util.Iterator;
import java.util.Scanner;

public class SeqSearch {
	public static void main(String[] args) {
		int[] s = new int[10];
		Scanner input = new Scanner(System.in);
		int value , index = -1;
		
		for (int i = 0; i < s.length; i++) 
		{
			System.out.print((i+1) + "번째수 입력 :");
			s[i] = input.nextInt();
		}
		System.out.print("배열에서 탐색할 값 입력 :");
		value = input.nextInt();
		
		for (int i = 0; i < s.length; i++) 
		{
			if(s[i] == value)
				index = i;
		}
		if(index == -1)
			System.out.println("s배열에는" + value + "값이 없습니다.");
		else
			System.out.println("s배열에는" + value + "값이 s[" + s[index] + "]에 있습니다.");
	}
}
