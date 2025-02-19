package com.testng.execution;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.ReporterConfig.Property;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


@Test
public class WebRunner {
	
	WebDriver driver;
	Properties p;
	
	@AfterMethod
	public void kill()
	{
		driver.quit();
	}
	
	@BeforeMethod
		public void initiation() throws FileNotFoundException, IOException
	{
		 p =new Properties();
		p.load(new FileInputStream ("Web.properties"));
		
		
		switch (p.getProperty("browser"))
		{
		case "gc":
			System.setProperty("webdriver.chrome.driver" , "Drivers/chromedriver.exe");
			driver = new ChromeDriver();
			break;
		case "ff":
			System.setProperty("webdriver.gecko.driver" , "Drivers/geckdriver.exe");
			driver = new FirefoxDriver();
			break;
			
		case "ie":
			System.setProperty("webdriver.ie.driver" , "Drivers/IEDriverServer.exe");
			driver = new InternetExplorerDriver();
			break;	
		default:
			System.setProperty("webdriver.chrome.driver" , "Driver/chromedriver.exe");
			driver = new ChromeDriver();
			break;
			
		}
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get(p.getProperty("url"));
		WebElement my_acc = driver.findElement(By.linkText("MY ACCOUNT"));
		my_acc.click();
	}
	
	public void Register() throws FileNotFoundException, IOException
	{
		
		WebElement register = driver.findElement(By.xpath("//span[text()='Register']"));
		register.click();
		
		///
		
		driver.quit();
			
	}
	
	
	
	

}
