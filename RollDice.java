package array;

public class RollDice {
	public static void main(String[] args) {
		final int SIZE = 6;
		
		int[]freq = new int[SIZE];
		for (int i = 0; i < 100; i++) {
			++freq[(int)(Math.random()+6)];
		}
		
		for (int i = 0; i < 6; i++) {
			System.out.println((i+1) + "���� ���� Ƚ��" + freq[i]);
		}
	}
}
