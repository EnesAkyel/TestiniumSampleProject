import com.jayway.restassured.RestAssured;
import com.jayway.restassured.config.SSLConfig;
import com.jayway.restassured.http.ContentType;
import com.jayway.restassured.parsing.Parser;
import com.jayway.restassured.path.json.JsonPath;
import com.jayway.restassured.response.Response;
import com.jayway.restassured.response.ResponseBody;
import com.jayway.restassured.specification.RequestSpecification;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class getPlaceHolder {
	@Test
	public static String getExample3() {

	    String url = "https://jsonplaceholder.typicode.com/todos/1";
	    RestAssured.defaultParser = Parser.JSON;

	    Response response = null;
	    String id = null;

	    try {
	 	   response = RestAssured.given().headers("Content-Type", ContentType.JSON, "Accept", ContentType.JSON).
                   when().get(url).
                   then().contentType(ContentType.JSON).extract().response();


	    } catch(Exception e){
	 	   e.printStackTrace();
	    }    

	    id = response.jsonPath().getString("id");
	    System.out.println("Response: " + response.asString());
	    System.out.println("Status Code: " + response.getStatusCode());
	    System.out.println(id);

	    assertEquals(200, response.getStatusCode());
	    
	    return id;
	}
}