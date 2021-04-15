package jUnitTestingPackage;

import static org.junit.Assert.*;

import org.junit.Test;

public class testCombStr {

	@Test
	public void test() {
		jUnitTestingFunc func = new jUnitTestingFunc();
		String funcRes = func.combineStrings("Eric ", "Mervin");
		assertEquals("Eric Mervin", funcRes);
	}

}
