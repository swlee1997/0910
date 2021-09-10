package array;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class Lotto2 {
	public static void main(String[] args) 
	{
		int[] lot = new int[45];
		
		for (int i = 0; i < lot.length; i++) 
		{
			lot[i] = i+1;
		}
		
		shuffleArray(lot);
		
		for (int i = 0; i < 6; i++) 
		{
			System.out.print(lot[i] + " ");
		}
	}
	static void shuffleArray(int[] ar)
	  {
	    // If running on Java 6 or older, use `new Random()` on RHS here
	    Random rnd = ThreadLocalRandom.current();
	    for (int i = ar.length - 1; i > 0; i--)
	    {
	      int index = rnd.nextInt(i + 1);
	      // Simple swap
	      int a = ar[index];
	      ar[index] = ar[i];
	      ar[i] = a;
	    }
}
}
