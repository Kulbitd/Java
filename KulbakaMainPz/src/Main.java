public class Main {
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


public interface IDrawable  {

    public void swim();
}
	
	
}
