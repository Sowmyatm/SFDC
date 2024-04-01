package Selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DragnDrop_ActionClass {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebDriverWait wait = new WebDriverWait(driver,30);
		
		driver.get("http://login.salesforce.com");
		driver.manage().window().maximize();
		
		driver.findElement(By.name("username")).sendKeys("nov22.sowmyatm@gmail.com");
		
		driver.findElement(By.id("password")).sendKeys("Sowmyatm@1234");
		driver.findElement(By.cssSelector("#Login")).click();
		
		//drag and drop
		WebElement tom = driver.findElement(By.id(""));
		WebElement target = driver.findElement(By.id(""));
		Actions action = new Actions(driver);
		action.clickAndHold(tom).moveToElement(target).release().build().perform();
		//instead of above code can use below code also
		action.dragAndDrop(tom, target).build().perform();
	}

}
