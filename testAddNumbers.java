package jUnitTestPackage;

import static org.junit.Assert.*;

import org.junit.Test;

public class testAddNumbers {

	@Test
	public void test() {
		jUnitFunctions func1 = new jUnitFunctions();
		int res = func1.AddNumbers(23, 45);
		System.out.println(res);
	}

}
