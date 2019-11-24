import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import src.driverSetup;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class NewTest {
	public static driverSetup driver;
  @Test
  public void searchBaidu() {
	  WebElement input = driver.findElement(By.cssSelector("#kw"));
	  WebElement searchBtn = driver.findElement(By.cssSelector("#su"));
	  input.sendKeys("selenium");
	  searchBtn.click();
	  //#content_left>div>h3>a:nth-child(1)
	  WebElement reslut1 = driver.findElement(By.cssSelector("#content_left>div>h3>a:nth-child(1)"));
	  reslut1.click();
  }
  @BeforeTest
  public void beforeTest() {
	  driver=new driverSetup();
	  driver.get("https://www.baidu.com")
	  try {
          driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
      } catch (Exception e) {
          e.printStackTrace();
      }
  }

  @AfterTest
  public void afterTest() {
	  driver.close();
  }

}
