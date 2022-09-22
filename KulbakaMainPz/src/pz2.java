
public class pz2 {
	public static void main(String[] args) {
        
        Points One = new Points(1, 3);
        System.out.println( One.toString() );
        
        Points Two = new Points(1, 3);
        System.out.println( Two.toString() );
        
        System.out.println( One.equals(Two) );
    }
static class Points{
	double coordinate_x;
	double coordinate_y;
	Points(){
		coordinate_x = Math.random() * 100;
		coordinate_y = Math.random() * 100;
	}
	Points(int a,int b){
		coordinate_x = a;
		coordinate_y = b;
	}
	public String toString() {
		String string = "X : " + coordinate_x + " ; Y : " + coordinate_y;
		return string;
	}
	
	public boolean equals(Points a) {
		if (coordinate_x == a.coordinate_x && coordinate_y == a.coordinate_y) {
			return true;
		}
		return false;
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
}
	
	
	
}
}
