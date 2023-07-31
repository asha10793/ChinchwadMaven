package eCommerceProject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Meesho {
  @Test
  public void EC_123_MeeshoTest() throws InterruptedException {
	  System.setProperty("webdriver.chrome.driver", "D:\\VelocityTraining\\Setups\\ChromeDriver107_SeleniumFile\\chromedriver.exe");
	  WebDriver driver = new ChromeDriver();
	  Reporter.log("opening meesho", true);
	  driver.get("https://www.meesho.com/");
	  driver.manage().deleteAllCookies();
	  Thread.sleep(7000);
	  driver.close();
  }
}
