package kulbaka;

import static org.junit.Assert.*;

import org.junit.Test;

public class Pz1Test {

	@Test
	public void Pz1TestSumOk() {
		assert Pz1.ex3_1_sum(8.13, 13.2) == 21.33;
	}
	
	@Test
	public void Pz1TestSumNotOk() {
		assert Pz1.ex3_1_sum(Integer.MAX_VALUE, Integer.MAX_VALUE) == Integer.MAX_VALUE + Integer.MAX_VALUE;
	}
	
	@Test
	public void Pz1TestMiltiNotOk() {
		assert Pz1.ex3_1_multi(Integer.MAX_VALUE, Integer.MAX_VALUE) == Integer.MAX_VALUE * Integer.MAX_VALUE;
	}
	
	@Test
	public void Pz1TestMultiOk() {
		assert Pz1.ex3_1_multi(142, 12) == 1704;
	}
	
	@Test
	public void Pz1TestSubOk() {
		assert Pz1.ex3_1_sub(142, 12) == 130;
	}
	
	@Test
	public void Pz1TestSubNotOk() {
		assert Pz1.ex3_1_sub(142, 12) == 12;
		
	}
}
