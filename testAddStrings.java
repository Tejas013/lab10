package jUnitTestPackage;

import static org.junit.Assert.*;

import org.junit.Test;

public class testAddStrings {

	@Test
	public void test() {
		jUnitFunctions func1 = new jUnitFunctions();
		String res = func1.AddStrings("Hello", " World");
		System.out.println(res);
	}

}
