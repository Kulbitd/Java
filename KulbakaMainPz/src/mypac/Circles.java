package mypac;


public class Circles implements IDrawable {
	
	double center_coordinate_x;
	double center_coordinate_y;
	double radius;
	
	
	public Circles(Points a, double r){
		center_coordinate_x = a.coordinate_x;
		center_coordinate_y = a.coordinate_y;
		radius = r;
	}
	public Circles(Points a){
		center_coordinate_x = a.coordinate_x;
		center_coordinate_y = a.coordinate_y;
		radius = Math.random() * 100;
	}
	
	
	public String toString() {
		String string = "X : " + center_coordinate_x + " ; Y : " + center_coordinate_y + " ; R : " + radius;
		System.out.println(string);
		return string;
	}
	public boolean equals(Circles a) {
		if (center_coordinate_x == a.center_coordinate_x && center_coordinate_y == a.center_coordinate_y && radius == a.radius) {
			return true;
		}
		return false;
	}
	public double square() {
		return Math.pow(radius, 2) * Math.PI;
	}
	public void drow() {
		System.out.println("Окружность. X : " + center_coordinate_x + " ; Y : " + center_coordinate_y + " ; R : " + radius);
	}
	public boolean InOrNot(double x, double y) {
		if (center_coordinate_x - radius < x  && x < center_coordinate_x + radius ) {
			if (center_coordinate_y - radius < y  && y < center_coordinate_y + radius ) {
				return true;
			}
			
		}
		return false;
	}
	public void pointin() {
		for (double i =  center_coordinate_x - radius;i < center_coordinate_x + radius;i ++) {
			for (double j =  center_coordinate_y - radius;j < center_coordinate_y + radius;j ++) {
				System.out.print("X : " + i + "; Y : "+ j + "/t");
			}
		}
	}
	
	
}
