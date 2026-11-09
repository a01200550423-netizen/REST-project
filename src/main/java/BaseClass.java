import io.restassured.RestAssured;
import org.testng.annotations.BeforeMethod;

public class BaseClass {
    @BeforeMethod
    public void setup(){
        RestAssured.baseURI= "https://restful-booker.herokuapp.com";
    }
}
