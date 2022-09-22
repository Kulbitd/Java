class Circles {
	double center_coordinate_x;
	double center_coordinate_y;
	double radius;
	Circles(Points a, double r){
		center_coordinate_x = a.coordinate_x;
		center_coordinate_y = a.coordinate_y;
		radius = r;
	}
	Circles(Points a){
		center_coordinate_x = a.coordinate_x;
		center_coordinate_y = a.coordinate_y;
		radius = Math.random() * 100;
	}
	
	
	public String toString() {
		String string = "X : " + center_coordinate_x + " ; Y : " + center_coordinate_y + " ; R : " + radius;
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
	
}
