
import static io.restassured.RestAssured.given;

import java.util.HashMap;

import org.testng.annotations.Test;

import io.restassured.http.ContentType;

public class UserGetTest {

	@Test
	public void sampletest() {
		HashMap<String, String> map = new HashMap<String, String>();
		map.put("name", "Priya");
		map.put("email", "priyanka@gmail.com");
		map.put("gender", "female");
		map.put("status", "active");
		given().when().auth().oauth2("d941b2d53a8641c1ea281940726a3d5e27c849ceb92e8fb2ae1cd97def96e03e").contentType(ContentType.JSON)
		.body(map)
				.post("https://gorest.co.in/public/v2/users").then().statusCode(201);

	}

}
