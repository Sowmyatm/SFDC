package xeroautomationfw;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class xero_test_cases {
	
	public static String username = "User@gmail.com" ;
	public static String pwd = "pwd";
	public static WebDriver driver;
	
	@BeforeMethod
	public void launchapp() throws InterruptedException
	{
		 driver = new ChromeDriver();
		driver.get("https://www.xero.com/us/");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
	}
	
	@AfterMethod
	public void teardown()
	{
		driver.close();
	}

		@Test
		public  void tc1() throws InterruptedException
		{
			driver.findElement(By.id("xl-form-email")).sendKeys("User@gmail.com");
			driver.findElement(By.id("xl-form-password")).sendKeys("pwd");
			driver.findElement(By.name("button")).click();
			Thread.sleep(4000);
			//username - sowmya.prasi@gmail.com
			//pwd -Sowmya@123
		}
		
		@Test
		void tc2() throws InterruptedException
		{
			driver.findElement(By.xpath("(//a[@href='/us/signup/'])[2]")).click();
			Thread.sleep(4000);
			driver.findElement(By.name("FirstName")).sendKeys("Sowmya");
			Thread.sleep(4000);
			driver.findElement(By.name("LastName")).sendKeys("T");
			Thread.sleep(4000);
			driver.findElement(By.name("EmailAddress")).sendKeys("sowmya.prasi@gmail.com");
			Thread.sleep(4000);
			
//			Select s = new Select(driver.findElement(By.name("CountryCode")));
//			s.selectByValue("US");
			
			driver.findElement(By.name("PhoneNumber")).sendKeys("4084007065");
			Thread.sleep(4000);
			
			Select s1 =new Select(driver.findElement(By.name("LocationCode")));
			   
			   s1.selectByVisibleText("United States");
			   Thread.sleep(4000);
			driver.findElement(By.xpath("//span[@class='Checkbox__StyledCheckbox-sc-1dxs2xu-2 hgsQPn']")).click();
			Thread.sleep(4000);
			
			driver.switchTo().frame(driver.findElement(By.xpath("(//iframe[@title='reCAPTCHA' ])[1]")));
			
			
			driver.findElement(By.xpath("//div[@class='recaptcha-checkbox-border']")).click();
			Thread.sleep(4000);
			driver.findElement(By.xpath("//button[@class='Button__Element-sc-1p1w21k-2 jcGYkN Button']")).click();
			Thread.sleep(4000);
		}
		
		@Test
		void tc3() throws InterruptedException
		{
			driver.findElement(By.xpath("(//li[@class='ButtonGroup__ListItem-sc-1sakov4-1 fuASOC'])[5]")).click();
			Thread.sleep(2000);
			driver.findElement(By.id("xl-form-email")).sendKeys("sowmya.prasi@gmail.com");
			driver.findElement(By.id("xl-form-password")).sendKeys("Sowmya@123");
			driver.findElement(By.name("button")).click();
			Thread.sleep(4000);
			driver.findElement(By.xpath("(//button[@class='xui-button xui-margin-bottom xui-button-borderless-main xui-button-medium'])[1]")).click();
			Thread.sleep(4000);
			//dashboard
			driver.findElement(By.xpath("//a[@href='https://go.xero.com/Dashboard/']")).click();
			Thread.sleep(4000);
			driver.findElement(By.xpath("(//button[@class='xnav-focusable xnav-tab--body'])[2]")).click();
			Thread.sleep(2000);
			//bank accounts
			driver.findElement(By.xpath("//a[@data-name='navigation-menu/accounting/bank-accounts']")).click();
			Thread.sleep(3000);
			//contacts
			driver.findElement(By.xpath("//button[@data-name='navigation-menu/contacts']")).click();
			Thread.sleep(3000);
			//'+' 
			driver.findElement(By.xpath("(//div[@class='xnav-focusable--child xnav-iconwrapper'])[1]")).click();
			Thread.sleep(3000);
			
			
		}
		
		

	}

