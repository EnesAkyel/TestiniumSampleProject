import com.jayway.restassured.RestAssured;

import com.jayway.restassured.config.SSLConfig;
import com.jayway.restassured.response.Response;
import com.jayway.restassured.response.ResponseBody;
import com.jayway.restassured.specification.RequestSpecification;

import static org.junit.Assert.assertEquals;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.apache.log4j.Logger;

public class RestAssuredWebApi {
	private static Logger log = Logger.getLogger(RestAssuredWebApi.class);

	@BeforeClass
	public static void getData() {
		log.info("Info...");
	}

	@Test
	public void testApi() {

		getF1Seasons.getExample1();
		getF1Drivers.getExample2();
		String id = getPlaceHolder.getExample3();
		getF1Round.getExample4(id);
		getF1LapTimes.getExample5(id);
		restAssuredPostRequest.submitForm();
    }

	@AfterClass
	public static void after() {
		log.info("Test Finished");
	}
}