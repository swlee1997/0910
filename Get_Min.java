package array;

import java.util.Scanner;

public class Get_Min {
	public static void main(String[] args) 
	{
		//int s[] = {12,3,19,6,18,8,12,4,1,19};
		int s[] = new int[10];
		Scanner input = new Scanner(System.in);
		int minimum , maxmum;
		
		for (int i = 0; i < s.length; i++) 
		{
			System.out.print("10���߿�" +(i+1)+ "��° �� �Է� :");
			s[i] = input.nextInt();
		}
		
		minimum = s[0];
		maxmum = s[0];
		
		for (int i = 0; i < s.length; i++) 
		{
			if(minimum > s[i])
				minimum = s[i];
			if(maxmum > s[i])
				maxmum = s[i];
		}
		System.out.println("�ּҰ�" + minimum + "�ִ밪" + maxmum);
	}
}
