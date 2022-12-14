package kulbaka;

import static org.junit.Assert.*;

import org.junit.Test;

public class Pz1Test {

	@Test
	public void Pz1_2TestSumOk() {
		assert Pz1.ex3_1_sum(8.13, 13.2) == 21.33;
	}
	
	@Test
	public void Pz1_2TestSumNotOk() {
		assert Pz1.ex3_1_sum(Integer.MAX_VALUE, Integer.MAX_VALUE) == Integer.MAX_VALUE + Integer.MAX_VALUE;
	}
	
	@Test
	public void Pz1_2TestMiltiNotOk() {
		assert Pz1.ex3_1_multi(Integer.MAX_VALUE, Integer.MAX_VALUE) == Integer.MAX_VALUE * Integer.MAX_VALUE;
	}
	
	@Test
	public void Pz1_2TestMultiOk() {
		assert Pz1.ex3_1_multi(142, 12) == 1704;
	}
	
	@Test
	public void Pz1_2TestSubOk() {
		assert Pz1.ex3_1_sub(142, 12) == 130;
	}
	
	@Test
	public void Pz1_2TestSubNotOk() {
		assert Pz1.ex3_1_sub(142, 12) == 12;
		
	}
	
	@Test
	public void Pz1_3TestSumOddOk() {
		assert Pz1.ex3_2_odd() == 225;
	}
	
	@Test
	public void Pz1_3TestSumEvenOk() {
		assert Pz1.ex3_2_even() == 240;	
	}
	
	@Test
	public void Pz1_4TestS4IsS5() {
		assert Pz1.ex3_3("answer", "answer") == 2;
	}
	
	@Test
	public void Pz1_4TestS4NotIsS5() {
		assert Pz1.ex3_3("anwser", "answer") == 3;
	}
	
	@Test
	public void Pz1_4TestOddOk() {
		assert Pz1.ex4(841) == 1;
	}
	
	@Test
	public void Pz1_4TestEvenOk() {
		assert Pz1.ex4(840) == 1;
	}
	
	@Test
	public void Pz1_5TestOk() {
		assert Pz1.ex5() == 8779;
	}
	
	@Test
	public void Pz1_6Test2SolutionOk() {
		assert Pz1.ex6(3,-14,-5) == 5;
	}
	
	@Test
	public void Pz1_6TestNoSolutionOk() {
		assert Pz1.ex6(4,0,36) == -1;
	}
	
	@Test
	public void Pz1_6Test1SolutionOk() {
		assert Pz1.ex6(1,-10,25) == 5;
	}
}
