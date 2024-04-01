//APPIUM -  open source test automation tool useful to automate android and ios platform apps
//also appium is native, hybrid & mobile web apps test automation tool developed and supported by saucelabs
//offers cross platform testing

//ADB COMMANDS -  by using adb commands we can install/uninstall an appln, can takescreenshot, push and pull 
//the files

//APK - Android Appln Package - similar to exe fileswhich are used to install pgms on windows.
//apk files are used exclusively on android devices. extn is .apk

//TRICKS AND TIPS TO SPEED UP THE MIGRATION TESTS - we have to try not to write the same sub-scenarios twice 
//in your tests, make a diagram of what your scenarios are and split them into sub activities, make those tasks
//parametric and call them in your tests




//Emulators - Virtual device on android
//Simualtors - virtual device on ios is simulator

//a)NATIVE APPS: A native application is developed specifically for one platform. n app you can download and 
//install on your device. A native mobile app is developed specifically for a mobile device. 
//through google's app store or apple's app store
//ex -  watsapp, facebook


//b) MOBILE WEB APPS - the browsers that can be opened in the mobile
//OR 
//the apps to access website/s on mobile using
//different browsers like Chrome, Firefox by connecting to a mobile network or wireless network like WIFI. 
//web optimized for good phone experience. they are not mob apps but
//websites written in  HTML/CSS and run by a browser


//c)HYBRID APPS :  are combinations of native app and web app. They run on
//devices or offline and are written using web technologies like HTML and CSS. 

//What are Testability layers?
//having some test-related objs in your app which are activated only whn your tests run

////DIFF B/W WEB-APP AND MOBILE-APP
//native apps are faster, doesn't need internet, more safe and secure than web app as they are approved by
//appstore. store approval is difficult, maintaining and consistently updating of apps costs more.

//web apps function in browser,so no need of installing or dwnldng. no need of approval from appstore,
//poor safety and security since it doesn't need approval from app store


// I don’t want to set up a whole infrastructure for my tests and I don’t want to spend money on HW. Can Appium
//help me?
//can rely on some web services that already deployed a whole architecture of Appium servers for your tests.
//Most of them are online labs and they support Selenium and Appium.



//DIFFERENCE B/W NATIVE AND WEB APPS
//no ned of internet, faster than web aps
//can access s/m device resource like camera, gps
//more safety and security than web apps
//app store approval is difficult
//maintaing &consistent update of apps cost more

//WEB APPS - it funs in browser, no need of installing or dwnldng
//these apps can be set to update themselves or automatically
//store approval is not needed, needs internet connection
//slower than mobile apps


//run tests in MULTITHREADED ENV - yes, possible but make sure that no 2 tests are running 
//simultaneously on the same appium server

//MANAGE DIFF SCREEN SIZE - js, dimension class

//BASIC PREREQUISITS - android studio, android sdk tools, eclipse ide, testng, apk app info etc

//REQUIREMENTS - driver client, appium session, desired capabilities, driver commands


//STRONGEST POINT - Appium is based on Selenium which is an HTTP protocol by Google designed to automate browsers.
// Appium is also designed to encourage a 2-tier architecture: a machine runs the test written in one language 
//and another one actually executes it.
//Appium provides a flexible testing environment across multiple platforms is one of its strongest 
//points and supports are 3 types of app testings , native, hybrid and mobilewebapp. Appium supports a wide range 
//of programming languages, including Java, Python, Ruby, JavaScript, and C#.


//WHY DO THE APPIUM CLIENT EXISTS?
//Appium server provides extensions to the official protocols, so that the users can have access to install and 
//uninstall the the apps during the session. this is why we need appium clients



//DESIRED CAPABILITIES- set of key and value pairs.
//platform name, platform version, device name, - 

//MOBILE WEB APPS- web optimized for good phone experience. the are not mob apps but
//websites written in  HTML/CSS and run by a browser

//UIAutomator - supports no of std appium caps. it is an android testing f/w that allows us
//to write scripts that can interact to any appl-n installed in the device

//locators -id, class name, xpath, accessibility id, content desc(android),Android UIAutomator, 
//iosUIAutomator, android viewtag

//POSSIBLE ERRORS - couldn't find adb, desired capabilities are needed but not provided
//session not created exception

//LOGS :Logcat is a command-line tool that is used to get detailed system logs of android devices. 
//Connect your device via cable or over WiFi
//Type adb logcat > logcat.txt This will save the logs to logcat.txt.
//adb logcat -d >  : gives logs at debug level
//adb logcat 


//SELENDROID -Selendroid was an open-source test automation framework for Android applications. It allowed
//developers and testers to write tests using Selenium WebDriver APIs for Android applications.

//The IWebDriver interface provides a set of commands and properties that enable developers and testers to
//perform automation testing of web applications


//SWIPE,ZOOM? - TouchAction.press();
//TouchAction touchAction = new TouchAction(driver);
//        touchAction.press(PointOption.point(startX, startY))
//                   .waitAction()
//                   .moveTo(PointOption.point(endX, endY))
//                   .release()
//                   .perform();


//ZOOM -  touchAction.longPress(ElementOption.element(element))
//                   .waitAction(WaitOptions.waitOptions(Duration.ofMillis(1000)))
//                   .moveTo(ElementOption.element(element, 100, 100))
//                   .release()
//                   .perform();
//    }


//MANAGE DIFF SCREEN SIZE:  Appium provides device metrics such as screen size, screen density, and orientation.
//USING EMUL AND SIMUL :: Test your application on a variety of emulators and simulators with different screen sizes 
//and resolutions to cover a wide range of devices.

//public static void main(String[] args) {
//        // Initialize Appium driver
//        AndroidDriver<WebElement> driver = initializeDriver();
//
//        // Find the element to zoom
//        WebElement element = driver.findElementById("elementId");

//zoom(driver, element);


//HOW TO FIND X-PATH AND DOM ELEMENT -  connect ur phone or emulator with appium desktop client
//start inspector session
//start session by specifying capabilitis for device, device name, platform name, 
//plat version, app package, app activity
//click on select elt icon once app is launched
//locator will be displayed in selected ele section
//can make use of UIAutomateViewer in case of android app

//LIMITATIONS OF APPIUM- android lower that 4.2 is not allowed
//no support to run appium inspector on microsoft windows
//limited support for hybrid app testing

//NEED SERVER M/C TO RUN APPIUM?
//No, you don't need server machine to run tests on Appium. Appium facilitates a 2-tier architecture 
//You can have Appium running on the same machine where your test runs.

//HOW TO RUN MANUAL TESTS FOR MY MOBILE NATIVE APP OR HYBRID APP?
//by using emulators and simulators. Emulators and simulators let you select the mobile device model 
//and run it on your computer screen. They mimic the device and give you a gist of how the app will 
//behave when used on real devices after launch.

//MANAGE DIFFERENT SCREEN SIZE
//to automate screen size testing is to use an emulator or a simulator that mimics the behavior and 
//characteristics of different devices

//Android studio - creating emulators and simulators

//appium client - appium desktop client is an open source tool which also has graphical user interface 
//or GUI enabled which can be used for the automated testing of various mobile applications


//CHALLENGES OF MOBILE APP -
//Biometrics automation is not possible on real devices,
//Setting up the appium environment on new machine is a nightmare as it needs multiple tools like java, 
//android sdk, UiAutomator, XCUITest, xcode, simulators, carthage, node etc and versions of all these tools 
//needs to be compatible with each other.
//Running tests on emulators is painful as it runs very slowly especially launching the emulator is very 
//time consuming.
//Many platforms - Android, iOS, Windows, Firefox OS
//Many versions of Same platform - e.g. In iOS, possible versions can be 11, 12, 13 etc
//Many device types - Tablets, Phones, iPads
//Device orientation - Portrait and landscape Orientation can cause issues in testing.

//SETUP ANDROID DRIVER
//Install the Java Software Development Kit (JDK)
//2. Setup Java Environment System Variable/Path on Windows
//3. Install Android SDK and its packages

//5. Set Up Android Environment Variable / Path
//6. Download and Install Node.Js
//7.dwnload And Install Appium Desktop Client thro github
//8.Enabling Developer Mode Options on Android Phone
//9.set desiredcapabilities

///setup android/ ios driver
//---------------------------
//AndroidDriver<MobileElement>driver = new AndroidDriver<MobileElement>(url,dc);




//APPIUM INSPECTOR- is a tool for identifying mobile appln elets.It provides an interface for inspecting
//and interacting with elements across different mobile platforms, such as iOS and Android. Thus it simplifies 
//the testing process for apps that need to run on multiple platforms.



//BASIC COMMANDS IN SELENIUM PROTOCOL
//GET commands - getTitle(), getUrl()
//WAIT commands -  
//navigation commands - driver.navigate().forward(); driver.navigate().back();
//comands to find specific elets - driver.findElementBy


//What mobile web browsers can I automate in the Android emulator?
//Chrome on Android and Safari on iOS 

//UIAUTOMATEVIEWER - Appium UiAutomator2 Driver automates native,
//hybrid and mobile web apps, tested on emulators and real devices. 
//to inspect the elements(older type to identify the elts. we use appium inspector now)

//The XCUITest framework was specifically designed FOR testing THE iOS apps

//SETUP ANDROID /IOS DRIVER
//AndroidDriver<MobileElement>driver = new AndroidDriver<MobileElement>(url,dc);

//PROS AND CONS - open src, supporte e2e testing, cross platform testing. can automate hybrid, web and native
//mobile appln SUPPORTS CROSS PLAT TESTING, 
//CONS - setting up appium locally is difficult, slow test exec, 
//working with app objs is difficult

//HOW DO YOU SEPERATE SCRIPTS FOR IOS AND ANDROID
//Yes if the identifiers like ID, Name or Xpath used for both the applications are same. Then you can execute
//the same script on both the Apps. APPIUM java client has page factory tools which are similar to selenium


//MANAGE DIFFERENT OS
//Regular Updates and Maintenance:Stay informed about OS updates and new releases from vendors such as
//Microsoft, Apple,
//Compatibility Testing:
//Test your software on different OS versions to ensure that it functions correctly and consistently across all 
//supported platforms.

//DIFFICULT SCENARIOS WITH APPIUM - data exchange

//APPIUM DESIGN CONCEPT - when appium is dwnlded and installed, then a server is setup on 
//our m/c.
//it receives conn-n and cmd req frm the client and execute that cmd on mobile devices
//it responds back with http responses.

//APPIUM ARCHITECTURE - appium is an http server,It is written using Node.js platform
//Before initializing the Appium server, Node.js must be preinstalled on the system
//appium works as a client sever achitecture. appium client uses JSON wire protocol to send rquest to the server,
//and it requests session from the server, and the server will create the session ID to the client and the
//connection is established between client and server
//To communicate with iphone the server uses UIAutomation/XCUItest(to perform actions on iphone)
//server uses UIAutomator to perform actions on Android devices

//UDID - id given to devices(emulator/real device)unique id for appium to understand on which device it has to run

//ADVANTAGES OF APPIUM - appium supports cross platform, it supports all 3 types of mobile apps : native,
//hybrid and web
//allows to communicate with other apps . ex :whatspp
//supports built-in apps like alarm, camera, calendar
//it supports any webdriver compatible language : ex : C++, java, perl, Ruby . we just need lang specific libraries

//LIMITATIONS : Android version < than 4.2 is not supported
//slow execution of scripts on ios and android virtual devices
//no parallel execution directly : we can handle using sause labs



//APPIUM FRAMEWORK - created mvn prj, added dependency in pom like testng, extent reports, appium client etc
//used page factory class with init elts to initialize all the elts located by @FindBy or @AndroidFindBy) 
//annotations. page factory will automatically assign the elts to POM(page object model)
//added DC like plat_name, plat_version, device_name, App_activity,app_package etc
//start the appium server, and run the code, if everything worked well, push the code to github and then to 
//jenkins for cicd.


//How much time does it take to write a test in Appium?
//It totally depends on the test which is to be performed. If the test simply runs a scenario, it will take 
//commands of very few lines and also very less interaction will be needed in order to test that application
//whereas if the test is complex and requires transfer of data it will take much more time than the previous one 
//and also it will be a little difficult to read the lines of code of that test. 
//the time needed depends which is the complexity of the test and it is directly proportional to the time taken 
//in Appium.

//What is Charles Proxy?
//Charles Proxy is a proxy tool that sits between your app and the Internet. All networking requests and 
//responses will be passed through Charles Proxy

//IS IT POSSIBLE TO ITERACT WITH with the apps using Javascript
//when the commands are being run on Appium, the server will then send the script to the app that is wrapped in
//an anonymous function that is to be executed.

//SCROLL - using uiautomator function
//driver.findelementByAndroidUIAutomator("new UIscrollable(new UISelector().resourseID("\scrolable:container\"))"
//+".scrollIntoView(new UISelector().resourceId("\element\")).click();


//MIGRATE IF YOU ALREADY HAVE PLATFORM SPECIFIC TESTS??
//If someone already has performed specific tests, then in general views, he/she has to rewrite the code from the 
//beginning in order to test it with Appium.


//HOW DIFFICULT IS TO SETUP APPIUM
//setting up Appium can be difficult as it requires a lot of dependencies with other tools.
//Install java, setting env vars, creating emulators, nodejs installation, apium installation, appium desktop setu


//PERFORMANCE
//Appium is not a huge appln and requires less m/y. 

//DO WE NEED APPIUM
// Appium IS needed only when you have apps targeting more than one platform (Windows, Android, or iOS
//to cite some). Appium becomes essential if you have a web view-based app (necessarily) targeting many platforms 
//out there.

//HOW ACTIVE IS APPIUM
//appium is available in github. the appium team is responsible for developing many diff subsystems revolving around
//appium.(like api's for different languages).thus appium is very active and responsive.


//IOS TESTS WITHOUT APPIUM
//For older versions of iOS Appium might not be supported. For instance, Appium is supported in iOS versions 6.1 
//and later. For earlier versions of iOS, the tool or driver used to drive your mobile applications automated
//test is called iWebdriver.

//ANDROID TESTS WITHOUT APPIUM
//With an emulator driven by Webdriver & Selendroid, you will be able to test Mobile Web Application

//WHAT TYPE OF TESTS ARE SUITABLE FOR APPIUM
//Appium is pretty handy for testing scenarios that users will go through when using your app.















	
	
	


