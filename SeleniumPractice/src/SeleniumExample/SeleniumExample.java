package SeleniumExample;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import PageObjectModel.RegisterPage;

public class SeleniumExample {

	private static final By By = null;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//By acc_link =By.linkText("MY ACCOUNT");
		//By reg_button =By.xpath("//span[text()='Register' ]");
		
		System.out.println("welcome to page");
		
		WebDriver driver =new ChromeDriver();
		driver.close();
		 driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("http://magento.com");
		WebElement my_acc =driver.findElement(RegisterPage.acc_link);
		my_acc.click();
		WebElement reg =driver.findElement(RegisterPage.reg_button);
		reg.click();
		
		WebElement fname =driver.findElement(By.id("firstname"));
		fname.clear();
		fname.sendKeys("Shweta");
		
		WebElement lname =driver.findElement(By.id("lastname"));
		lname.clear();
		lname.sendKeys("kadam");
		
		 
		WebElement com_pr =driver.findElement(By.name("company_type"));
		Select comp_pr =new Select(com_pr);
		comp_pr.selectByValue("development");

		
//		WebElement email =driver.findElement(By.name("login[username]"));
//		email.clear();
//		email.sendKeys("natarajan.ramanathan93@gmail.com");
//		WebElement password =driver.findElement(By.id("pass"));
//		password.clear();
//		password.sendKeys("Welcome123");
//		password.submit();
		
		

	}

}
