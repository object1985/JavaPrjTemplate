package jp.co.tonaise.math;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CaluculatorTest {
	@Test
	public void 計算機1足す1は2(){
		Caluculator c = new Caluculator();
		assertEquals(2,c.add(1, 1));
	}
}
