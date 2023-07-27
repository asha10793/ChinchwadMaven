package eCommerceProject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Ajio {
  @Test
  public void ajioTest() throws InterruptedException {
	  System.setProperty("webdriver.chrome.driver", "D:\\VelocityTraining\\Setups\\ChromeDriver107_SeleniumFile\\chromedriver.exe");
	  WebDriver driver = new ChromeDriver();
	  Reporter.log("opening ajio", true);
	  driver.get("https://www.ajio.com/");
	  driver.manage().deleteAllCookies();
	  Thread.sleep(7000);
	  driver.close();
  }
}
 
