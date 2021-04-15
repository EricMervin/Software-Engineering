package jUnitTestingPackage;

import static org.junit.Assert.*;

import org.junit.Test;

public class testSumNums {

	@Test
	public void test() {
		jUnitTestingFunc func = new jUnitTestingFunc();
		int funcRes = func.sumNumbers(7,10);
		assertEquals(17, funcRes);
	}

}
