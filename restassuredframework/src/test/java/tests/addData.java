package tests;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;

import org.testng.annotations.Test;

import com.fasterxml.jackson.databind.ObjectMapper;

import io.restassured.RestAssured;
import restutils.Utils;

public class addData extends RestAPISession {

	@Test
	
	public void addData() throws IOException {

		RestAssured.baseURI="https://us-central1-qa01-tekarch-accmanager.cloudfunctions.net";

		//System.out.println(loginToken);
		
		String path = "/addData";

		HashMap<String, String> headers = new HashMap<String, String>();
		headers.put("Content-Type", "application/json");
		headers.put("token", Utils.generateToken());
		//System.out.println(loginToken);
		
		Employee e1 = new Employee("334567", "4", "7", "231345");

		ObjectMapper om = new ObjectMapper();
		
		//System.out.println(om.writeValueAsString(e1));
		
		//Serialization
		om.writeValue(new File("C:\\Users\\kppra\\eclipse-workspace\\restassuredframework\\src\\test\\java\\testdata\\adduserdata.json"),e1);
		
		//Deserialization
		Employee e2 = om.readValue(new String(""), Employee.class);

}


//HashMap<String, String> payload = new HashMap<String, String>();
//payload.put("accountno", "TA-90909092");
//payload.put("departmentno","9");
//payload.put("salary", "90000");
//payload.put("pincode", "909090");


//Response resadd =RestAssured.given().when().headers(headers).body(e1).post("/addData");	
//System.out.println(resadd.asPrettyString());
}



//import io.restassured.response.Response;
//
//public class addData extends RestAPISession {
//	
//	public void addData() {
//		
////		RestAssured.baseURI="https://us-central1-qa01-tekarch-accmanager.cloudfunctions.net";
//////	Response res =RestAssured.given().header("Content-Type","application/json").when()
//////			.body("{\"username\":\"sowmyat.nov22@ta.com\",\"password\":\"sowmyat123\"}").post("/login");
//////	OR
////	
////		Response res =RestAssured.given().when().header("Content-Type","application/json")
////					.body("{\"username\":\"sowmyat.nov22@ta.com\",\"password\":\"sowmyat123\"}").post("/login")
////					.then().assertThat().statusCode(201).extract().response();	
////		System.out.println(res.asPrettyString());
////	
////		String token =res.jsonPath().getString("token").replace("[", "").replace("]", "");
////	
//		System.out.println(loginToken);
//		
//		HashMap<String, String> headers = new HashMap<String, String>();
//		headers.put("Content-Type", "application/json");
//		headers.put("token", loginToken);
//		System.out.println(loginToken);
//		HashMap<String, String> body = new HashMap<String, String>();
//		body.put("accountno", "TA-90909092");
//		body.put("departmentno","9");
//		body.put("salary", "90000");
//		body.put("pincode", "909090");
//		
//		
//		Response resadd =RestAssured.given().when().headers(headers).post("/addData");	
//	System.out.println(resadd.asPrettyString());
//}
//}

