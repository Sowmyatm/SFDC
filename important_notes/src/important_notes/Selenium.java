package important_notes;

//import java.util.concurrent.TimeUnit;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.interactions.Actions;
//import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.WebDriverWait;

//What is the type of framework you are using?
//Ans: Hybrid with TestNG

//selenium grid - one m/c will act as hub and it will check for the connected m/cs called 
//nodes.based on the actual capabilities will send the requests to nodes & execute on dem


//DATE PICKER
//WebElement datePicker = driver.findElement(By.id("datepicker"));
//datePicker.sendKeys("2024-02-14"); // Assuming date format is YYYY-MM-DD
//we locate the date picker input field using its ID and then use the sendKeys() method to enter the desired date.
//we may need to adjust the locator strategy (By.id(), By.xpath(), etc.) based on the HTML structure of your
//webpage and the implementation of the date picker.


////Selenium is a web automation tool that runs on all the browsers
//Selenium IDE, ChromeDriver, Chromebrowser
//Json wire protocol acts as communicataion protocol between chrome driver and chrome 
//browser

//desired capabilities in selenium
//1. getCapability();
//This method helps in retrieving the capabilities of the current system on which the 
//tests are being performed.
//public java.lang.Object getCapability(java.lang.String capabilityName)
//
//2. setCapability();
//3.3. getBrowserName();
//4. setBrowserName();
//5. getVersion();
//6. setVersion();
//7.getPlatform();
//8.setPlatform();

//Handling Dynamic Auto Suggestion
//Enter text to trigger suggestions: Locate the input field and use the send_keys method
//to enter the desired text that will trigger the suggestions.
//Wait for suggestions to appear: ...
//Locate and select the suggestion:

//xpath is more preferred - supports both xml and html docs
	
	//to format the pom.xml -- ctrl+shft+f
	//chrome driver setup in eclipse
	//create a object of chromedriver
	//set the system property of chromedriver
	
	//System.setproperty("webdriver.chrome.driver","give path of the chromedriver exe");
	
//we can use either system.setproperty or webdrivermangr to set up the chromedriver. chromedriver should 
		//be installed in 1st case. in webdrivermngr, no need of chrome installation.
			
	
	//WebDriverManager.ChromeDriver().setup();
	//WebdriverManager.FireFoxDriver.setup();
	//WebdriverManager.SafariDriver.setup();
	
	//webdriver manager is external lib which automatically downloads the webdriver
	//webdrivermngr checks the chrome version and automatically downld appropriate version
//of chromedriver
	
	//create objects of webdriver
	//WebDriver driver = new ChromeDriver();
	//WebDriver driver = new firefoxDriver();
	
	//driver.geturl(https://govvvvvvogle.com);
	
	//driver.manage().window().maximize();//to maximize the browser window
	//driver.quit //closes the browser window
	
	//types of locators 1.Direct locators - id, name, className, tagname - faster, 
//backward traversing not possible
	
	
	//2.Indirect locators - xpath css, linktext, partial linktext- slower
	//X-path - - used to identify an element uniquely, 
	//- navite forward or backward direction
	
			//2 types - Relative xpath- //tagname[@attribute = "value"] - starts from any 
//node element, faster
	
			// Absolute xpath- starts from root node to the bottom most node
	
	//to locate dynamic elements(the value keeps on changing) xpath is used. direct 
//locators will fail in this case.
	
	//types of methods in xpath
	
	//syntax - //tagname[method(@attribute)='value'] - use ',' instead of '='
	
	//contains - //input[contains(@name,'username')]
	//starts with - //input[starts-with(@name,'user')]
	//ends with -//input[ends-with(@name,'name')]
	//OR  -  //input[contains(@type,'password')or(name='pw')]
	//AND  - //input[contains(@class,'input r4 wide mb16 mt8 password')and(@id='password')]
	
	//TEXT - //*[text()='Remember me']
	
	//CSS-Cascade style sheet - navigate only in fwd direction
	//identify any element by its:
	//classname - .   ex: .input.r4.wide.mb16.mt8.password 
	//id - #          ex : #username
	//tagname[attribute='value']  ex: input[name='username']
	//starts with(^)  - tagname[attribute^= starting letters] 
	//contains (*) - tagname[attribute*=letters in that word]  ex: input[id*=ername] 
	//ends with($) -tagname[attribute$=ending letters]
	
	//RemoteWebDriver is the parent class of chromedriver class, safari class, firefox 
//classes
	
	//dropdown handling- select class
			//Select s = new select(find.element(By.id(city)));
			//s.selectByIndex(2);
		
			//s.selectByVisibleText("New Last Week"); - this also works
	
	//Handling Alerts
//	driver.switchTo().alert().accept();
//	driver.switchTo().alert().dismiss();
//	driver.switchTo().alert().sendKeys(null);
//	driver.switchTo().alert().getText();
	
	//Handling mouse hover
//			WebElement usrmnu=driver.findElement(By.id("userNav-arrow"));
//			usrmnu.click();
//			Thread.sleep(2000);
//			Actions action = new Actions(driver);
//			action.moveToElement(usrmnu).build().perform();
//			driver.findElement(By.xpath("//a[@title='My Settings']")).click();

	
	//		Waits
//	allow automated testers to pause test scripts for a specific period or until a 
//particular condition is met, preventing errors due to timing issues.

	//thread.sleep(10000)-HARD WAITS(DEAD WIATS)(FROM JAVA) - if the element is loaded 
//in 2 secs, remaining 8 secs will be wasted. that inturn results in delay in execution
//time. so we use dynamic waits which is available in selenium library.
	
	//Dynamic waits(SELENIUM LIBRARY)- once the element is loaded it does not wait for 
//remaining time,it moves to next element. If the elt doesnt appear in given time, it 
//will not wait more. the script will fail 3 types of D waits
	
	//IMPLICIT WAIT - implicit wait should be declared after the driver object is defined.
//Once it is declared in the pgm, no need to repeat again. IT Waits for page load
	
	//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
	//EXPLICIT WAIT - waits for slow loading elements,or ajax 
//elements(Asynchronous java elements),depends on elt to load
	
	//WebDriverWait wait= new WebDriverWait(driver,30); //explicit waits declare in the 
//beginning,use it later using the object
	
//	wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath(null))));
	
	//we dont mix the waits together
	//we use explicit waits and then we put synchronization in the form of  webdriver
//wait or fluent wait
	
	
	//FLUENT WAITS - looks for the webelement repeatedly at regular intervals until 
	//timeout happens or until the obj is found. more useful with webelements that takes
	//longer duration to load.

//Take Screenshot
//---------------------
//TakesScreenshot screenshot = (TakesScreenshot) driver;
//File sourceFile = screenshot.getScreenshotAs(OutputType.FILE);
//String dstPath = System.getProperty("user.dir")+"\\src\\test\\java\\screenshots\\";
//File dstFile = new File(dstPath);
//FileUtils.copyFile(sourceFile,dstFile);
//return dstPath;
	
	//Boolean methods available: How do you check the elmt is visible or not
	//isDisplayed();
	//isEnabled();
	//isSelected();
	
	//WINDOW HANDLING
	//driver.getWindowHandle() - gives the ID of the current active window
	//driver.getWindowHandles() - gives the ID's of all the active windows open in the
//browser
	
	//Set<String> windowsID = driver.getWindowHandles();
	//Set<String> windowsID =driver.getWindowHandle();
	//Iterator<String>itr = WindowsID.iterator(); 
	
	//JSExecutor = It is an interface used to execute javascript through selenium 
//webdriver
	
	//JavascriptExecutor js = (JavascriptExecutor)driver;
	
	//alert=
	//JavaScriptExecutor js = (JavaScriptExecutor)driver;
	//js.executeScript("alert('Welcome to JAVA');");
	
	//click=
	//JavaScriptExecutor js = (JavaScriptExecutor)driver;
	//js.executeScript("arguments[0].click();",button(webelt));
	
	//scrollBy = 
	//JavaScriptExecutor js = (JavaScriptExecutor)driver;
	//js.executeScript(window.scrollBy(0,700);");
	
	//manipulate attributes

	//title/add/upload imgs or files
	//JavaScriptExecutor js = (JavaScriptExecutor)driver;
	//sendkeys = js.executescript("arguments[0].value='sowmya.prasi@gmail.com';",button);
	
	//iframes = driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@id='']"))); 
	
	
	//driver.close -  closes the current window
	//driver.quit -  closes all the tabs/ closes all the instances that are open. 
	
	//Robot class= to perform keyboard and mouse actions
	//Robot r = new Robot();
	//r.keyPress(KeyEvent.VK_ENTER);
	//r.keyRelease(KeyEvent.VK_Enter);
	
	//Drag and Drop - actions class
	//Actions action = new Actions(driver);
	//action.clickAndHold(target elt).moveToElement(drop).release().build().perform();
	
	
//	Assertions shouldn't be included in Page Object Model
//	Page Object - make the page easier to interact with
//	Test - manage the test, possibly delegating to other things such as the Page Object.
	
//	So the assertions are the job of the test. The Page Object shouldn’t know it’s part of
//a test at all - it just provides a way to interact with a page, and this happens to be
//used as part of a test.
	
//stale element exception- dom got updated with new page, element maintains an id 
//internally and that id got expired based on new dom so selenium will throw stale elt 
//exception
	
	//sf framework
	//---------------
	//constants - to store some constants and finite nos we use constants package
	
	//pages - whatever the pages we use in obj repository using page obj model are 
//stored in pages
	
	//testdata -  username, pwds, validation msgs are added in testdata package
	
	//tests - we will write our automation scripts, whatever the testng methods we need 
//to call we add them in tests folder, add the browser to be used
	
	//utilities - if any other/additional methods need to be accomodated, we add them 
//in utilities


//keyword driven framework
//------------------------------
//The keyword-driven framework is based on keywords that form the basis of the functionality, 
//take in parameters, and throw the relevant output

//Data driven framework
//-------------------------
//A Data Driven Framework in Selenium is a technique of separating the “data set” from the 
//actual “test case” (code).

//modular driven 
//------------------
//creation of small, independent scripts that represents modules, sections and functions
//of the application under test. 

//hybrid f/w
//------------------
//Hybrid Driven Framework in Selenium is a mix of both the Data-Driven and Keyword Driven 
//frameworks
