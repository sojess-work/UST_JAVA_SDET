package payload;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

import static io.restassured.RestAssured.*;

import java.io.File;

public class Test_0_post {

	@Test
	public void test2() {

		File file = new File("src/test/java/New/user1.json");


		Response response = given().contentType(ContentType.JSON).
		body(file).
		when().
		post("http://localhost:8080/books").
		then().extract().response();
		System.out.println("response"+response.asString());
	}
}
