
public class pz2 {
	public static void main(String[] args) {
        double[] buffP = {1, 2, 1.4, 2.1, -2.1, 0.5};
        double[] buffC = {2, 0, 1.6, 2, -1.2, -2};
        double[] buffR = {1, 2, 2.5};
        
        Points[] points = new Points[buffP.length/2];
        Points[] pointsForCircles = new Points[buffP.length/2];
        Circles[] circles = new Circles[buffP.length/2];
        
        int j = 0;
        for (int i = 0; i < buffP.length ;i += 2) {
        	points[j] =  new Points(buffP[i], buffP[i+1]);
        	points[j].toString();
        	j++;
        }
        j = 0;
        for (int i = 0; i < buffC.length ;i += 2) {
        	
        	pointsForCircles[j] =  new Points(buffC[i], buffC[i+1]);
        	circles[j] = new Circles( pointsForCircles[j], buffR[j] );
        	System.out.println(circles[j].square());
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
