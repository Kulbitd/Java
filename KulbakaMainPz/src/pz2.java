
public class pz2 {
	public static void main(String[] args) {
        double[] buff = {1, 2, 1.4, 2.1, -2.1, 0.5};
        Points[] ex = new Points[buff.length/2];
        int j = 0;
        for (int i = 0; i < buff.length ;i += 2) {
        	ex[j] =  new Points(buff[i], buff[i+1]);
        	ex[j].toString();
        	j++;
        }
    }
static class Points{
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


static class Circles {
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
	
	
	
}
