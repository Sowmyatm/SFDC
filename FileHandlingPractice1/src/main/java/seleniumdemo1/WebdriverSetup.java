package seleniumdemo1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebdriverSetup {

	public static void main(String[] args) throws InterruptedException {
		
		//set the system property of chromedriver
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\kppra\\Downloads\\chromedriver_win32 (1).exe");
		
		//we can use either system.setproperty or webdrivermangr to set up the chromedriver. chromedriver should 
		//be installed in 1st case. in webdrivermngr, no need of chrome installation.
		
		WebDriverManager.chromedriver().setup();
//		WebDriverManager.firefoxdriver().setup(); 
//		WebDriverManager.safaridriver().setup(); //can setup differnt web browsers
//		WebDriverManager.edgedriver().setup();
		
		//webdriver manager is external lib which automatically downloads the webdriver
		//webdrivermngr checks the chrome version and automatically downld appropriate version of chromedriver
		
		//create the object of webdriver
		WebDriver driver = new ChromeDriver(); 
		
		//implicit wait should be declared after the driver object is defined. Once it is declared 
		//in the pgm, no need to declare again in every steps.
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); //implicit waits
		
		WebDriverWait wait= new WebDriverWait(driver,30); //explicit waits declare in the beginning,
		//use it later using the object
		
		//Explicit wait- waits for ajax elts to load. depends on elt load
		
		
		
		
		//create the object corresponding to the browser setup
		//webdriver driver = new FireFoxDriver
		//webdriver driver = new SafariDriver
		
		driver.get("https://login.salesforce.com");
		//Thread.sleep(2000);//deadwait or hardwait
		driver.manage().window().maximize(); //to maximize the browser window
		//Thread.sleep(2000);
		
		driver.findElement(By.id("username")).sendKeys("nov22.sowmyatm@gmail.com");
		//Thread.sleep(2000);
		
		driver.findElement(By.id("password")).sendKeys("tmsowmya1234");
		//Thread.sleep(2000);
		
		//using explicit waits
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath(null))));
		
		//driver.findElement(By.name("Login")).click();
		driver.findElement(By.xpath("//input[@id=\'Login\']")).click();
		
		
		
		//Handling mouse hover
		WebElement usrmnu=driver.findElement(By.id("userNav-arrow"));
		usrmnu.click();
		//Thread.sleep(2000);
		Actions action = new Actions(driver);
		action.moveToElement(usrmnu).build().perform();
		driver.findElement(By.xpath("//a[@title='My Settings']")).click();
		
		
		//Thread.sleep(2000);
		
		driver.findElement(By.xpath("//a[@title='Accounts Tab']")).click();
		//Thread.sleep(2000);
		
		
		//Handling Dropdown
		Select s = new Select(driver.findElement(By.xpath("//select[@title='View:']")));
		
		//s.selectByVisibleText("New Last Week"); - this also works
		
		s.selectByIndex(2);
		
		//driver.findElement(By.xpath("//a[@title='Opportunities Tab']")).click();
		 
		//Thread.sleep(2000);
		
		//Handling Alerts
//		driver.switchTo().alert().accept();
//		driver.switchTo().alert().dismiss();
//		driver.switchTo().alert().sendKeys(null);
//		driver.switchTo().alert().getText();
//		
		
		
		
		
		//closes the browser window
		
		

	}

}
