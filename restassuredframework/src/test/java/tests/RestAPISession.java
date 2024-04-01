package tests;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;

import org.testng.annotations.Test;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.jayway.jsonpath.JsonPath;

import io.restassured.RestAssured;
import io.restassured.http.Headers;
import io.restassured.module.jsv.JsonSchemaValidator;
import io.restassured.response.Response;
import restutils.RestUtils;
import restutils.Utils;
import testconstants.Constants;
import io.restassured.response.Response;

public class RestAPISession extends BaseTest{
	
//	static Response res;
//	 String token=null;

	@Test
	public void login() throws IOException {
		
		String data = Utils.readFileToString(Constants.ADD_DATA_FILEPATH);
		//String userdata = JsonPath.read(Constants.ADD_DATA_FILEPATH, "$.[0]");
		
		System.out.println(data);
		
		System.out.println(data);
		
		HashMap<String, String> headers = new HashMap<String, String>();
		headers.put("Content-Type", "application/json");
		
		HashMap<String,String> loginAccount = new HashMap<String,String>();
		loginAccount.put("username", "sowmyat.nov22@ta.com");
		loginAccount.put("password", "sowmyat123");
		
		String path ="/login";
		
		Response res = RestUtils.taPost(headers, loginAccount, path);
		
		//RestAssured.baseURI="https://us-central1-qa01-tekarch-accmanager.cloudfunctions.net";
		
//		Response res =RestAssured.given().header("Content-Type","application/json").when()
//				.body("{\"username\":\"sowmyat.nov22@ta.com\",\"password\":\"sowmyat123\"}").post("/login");
//		OR
		
//		Response res =RestAssured.given().when().header("Content-Type","application/json")
//				.body("{\"username\":\"sowmyat.nov22@ta.com\",\"password\":\"sowmyat123\"}").post("/login")
//				.then().assertThat().statusCode(201).extract().response();	
//		System.out.println(res.asPrettyString());
		
		loginToken =res.jsonPath().getString("token").replace("[", "").replace("]", "");
		
		System.out.println(loginToken);
		
	}

	//@Test

//	public void getdata() {
//	
//		HashMap<String, String> headers = new HashMap<String, String>();
//		headers.put("Content-Type", "application/json");
//		headers.put("token", loginToken);
//		
//		System.out.println(loginToken);
//		
//		String path = "/getdata";
//		
//	
//		Response res = RestUtils.taGet(headers, path);
//		
//		System.out.println(res.asPrettyString());
//		
//		Response resGet =RestAssured.given().when().headers(headers).get("/getdata").then().assertThat().statusCode(200).extract().response();	
//	System.out.println(resGet.asPrettyString());
//	
//}
	
//	@Test
//	public void addData() throws IOException {
		
		//RestAssured.baseURI="https://us-central1-qa01-tekarch-accmanager.cloudfunctions.net";
	
		//System.out.println(loginToken);
		
//		HashMap<String, String> headers = new HashMap<String, String>();
//		headers.put("Content-Type", "application/json");
//		headers.put("token", Utils.generateToken());
//		System.out.println(loginToken);
//		
//		Employee e1 = new Employee("334567", "4", "7", "231345");
//		
//		ObjectMapper om = new ObjectMapper();
	
		//System.out.println(om.writeValueAsString(e1));
		
		//Serialization
		//om.writeValue(new File("C:\\Users\\kppra\\eclipse-workspace\\restassuredframework\\src\\test\\java\\testdata\\adduserdata.json"),e1);
		
		//Deserialization
		//Employee e2 = om.readValue(new String(""), Employee.class);
	
		
//		HashMap<String, String> payload = new HashMap<String, String>();
//		payload.put("accountno", "TA-90909092");
//		payload.put("departmentno","9");
//		payload.put("salary", "90000");
//		payload.put("pincode", "909090");
		
		
//	Response resadd =RestAssured.given().when().headers(headers).body(e1).post("/addData");	
//	System.out.println(resadd.asPrettyString());
//}

	@Test
	public void testJsonSchemaLogin() {
		
		File schemaFile = new File("C:\\Users\\kppra\\eclipse-workspace\\restassuredframework\\src\\test\\java\\testdata\\loginSchema.json");
		
		
		HashMap<String, String> headers = new HashMap<String, String>();
		headers.put("Content-Type", "application/json");
		
		HashMap<String,String> loginAccount = new HashMap<String,String>();
		loginAccount.put("username", "sowmyat.nov22@ta.com");
		loginAccount.put("password", "sowmyat123");
		
		String path ="/login";
		RestAssured.baseURI="https://us-central1-qa01-tekarch-accmanager.cloudfunctions.net";
		
		
		Response res = RestAssured.given().when().headers(headers).body(loginAccount).post(path)
		.then().assertThat().body(JsonSchemaValidator.matchesJsonSchema(schemaFile)).and().extract().response();
		
		System.out.println(res.asPrettyString());
		
		
	}
}


		
	
