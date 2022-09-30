package mypac;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		Points[] newpoints = new Points [99];
		Circles[] newcirles = new Circles [99];
		int numberpoint = 0;
		int numbercircles = 0;
		
		boolean work = true;
		while (work) {
			Scanner in = new Scanner(System.in);
			;System.out.println();System.out.println();
			System.out.println("Для выхода из программы введите : 0");
			System.out.println("Для добавление данных в список точек введите : 1");
			System.out.println("Для добавление данных в список окружности введите : 2");
			System.out.println("Для вывода на экран содержимого списка точек введите : 3");
			System.out.println("Для вывода на экран содержимого списка окружностей введите : 4");
			System.out.println("Для удаления точки введите : 5");
			System.out.println("Для удаления окружности  введите : 6");
			System.out.println("Для вывода всех точек находящихся в окружности введите: 7");
			System.out.print("Ваш выбор : ");
	        int num = in.nextInt();
			switch(num) {
			case 0 :
				work = false;
				WriteAndReade.writespoints(newpoints,newcirles,numberpoint,numbercircles);
				
				break;
			case 1 :
				System.out.print("Сколько переменных вы хотите добваить ? : ");
				int buffpoints = in.nextInt();
				for (int i = 0; i < buffpoints; i++) {
					System.out.print("X : ");
					int x = in.nextInt();
					System.out.print("Y : ");
					int y = in.nextInt();
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
					int x = in.nextInt();
					System.out.print("Y : ");
					int y = in.nextInt();
					System.out.print("R : ");
					int r = in.nextInt();
					System.out.println("Окружность с центров в точке  X :" + x + " ; Y : " + y + " и с радиусом  R : " + r + " добавлена");
					Points buffforcircles = new Points(x,y); 
					newcirles[numbercircles] = new Circles (buffforcircles,r);
					numbercircles++;
				}
				break;
			case 3 :
				System.out.print("Как вывести массив первозданный в порядке увелечения / уменьшение [1,2/3]");
				int choice = in.nextInt();
				switch(choice) {
				case 1:
					for (int i = 0; i < numberpoint;i++) {
						newpoints[i].drow();;
					}
				break;
				case 2:
					Points[] bufffornotsort1 = new Points[newpoints.length];
					System.arraycopy(newpoints, 0, bufffornotsort1, 0, bufffornotsort1.length);
					bufffornotsort1 = Sort.pointsortincrease(bufffornotsort1,numberpoint);
					for (int i = 0; i < numberpoint;i++) {
						bufffornotsort1[i].drow();;
					}
					break;
				case 3:
					Points[] bufffornotsort2 = new Points[newpoints.length];
					System.arraycopy(newpoints, 0, bufffornotsort2, 0, bufffornotsort2.length);
					bufffornotsort2 = Sort.pointsort(bufffornotsort2,numberpoint);
					for (int i = 0; i < numberpoint;i++) {
						bufffornotsort2[i].drow();;
					}
				}
				break;
			case 4 :
			System.out.print("Как вывести массив первозданный в порядке увелечения / уменьшение [1,2/3]");
			int choicecir = in.nextInt();
			switch(choicecir) {
			case 1:
				for (int i = 0; i < numbercircles;i++) {
					newcirles[i].drow();
				}
			break;
			case 2:
				Circles[] bufffornotsort1 = new Circles[newcirles.length];
				System.arraycopy(newcirles, 0, bufffornotsort1, 0, bufffornotsort1.length);
				bufffornotsort1 = Sort.circlessortincrease(bufffornotsort1,numberpoint);
				for (int i = 0; i < numberpoint;i++) {
					bufffornotsort1[i].drow();;
				}
				break;
			case 3:
				Circles[] bufffornotsort2 = new Circles[newcirles.length];
				System.arraycopy(newcirles, 0, bufffornotsort2, 0, bufffornotsort2.length);
				bufffornotsort2 = Sort.circlessort(bufffornotsort2,numberpoint);
				for (int i = 0; i < numberpoint;i++) {
					bufffornotsort2[i].drow();;
				}
				break;
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
					for (int j = index;j < numberpoint;j++) {
						newpoints[j] = newpoints[j+1];
					}
					newpoints[numberpoint-1] = null;
					numberpoint --;
					break;
				case 2:
					System.out.println("Введите параметры удаляемой точки");
					double x_x = in.nextDouble();
					double y_y = in.nextDouble();
					for (int i = 0; i < numberpoint;i++) {
						if( newpoints[i].coordinate_x == x_x && newpoints[i].coordinate_y == y_y) {
							for (int j = i;j < numberpoint;j++) {
								newpoints[j] = newpoints[j+1];
							}
							newpoints[numberpoint-1] = null;
							numberpoint --;
							break;
						}
					}
				}
					break;
			case 6 :
				System.out.println("Вывести список или удалить по параметрам? [1/2 соотвественно] : ");
				int oneortwoсcircles = in.nextInt();
				switch(oneortwoсcircles) {
				case 1:
					for (int i = 0; i < numbercircles;i++) {
						newcirles[i].drow();
					}
					System.out.println("Введите индекс точки, которую хотите удалить (начиная с 1) : ");
					int index = in.nextInt() - 1;
					if (index  > numbercircles - 1) {
						System.out.println("Введен неверный индекс");
						break;
					}
					for (int j = index;j<numbercircles;j++) {
						newcirles[j] = newcirles[j+1];
						}
					newcirles[numbercircles-1] = null;
					numbercircles --;
					break;
				case 2:
					System.out.println("Введите параметры удаляемой точки X , Y , R");
					double x_x = in.nextDouble();
					double y_y = in.nextDouble();
					double r_r = in.nextDouble();
					for (int i = 0; i < numbercircles;i++) {
						if( newcirles[i].center_coordinate_x == x_x && newcirles[i].center_coordinate_y == y_y && newcirles[i].radius == r_r) {
							for (int j = i;j<numbercircles;j++) {
								newcirles[j] = newcirles[j+1];
							}
							newcirles[numbercircles-1] = null;
							numbercircles --;
							break;
						}
					}
					
					break;
				}
			case 7 :
				break;
			default:
				System.out.println("Введен неверный параметр");
				}
			
		}
	}
}