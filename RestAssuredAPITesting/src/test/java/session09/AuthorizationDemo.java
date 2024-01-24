package session09;

import org.json.simple.JSONObject;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class AuthorizationDemo {


	@SuppressWarnings("static-access")
	@Test
	public <JSONObject> void BearerToken()
	{
		//https://gorest.co.in/public/v2/users
		//create requsest specification
		RequestSpecification requestSpec = RestAssured.given();
		
		requestSpec.baseUri("https://gorest.co.in");
		requestSpec.basePath("/public/v2/users");
		
	/*	{
			"name":"CodeStudio1",
			"gender":"Female",
			"email":"Code1@gmail.com",
			"status":"Active"
			}*/
		
		JSONObject payload = new JSONObject();
		((RestAssured) payload).put("name", "pravin");
		((RestAssured) payload).put("gender", "male");
		((RestAssured) payload).put("email", "aug25praveen@gmail.com");
		((RestAssured) payload).put("status", "Active");
		
		/* JSONObject payload = new JSONObject(); origional
		payload.put("name", "pravin");
		payload.put("gender", "male");
		payload.put("email", "aug25praveen@gmail.com");
		payload.put("status", "Active");*/
		
		String AuthToken = "Bearer 866218be3a275e793abe788f9a83a53da434004c5718abdc6215cd26d5fc6be2bhh";
	
		requestSpec.headers("Authorization", AuthToken).
		contentType(ContentType.JSON).
		body(payload.toJSONString());
		
		//perform post request
		Response response = requestSpec.post();
		

		//validate status code 
		Assert.assertEquals(response.statusCode()/*actual*/, 201/*expected*/,"check for status code");
	
		//print status line & response boy
		System.out.println("Responsne status line:" + response.statusLine());
		System.out.println("Response body:" + response.body().asString());
		
		
	}
}
