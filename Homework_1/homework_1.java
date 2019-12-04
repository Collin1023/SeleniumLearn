import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Timeouts;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import junit.framework.Assert;
/**
 * 本次作业以QQ邮箱作为验证
 * @author Administrator
 *
 */

public class homework_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "driver\\chromedriver.exe");　　//指定驱动路径
	    Wedriver driver = new ChromeDriver();
	    driver.get("https://mail.qq.com/")
	    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	    
	    WebElement userName =driver.findElement(By.cssSelector("#u"));
	    WebElement pwd=driver.findElement(By.cssSelector("#p"));
	    WebElement logonBtn=driver.findElement(By.cssSelector("#login_button"));
	    WebElement errorTips=driver.findElement(By.cssSelector(".error_tips>span:nth-child(2)"));
	    
	    userName.clear();
	    userName.sendKeys("306862391");
	    pwd.clear();
	    pwd.sendKeys("qazssd090p");
	    logonBtn.click();
	    Assert.assertEquals("登录失败", "你输入的帐号或密码不正确，请重新输入.", errorTips.getText());

	}

}
