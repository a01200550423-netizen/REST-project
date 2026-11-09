import endPoints.endpoints;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class getbooksTC extends BaseClass{
    @Test
    public void checkbooks_id(){
        given().when().get(endpoints.booking).then().log().all().statusCode(200);
    }
}
