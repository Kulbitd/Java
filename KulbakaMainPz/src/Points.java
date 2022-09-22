class Points{
	double coordinate_x;
	double coordinate_y;
	Points(){
		coordinate_x = Math.random() * 100;
		coordinate_y = Math.random() * 100;
	}
	Points(double a,double b){
		coordinate_x = a;
		coordinate_y = b;
	}
	
	
	public String toString() {
		String string = "X : " + coordinate_x + " ; Y : " + coordinate_y;
		System.out.println(string);
		return string;
	}
	
	public boolean equals(Points a) {
		if (coordinate_x == a.coordinate_x && coordinate_y == a.coordinate_y) {
			return true;
		}
		return false;
	}	
}	

