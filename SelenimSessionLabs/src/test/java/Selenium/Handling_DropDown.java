package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Handling_DropDown {

	public static void main(String[] args) throws InterruptedException {
		
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\kppra\\Downloads\\chromedriver_win32 (2).chromedriver.exe");
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://login.salesforce.com");
		
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.findElement(By.name("username")).sendKeys("nov22.sowmyatm@gmail.com");
		Thread.sleep(3000);
		driver.findElement(By.id("password")).sendKeys("Sowmyatm@1234");
		driver.findElement(By.cssSelector("#Login")).click();
		
		driver.findElement(By.linkText("Accounts")).click();
		Thread.sleep(3000);
		
		//should create an object of select class
		Select select=new Select(driver.findElement(By.id("fcf")));
		select.selectByVisibleText("Amogh");
		Thread.sleep(3000);
		
		
	}

}
