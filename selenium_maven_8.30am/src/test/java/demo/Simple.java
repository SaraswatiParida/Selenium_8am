package demo;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Simple {
	@Test
	public void simple()
	{
		Reporter.log("build is passed",true);
	}
	

}
