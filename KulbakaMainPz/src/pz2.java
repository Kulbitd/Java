
public class pz2 {
	public static void main(String[] args) {
        
        Points One = new Points();
        System.out.print( One.toString() );
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
	
	
	
}
}
