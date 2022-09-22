package kulbaka;

public class Pz1 {
	public static void ex2() {
		System.out.println("         1");
		System.out.println("       1 2 3");
		System.out.println("     1 2 3 4 5");
		System.out.println("   1 2 3 4 5 6 7");
	}
	
	public static double ex3_1_sum(double a, double b) {
		return a + b;
	}
	
	public static double ex3_1_multi(double a, double b) {
		return a * b;
	}
	
	public static double ex3_1_sub(double a, double b) {
		return a - b;
	}
	
	public static int ex3_2_even() {
		int answer = 0;
		int[] mass = new int[30];
		for (int i = 0; i < 30;i++) {
			mass[i] = i + 1;
		}
		for (int i = 1;i < 30; i += 2) {
			answer += mass[i];
		}
		return answer;
	}
	
	public static int ex3_2_odd() {
		int answer = 0;
		int[] mass = new int[30];
		for (int i = 0; i < 30;i++) {
			mass[i] = i + 1;
		}
		for (int i = 0;i < 30; i += 2) {
			answer += mass[i];
		}
		return answer;
	}

	public static int ex3_3(String s4,String s5) {
		String s1 = "Сложение первой и ";
		String s2 = "второй строки ";
		String s3 = "третий строки ";
		if (s4 == s5.intern()) {
			String answer = s1 + s2;
			System.out.print(answer);
			return 2;
		}
		System.out.print(s1 + s3);
		return 3;
	}
	public static int ex4(int a) {
		while(true){
			if (a == 2)
				return 0;
			if (a == 1)
				return 1;
			if (a > 2) {
				a = a / 2;
			}
		}
	}
	public static double ex5() {
		double answer = 0;
		double[] a = {1e20, 1e18, 1e15, -1e12, 1223, 3};
		double[] b = {1e20,  -1e22, 1e13, 1e16, 2, 2111};
		for (int i = 0;i < 6; i++) {
			answer += a[i] * b[i];
		}
		return answer;
	}
	
	public static double ex6(double a,double b,double c) {
		double D = Math.pow(b, 2) - 4 * a * c;
		if (D < 0) {
			System.out.printf("no solution");
			return -1;}
		if (D == 0) {
			System.out.println(-b / 2 * a);
			return -b / 2 * a;
		}
		else {
			System.out.println((-b + Math.sqrt(D))/( 2 * a));
			System.out.println((-b - Math.sqrt(D))/( 2 * a));
			return (-b + Math.sqrt(D))/( 2 * a); // Возвращает максимальное значение (не знаю как по другому )
		}
		
		
		
	}
	
	public static void main(String[] args) {
		System.out.print(ex6(4,0,36));
	}
}
