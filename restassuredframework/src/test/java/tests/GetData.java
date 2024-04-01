package tests;

import java.util.HashMap;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;


//
//import java.util.HashMap;
//
//import org.testng.annotations.Test;
//
//import io.restassured.RestAssured;
//import io.restassured.response.Response;
//
public class GetData extends RestAPISession{
	@Test
	public void getdata() {
		
//		RestAssured.baseURI="https://us-central1-qa01-tekarch-accmanager.cloudfunctions.net";
//		HashMap<String,String> loginAccount = new HashMap<String,String>();
//		loginAccount.put("username", "sowmyat.nov22@ta.com");
//		loginAccount.put("password", "sowmyat123");
//		
////	Response res =RestAssured.given().header("Content-Type","application/json").when()
////			.body("{\"username\":\"sowmyat.nov22@ta.com\",\"password\":\"sowmyat123\"}").post("/login");
////	OR
//	
//		Response res =RestAssured.given().when().header("Content-Type","application/json")
//					.body(loginAccount).post("/login")
//					.then().assertThat().statusCode(201).extract().response();	
//		System.out.println(res.asPrettyString());
//	
//		String token =res.jsonPath().getString("token").replace("[", "").replace("]", "");
//	
//		System.out.println(token);
//		
		HashMap<String, String> headers = new HashMap<String, String>();
		headers.put("Content-Type", "application/json");
		headers.put("token", loginToken);
		System.out.println(loginToken);
		Response resGet =RestAssured.given().when().headers(headers).get("/getdata").then().assertThat().statusCode(200).extract().response();	
	System.out.println(resGet.asPrettyString());
}
}

	


	

