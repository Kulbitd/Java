package mypac;

import java.util.Random;

public class pz5 {

	static public class Mass{
		Points poi;
		Points[] mas = new Points [0];
	
		public void Points(){
		}
		
		
	public void lenghtmas(int min,int max) {
		int diff = max - min;
		Random random = new Random();
		int i = random.nextInt(diff + 1) + min;
		mas = new Points [i];
		for (int j = 0;j < i ;j++) {
			mas[j] = new Points (random.nextInt(20 + 1) - 10,random.nextInt(20 + 1) - 10);
		}
	}
	public void pri() {
		for (int j = 0;j < mas.length;j++) {
			System.out.println(mas[j]);
		}
	}
	}
	public static void main(String[] args) {
		Mass lol = new Mass();
		lol.lenghtmas(1, 14);
		lol.pri();

	}
	}
