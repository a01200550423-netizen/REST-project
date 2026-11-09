import endPoints.endpoints;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.testng.annotations.Test;
import pojo.RequestClasses.createTokenRequest;
import pojo.ResponseClasses.createTokenResponse;

import static io.restassured.RestAssured.given;

public class createTokenTC extends BaseClass{

    @Test
    public void checkloginwith_validdata(){
        createTokenRequest createtoken1 = new createTokenRequest();
        createtoken1.setusername("admin");
        createtoken1.setpassword("password123");
        createTokenResponse mytoken = given().header("Content-Type","application/json")
                .body(createtoken1)
                .when().post(endpoints.auth)
                .then().log().all().statusCode(200).extract().as(createTokenResponse.class);
    }

    @Test
    public void checkloginwith_invaliddata(){
        createTokenRequest createtoken1 = new createTokenRequest();
        createtoken1.setusername("admin12345");
        createtoken1.setpassword("password123");

        Response mytokens = given().header("Content-Type","application/json")
                .body(createtoken1)
                .when().post(endpoints.auth)
                .then().log().all().statusCode(200).extract().response();
        JsonPath js =  mytokens.jsonPath();
        System.out.println(js.getString("reason"));
    }
}
