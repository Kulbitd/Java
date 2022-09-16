package kulbaka;

import java.util.Scanner;

public class Pz0 {
	public static int ex0() {
		try (Scanner in = new Scanner(System.in))
		{
			System.out.print("Input a equation [a/b]: ");
			String letter = in.next();
			if (letter.contains("a"))
			{
				System.out.print("Input x: ");
				double x = in.nextDouble();
				double y = 17 * Math.pow(x,2) - 6 * x + 13 ;
				System.out.print(y);
			}
			if (letter.contains("b"))
			{
				System.out.print("Input a: ");
				double a = in.nextDouble();
				double y = 3 * Math.pow(a,2) + 5 * a - 21 ;
				System.out.print(y);
			}
		return 0;
		}
    }
	public static void main(String[] args)
	{
		System.out.print(ex0());
	}
}
