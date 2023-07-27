package eCommerceProject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Flipkart {
  @Test
  public void flipkartTest() throws InterruptedException {
	  System.setProperty("webdriver.chrome.driver", "D:\\VelocityTraining\\Setups\\ChromeDriver107_SeleniumFile\\chromedriver.exe");
	  WebDriver driver = new ChromeDriver();
	  Reporter.log("opening flipkart", true);
	  driver.get("https://www.flipkart.com/");
	  driver.manage().deleteAllCookies();
	  Thread.sleep(7000);
	  driver.close();
  }
}