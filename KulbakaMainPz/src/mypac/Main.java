package mypac;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		Points[] newpoints = new Points [99];
		Circles[] newcirles = new Circles [99];
		int numberpoint = 0;
		int newcircles = 0;
		
		boolean work = true;
		while (work) {
			Scanner in = new Scanner(System.in);
			System.out.println("Для выхода из программы введите : 0");
			System.out.println("Для добавление данных в список точек введите : 1");
			System.out.println("Для добавление данных в список окружности введите : 2");
			System.out.println("Для вывода на экран содержимого списка точек введите : 3");
			System.out.println("Для вывода на экран содержимого списка окружностей введите : 4");
			System.out.println("Для удаления точек из списка точек введите : 5");
			System.out.println("Для удаления точек из списка точек введите : 6");
			System.out.println("Для вывода всех точек находящихся в окружности введите: 7");
	        int num = in.nextInt();
			switch(num) {
			case 0 :
				work = false;
				break;
			case 1 :
				System.out.print("Сколько переменных вы хотите добваить ? : ");
				int buffpoints = in.nextInt();
				for (int i = 0; i < buffpoints; i++) {
					System.out.print("X : ");
					double x = in.nextDouble();
					System.out.print("Y : ");
					double y = in.nextDouble();
					newpoints[numberpoint] = new Points(x,y); 
				}
				break;
			case 2 :
				System.out.print("Сколько переменных вы хотите добваить ? : ");
				int buffcircles = in.nextInt();
				for (int i = 0; i < buffcircles; i++) {
					System.out.print("X : ");
					double x = in.nextDouble();
					System.out.print("Y : ");
					double y = in.nextDouble();
					Points buffforcircles = new Points(x,y); 
					
				}
				break;
			case 3 :
				break;
			case 4 :
				break;
			case 5 :
				break;
			case 6 :
				break;
			case 7 :
				break;
			
			}
			
		}
	}
}