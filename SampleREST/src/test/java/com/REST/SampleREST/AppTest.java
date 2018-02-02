package com.REST.SampleREST;

import io.restassured.RestAssured;
import io.restassured.http.Header;
import io.restassured.http.Headers;
import io.restassured.http.Method;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import junit.framework.Assert;

/**
 * Unit test for simple App.
 */
public class AppTest {
	public static void main(String[] args){
		RestAssured.baseURI= "http://restapi.demoqa.com/utilities/weather/city";
		RequestSpecification httpRequest = RestAssured.given();
		Response response = httpRequest.request(Method.GET, "/Noida");
		String responseBody = response.getBody().asString();
		System.out.println("Response ="+responseBody);
		int status = response.getStatusCode();
		System.out.println("Status : "+status);
		String statusLine = response.getStatusLine();
		System.out.println(statusLine);
		
		Headers allheader = response.headers();
		for(Header header: allheader){
			System.out.println("Key: " + header.getName() + " Value: " + header.getValue());
		}
		
		String contentType = response.header("Content-Type");
		Assert.assertEquals(contentType /* actual value */, "application/json" /* expected value */);
		
		JsonPath jsonPathEvaluator = response.jsonPath();
		System.out.println("Json print : "+jsonPathEvaluator.get("City"));
		System.out.println("Json print : "+jsonPathEvaluator.get("WindDirectionDegree"));
	}
}
