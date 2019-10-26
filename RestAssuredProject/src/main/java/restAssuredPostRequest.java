import org.junit.Test;

import com.jayway.restassured.RestAssured;
import com.jayway.restassured.config.SSLConfig;
import com.jayway.restassured.http.ContentType;
import com.jayway.restassured.path.json.JsonPath;
import com.jayway.restassured.response.Response;
import com.jayway.restassured.response.ResponseBody;
import com.jayway.restassured.specification.RequestSpecification;

public class restAssuredPostRequest {

    @Test
    public static void submitForm() {
        RestAssured.baseURI = "https://ptsv2.com/t/rim63-1572034090";
        
        Response response = null;
        
        try {
	        response = RestAssured.given()
	        		.contentType(ContentType.JSON)
	        		.post("/post");
        } catch(Exception e) {
        	e.printStackTrace();
        }
        System.out.println("Post Response " + response.asString());
    }
}