package tests;

import java.util.HashMap;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import restutils.RestUtils;

public class delete extends BaseTest {
	@Test
	public void deleteData()
	{
		RestAssured.baseURI="https://us-central1-qa01-tekarch-accmanager.cloudfunctions.net";
		

		HashMap<String, String> headers = new HashMap<String, String>();
		headers.put("Content-Type", "application/json");
		headers.put("token", loginToken);
		
		System.out.println(loginToken);
		
		String path = "/deleteData";
		
	
		
		Response resDel = (RestAssured.given().header("Content-type", "application/json").when().
	    		delete("/posts/1").then().assertThat().statusCode(200).extract().response());

		
		System.out.println(resDel.asPrettyString());
		
		
		    
	}

}
