package mypac;

import java.util.Scanner;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		
		Points[] newpoints = new Points [99];
		Circles[] newcirles = new Circles [99];
		int numberpoint = 0;
		int numbercircles = 0;
		
		boolean work = true;
		while (work) {
			System.out.println();
			System.out.println();
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
					System.out.println("Точка X :" + x + " ; Y : " + y + " добавлена");
					newpoints[numberpoint] = new Points(x,y); 
					numberpoint ++;
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
					System.out.print("R : ");
					double r = in.nextDouble();
					System.out.println("Окружность с центров в точке  X :" + x + " ; Y : " + y + " и с радиусом  R : " + r + "добавлена");
					Points buffforcircles = new Points(x,y); 
					newcirles[numbercircles] = new Circles (buffforcircles,r);
					numbercircles++;
				}
				break;
			case 3 :
				for (int i = 0; i < numberpoint;i++) {
					newpoints[i].drow();;
				}
				break;
			case 4 :
				for (int i = 0; i < numbercircles;i++) {
					newcirles[i].drow();
				}
				break;
			case 5 :
				System.out.println("Вывести список или удалить по параметрам? [1/2 соотвественно] : ");
				int oneortwo = in.nextInt();
				switch(oneortwo) {
				case 1:
					for (int i = 0; i < numberpoint;i++) {
						newpoints[i].drow();;
					}
					System.out.println("Введите индекс точки, которую хотите удалить (начиная с 1) : ");
					int index = in.nextInt() - 1;
					if (index  > numberpoint - 1) {
						System.out.println("Введен неверный индекс");
						break;
					}	
					newpoints[index] = newpoints[numberpoint-1];
					newpoints[numberpoint-1] = null;
					numberpoint --;
					
					
				
					
				}
				break;
			case 6 :
				break;
			case 7 :
				break;
			
			}
			
		}
	}
}