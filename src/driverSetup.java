import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class driverSetup {
	public static WebDriver driver;
	public driverSetup(){
		System.setProperty("webdriver.chrome.driver", "files\\chromedriver.exe");　　//指定驱动路径
	    driver = new ChromeDriver();
	}
	
	
    
}
