package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MouseHover_ActionsClass {
	
	//action class is used for mousehover and drag and drop operations

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://login.salesforce.com");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.findElement(By.name("username")).sendKeys("nov22.sowmyatm@gmail.com");
		Thread.sleep(3000);
		driver.findElement(By.id("password")).sendKeys("Sowmyatm@1234");
		driver.findElement(By.cssSelector("#Login")).click();
		
		driver.findElement(By.id("userNav")).click();
		//driver.findElement(By.xpath("//a[@title='My Settings']"));
		
		WebElement interactions=driver.findElement(By.xpath("//a[@title='My Settings']"));
		Actions action=new Actions(driver);
		action.moveToElement(interactions).build().perform();
		Thread.sleep(3000);


	}

}
