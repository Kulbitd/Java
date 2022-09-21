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
	
	public static void main(String[] args) {
		System.out.println(ex3_3("answer", "answer"));
		System.out.println(ex3_3("anwseer", "answer"));
	}
}
