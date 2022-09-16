package kulbaka;

import java.util.Scanner;

public class Pz0 {
	public static void ex0(String[] args) {
		try (Scanner in = new Scanner(System.in)) {
			System.out.print("Input a equation [a/b]: ");
			String letter = in.next();
			if (letter == "b")
			{
				System.out.print("Input a x: ");
				double x = in.nextDouble();
				double y = 17 * Math.pow(x,2) - 6 * x + 13 ;
				System.out.print(y);
			}
				
		}
    }
}
