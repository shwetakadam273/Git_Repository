package SeleniumExample;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class FrameExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	WebDriver driver =	new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
//	driver.get("http://www.echoecho.com/javascript4.htm");
//	driver.findElement(By.name("B3")).click();
//	System.out.println(driver.switchTo().alert().getText());
//	driver.switchTo().alert().sendKeys("Test Value");
	
	
//	driver.get("https://netbanking.hdfcbank.com/netbanking/");
//	driver.switchTo().frame("login_page");
//	driver.findElement(By.name("fldLoginUserId")).sendKeys("1234");
//	driver.switchTo().defaultContent();
	
	driver.get("http://naukari.com");
	Set<String> winids = driver.getWindowHandles();
			Object[] ids = winids.toArray();
			driver.switchTo().window(ids[1].toString());
driver.close();
driver.switchTo().window(ids[0].toString());

	}

}
