import com.jayway.restassured.RestAssured;
import com.jayway.restassured.config.SSLConfig;
import com.jayway.restassured.path.json.JsonPath;
import com.jayway.restassured.response.Response;
import com.jayway.restassured.response.ResponseBody;
import com.jayway.restassured.specification.RequestSpecification;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class getF1LapTimes {
		@Test
	public static void getExample5(String id) {

	    RestAssured.baseURI = "http://ergast.com/api/f1/2011/5/laps/1";

	    Response response = null;

	    try {
	 	   response = RestAssured.given()
	 			   .when()
	 			   .queryParam("id", id)
	 			   .get();
	    } catch(Exception e){
	 	   e.printStackTrace();
	    }    

	    System.out.println("Response: " + response.asString());
	    System.out.println("Status Code: " + response.getStatusCode());

	    assertEquals(200, response.getStatusCode());
	}
}