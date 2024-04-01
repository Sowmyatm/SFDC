package Selenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AlertPopUpHandle {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		driver.findElement(By.name("proceed")).click();
		Thread.sleep(3000);
		
//		//to generate alert
//		JavascriptExecutor js=(JavascriptExecutor)driver;
//		js.executeScript("alert('Welcome to Salesforce');");
//		driver.switchTo().alert().accept();
		
		//switch from main window to alert popup
		Alert alert=driver.switchTo().alert(); 
		
//above code returns one alert class object ref, by using this ref, .getText(),.accept, .dismiss operations are performed
		
		System.out.println(alert.getText());
		String expected = alert.getText();
		String actual = "Please enter a valid user name";
		if(actual.equals(expected))
		{
			System.out.println("Correct alert msg");
		}
		else
		{
			System.out.println("Incorrect alert msg");
		}
		alert.accept();//clicks on OK btn
		//alert.dismiss(); to cancel the alert
		//driver.switchTo().alert().sendKeys("Selenium"); to send text
		

	}

}
