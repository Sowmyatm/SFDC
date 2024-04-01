package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandleFileUploadPopUp {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://login.salesforce.com");
		driver.findElement(By.name("username")).sendKeys("nov22.sowmyatm@gmail.com");
		//Thread.sleep(3000);
		driver.findElement(By.id("password")).sendKeys("Sowmyatm@1234");
		driver.findElement(By.cssSelector("#Login")).click();
		driver.manage().window().maximize();
		driver.findElement(By.linkText("Chatter")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//a[@title='Sowmya Abcd'])[2]")).click();
		
		driver.findElement(By.linkText("File")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("chatterUploadFileAction")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("chatterFile")).sendKeys("C:\\Users\\kppra\\OneDrive\\Documents\\extra points.txt");	//give the location+filename	 	
		Thread.sleep(3000);
		driver.findElement(By.id("publishersharebutton")).click();
		Thread.sleep(3000);

	}

}
