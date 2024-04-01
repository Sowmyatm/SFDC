//import io.restassured.RestAssured;
//import io.restassured.response.Response;


//payload: basic request and response msg

//to create sample pojo class:
//ceate an obj of pojo class
//set reqd values to it using setter and getter methods
//instantiate obj mapper class
//invoke writeValueAsString()method by passing the created pojo obj
//retrieve and print obtained json

//200 -successful
//201 - created/300- mutiple choices available for the request
//401- unauthorized -  invalid creds
//403 -  forbidden ,A 403 error code indicates that the server understood the request but refuses to authorize it. 
//500 - internal server error
//404 - page not found

//500 RESOLVE 
//It's also important to ensure that all necessary dependencies and configurations are correctly
//set up in your project, check server logs for errors, restarting the server will help sometimes

//404 RESOLVE -  check the url, filepaths, 
//Check Permissions: Make sure that the permissions on the file or directory containing the resource 
//allow it to be accessed by the web server process.

//400 RESOLVE -Check Request Format - Check for missing or incorrect formatted headers, parameters, 
//or request body.
//Validate Input
//Check Authentication: If authentication is required for the request, ensure that the credentials are included 
//and correct. Invalid or missing authentication credentials can result in a 400 error.

//403 RESOLVE -Check Permissions:  Check file and directory permissions on the server to ensure they allow access to
//the resource.
//Check Authentication: If the resource requires authentication, verify that the user or client is providing valid 
//credentials. 
//Clear Cookies and Cache:Try clearing the browser's cookies and cache and then retrying the request.


//api f/w =created mvn proj, added dependencies in pom, log4j, hamcrest,, schema validation
//created diff pakgs -  utils, tsts(add data, get data, put dta), data tests etc,
//base test- base functions needed in all the clases
//constants - to store some constants anf finite nos we use constants package
	
	//pages - whatever the pages we use in obj repository using page obj model are stored in pages
	
	//testdata -  username, pwds, validation msgs are added in testdata package
	
	//tests - we will write our automation scripts, whatever the testng methods we need to call 
	//we add them in tests folder, add the browser to be used
	
	//utilities - if any other/additional methods need to be accomodated, we add them in utilities
//then pushed the code to github, then to jenkins for cICD.

//Api testing- s/w testing type that validates appln pgmg interface .Interface between client and web services,
//checks functionaly, reliablity,performance and security of the pgmg interface

//API GATEWAY - component or interface that sits betn client and backend services.

//REST API-representational state transfer, architectural style protocol,defines set of constarints to be used
//for creating web services

//URI  -URL + API 

// base uri - root address of the resource

//Pojo class - (Plain Old Java Object)normal class with vars and methods like getter and 
//setter methods

//Schema validation - schema is the template of response

//When there is huge payload how to handle 
//-----------------------------------------
//we use pojo class or serialization and deserialization, 
//conversion from POJO to JSON and Json to pojo back and at run time,we use getter and 
//setter methods, get and set the values and send the request to the payload and when we
//get the response then again by using the get methods from pojo classes and assert them 
//with the response body

//What is an SSL handshake?
//-------------------------------
//What Is a TLS/SSL Handshake and How It Works 
//A Secure Sockets Layer(SSL)/Transport Layer Security(TLS) handshake is the process of 
//creating a safe and secure encrypted communication between the 
//client(user's browser) and the server(web server).

//how do you handle ssl handshake
//upgrade server, use cipher suites(alg sets that helps to secure new connectn, obtain a certificate that
//contain vaild  certificate.

//send security certificates to rest assured
//---------------------------------------------
//The primary reason for using Secure Sockets Layer (SSL) certificates is to keep 
//sensitive information sent across the internet encrypted so that only the intended
//recipient can understand it. This security is important because the information you 
//send on the internet is passed from computer to computer to get to the recipient. Any
//computer between you and the destination can utilize your user name, passwords, 
//and other sensitive information if the information is not encrypted with an SSL 
//certificate.
//In addition to encryption, a proper SSL certificate also provides authentication. 
//With authentication, you can be sure that you are sending information to the right
//recipient and not to an unknown user. You can ensure authentication by using an SSL 
//certificate from a trusted SSL provider.

//popular way to represent resource- xml/json

//auths
//authentication - Authentication is the process of verifying a user's identity
//Password Authentication Protocol (PAP), Authentication Token, Symmetric-Key 
//Authentication, and Biometric Authentication.

//authoziration - the process of granting API access to the authenticated user


//1. api keys - can be sent as a header/query parameter in API requests. The API provider 
//validates the API keys for authentication before granting access to API resources

//2. O-auth 2 - OAuth 2.0 is an authorization protocol that gives API users access to a 
//service without sharing their passwords. It's often used for authentication in web, 
//mobile and desktop applications. 
//OAuth 2.0 is based on the 'token' concept, which allows API users to show they are 
//authenticated without sending the API their username and password every time they 
//request.

//3. HTTP Authentication Schemes (Basic & Bearer) -  
//HTTP Basic Authentication: API consumers send API requests with a username and password 
//in an HTTP header. API providers then validate the credentials to authenticate API users. 
//This simple API authentication method lacks security, as API requests can be 
//intercepted easily.

//"HTTP Bearer Authentication: API consumers send API requests with a unique API access
//token in an HTTP header. API providers then validate the API access token to 
//authenticate API users.
//This API authentication method is more secure than Basic, as API requests cannot be 
//intercepted easily.

//PATH PARAM - is used to match a part of the URL as a parameter

//QUERY PARAM - is used to access key/value pairs in the query string of the URL, Passed at the end of the url in
//key value pairs

//Jackson-obj-mapper used for serialization and deserialization
//-------------------------------------------------------------
//The Jackson ObjectMapper can read JSON into Java objects and write Java objects to JSON

//object-mapper
//--------------
//ObjectMapper is the main actor class of Jackson library. ObjectMapper class 
//ObjectMapper provides functionality for reading and writing JSON, either to and from 
//basic POJOs


//base uri- root address of the resources

//URI
//-----
//URI identifies a resource and differentiates it from others by using a name, location,
//or both.
//A URI can be made up of several components, including the host name or IP address and
//an optional query string.
//URI is usually used in XML, tag library files, 

//URL
//-----
//URL identifies the web address or location of a unique resource.
//URL is mainly for searching web pages on the internet.
//URL scheme is a protocol, such as HTTP and HTTPS.

//schema - template of the response . it is used to validate the responses

//serialization-deserialization
//-----------------------------------
//conversion of java objects to json - seri- we will be using filed o/p stream and obj o/p stream , we have to
//create obj for that
//conversion of json to java objects - deseri - file i/p stream and obj i/p stream where we will read the obj.
//.read obj method is used in deserialization, i have used seri and deseri in rapi using jackson bind data using 
//obj mapper class

//monolithic archi and micro
//--------------------------------
//complete unit. not divided
//whenever api fails, other part of the appln still works so migration to microsystems

//proxy tools
//mobile - proxy , proxy -internet
//
//proxy tools - listening to all the communication bet mobile and internet
//charles and fiddler are proxy tools

//hamcrest matchers 
//--------------------
//-Hamcrest is commonly used with junit and other testing frameworks for making assertions.
//Hamcrest provides matchers for making assertions on arbitrary Java objects.

//code - post
//-------------------
//Response res =RestAssured.given()
//				.when()
//				.header("Content-Type","application/json")
//			 .body("{\"username\":\"sowmyat.nov22@ta.com\",\"password\":\"sowmyat123\"}")
//				.post("/login")
//			    .then().assertThat().statusCode(201).extract().response();	

//                      OR

//POST

// public void postRequest() {
//Response response = given()
					//.header("Content-type", "application/json")
					//.and()
					//.body(requestBody)
					//.when()
					//.post("/posts")
					//.then()
					//.extract().response();
					//
					//Assertions.assertEquals(201, response.statusCode());

//Assertions.assertEquals("foo", response.jsonPath().getString("title"));
//Assertions.assertEquals("bar", response.jsonPath().getString("body"));
//Assertions.assertEquals("1", response.jsonPath().getString("userId"));
//Assertions.assertEquals("101", response.jsonPath().getString("id"));

//GET  method
//public void getRequest() {
//Response response = given()
//.contentType(ContentType.JSON)
//.when()
//.get("/posts")
//.then()
//.extract().response();
//
//Assertions.assertEquals(200, response.statusCode());


//Delete
//public void deleteRequest() {
//    Response response = given()
//            .header("Content-type", "application/json")
//            .when()
//            .delete("/posts/1")
//            .then()
//            .extract().response();
//
//    Assertions.assertEquals(200, response.statusCode());


