package testt;

import org.junit.Test;
import  mypac.*;

public class testPz2 {

	@Test
	public void PointsEqualTestOk() {
		Points One = new Points (31, 28);
		Points Two = new Points (31, 28);
		assert One.equals(Two) == true;
		}
	
	@Test
	public void PointstoStringTestOk() {
		Points One = new Points (311, 28);
		assert One.toString().contains("X : 311.0 ; Y : 28.0");
		}
	
	@Test
	public void CirclestoStringTestOk() {
		Points One = new Points (31, 28);
		Circles ONE = new Circles(One,78);
		
		assert ONE.toString().contains("X : 31.0 ; Y : 28.0 ; R : 78.0");
		}
	
	@Test
	public void CirclesEqualTestOk() {
		Points One = new Points (31, 28);
		Circles ONE = new Circles(One,78);
		Circles TWO = new Circles(One,78);
		assert ONE.equals(TWO) == true;
		}
	
	@Test
	public void CirclesSquareTestOk() {
		Points One = new Points (31, 28);
		Circles ONE = new Circles(One,78);
		assert ONE.square() == 19113.4497044403;
		}

}
