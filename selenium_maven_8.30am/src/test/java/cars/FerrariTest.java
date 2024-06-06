package cars;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class FerrariTest {
	@Test(groups="smoke")
	public void lunch()
	{
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.ferrari.com/");
		Reporter.log("Ferrari lunched successfully", true);
		Reporter.log("FerrariTest class is modified", true);
		Reporter.log("FerrariTest class is added", true);
	}

}
