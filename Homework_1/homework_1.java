import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Timeouts;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import junit.framework.Assert;
/**
 * ������ҵ��QQ������Ϊ��֤
 * @author Administrator
 *
 */

public class homework_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "driver\\chromedriver.exe");����//ָ������·��
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
	    Assert.assertEquals("��¼ʧ��", "��������ʺŻ����벻��ȷ������������.", errorTips.getText());

	}

}
