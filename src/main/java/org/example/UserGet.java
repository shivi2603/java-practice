package org.example;

import static io.restassured.RestAssured.*;

import java.util.HashMap;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class UserGet {

	public static void main(String[] args) {
		Response response = given().get("https://gorest.co.in/public/v2/users");
		response.prettyPrint();

		HashMap<String, String> map = new HashMap<String, String>();
		map.put("name", "Priya");
		map.put("email", "priya1@gmail.com");
		map.put("gender", "female");
		map.put("status", "active");
		Response postresponse = given().auth()
				.oauth2("d941b2d53a8641c1ea281940726a3d5e27c849ceb92e8fb2ae1cd97def96e03e")
				.contentType(ContentType.JSON).body(map).post("https://gorest.co.in/public/v2/users");

		postresponse.prettyPrint();

		Response putresponse = given().auth().oauth2("d941b2d53a8641c1ea281940726a3d5e27c849ceb92e8fb2ae1cd97def96e03e")
				.contentType(ContentType.JSON).body(map).put("https://gorest.co.in/public/v2/users/6975874");
		putresponse.prettyPrint();
		map.put("email", "priyabathula@email.com");

		Response patchresponse = given().auth().oauth2("d941b2d53a8641c1ea281940726a3d5e27c849ceb92e8fb2ae1cd97def96e03e").contentType(ContentType.JSON).body(map).patch("https://gorest.co.in/public/v2/users/6975874");
		patchresponse.prettyPrint();
	}

}
