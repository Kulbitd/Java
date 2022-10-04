package mypac;


public class Points implements IDrawable {
	
	int coordinate_x;
	int coordinate_y;
	
	
	public Points(int a,int b){
		coordinate_x = a;
		coordinate_y = b;
	}
	
	
	public String toString() {
		String string = coordinate_x +","+ coordinate_y + ",";
		return string;
	}
	public boolean equals(Points a) {
		if (coordinate_x == a.coordinate_x && coordinate_y == a.coordinate_y) {
			return true;
		}
		return false;
	}
	public void drow() {
		System.out.println("Точка. X : " + coordinate_x + " ; Y : " + coordinate_y);
	}	
	public String drowuser() {
		return "Точка. X : " + coordinate_x + " ; Y : " + coordinate_y;
	}
}

