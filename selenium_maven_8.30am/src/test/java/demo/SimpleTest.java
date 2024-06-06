package demo;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class SimpleTest {
	@Test
	public void test()
	{
Reporter.log("build is passed",true);
	}

}
