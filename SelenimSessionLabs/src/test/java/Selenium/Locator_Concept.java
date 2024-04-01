package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Locator_Concept {

	public static void main(String[] args) throws InterruptedException {
		
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\kppra\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		//can use webdrivermanager.chromedriver.setup instead of setting system properties
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("http://login.salesforce.com");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.findElement(By.name("username")).sendKeys("nov22.sowmyatm@gmail.com");
		Thread.sleep(3000);
		driver.findElement(By.id("password")).sendKeys("Sowmyatm@123");
//		driver.findElement(By.cssSelector("#Login")).click();
		
		//css selector ---if id is there--#id
		//if class is there-- .class
//		
//		Thread.sleep(3000);
//		driver.findElement(By.xpath("//a[@class='fl small']")).click();
//		Thread.sleep(3000);
		driver.findElement(By.linkText("Forgot Your Password?")).click();
		driver.close();

	}

}
