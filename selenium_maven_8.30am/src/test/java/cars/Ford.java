package cars;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Ford {
	@Test(groups="smoke")
	public void lunch()
	{
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.ford.com/");
		Reporter.log("ford lunched successfully", true);
	}

}
