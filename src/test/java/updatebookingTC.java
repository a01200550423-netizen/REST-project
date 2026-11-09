import endPoints.endpoints;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pojo.CommonClasses.bookingRequest;
import pojo.CommonClasses.bookingdatess;
import pojo.RequestClasses.createTokenRequest;
import pojo.ResponseClasses.createTokenResponse;
import pojo.ResponseClasses.createbookingResponse;

import static io.restassured.RestAssured.given;

public class updatebookingTC extends BaseClass{
    createTokenResponse myresponse_fortoken;
    createbookingResponse myres_forID;
    @BeforeMethod
    public void setup_beforeupdate(){
        createTokenRequest createtoken1 = new createTokenRequest();

        createtoken1.setusername("admin");
        createtoken1.setpassword("password123");
        myresponse_fortoken = given().header("Content-Type","application/json")
                .body(createtoken1)
                .when().post(endpoints.auth).then().log().all().statusCode(200).extract().as(createTokenResponse.class);

        bookingRequest bookingdata = new bookingRequest();
        bookingdatess dates = new bookingdatess();
        dates.setcheckin("2025-05-05");
        dates.setcheckout("2026-06-06");
        bookingdata.setfirstname("nada");
        bookingdata.setlastname("zein");
        bookingdata.setdepositpaid(true);
        bookingdata.settotalprice(2000);
        bookingdata.setbookingdates(dates);
        bookingdata.setadditionalneeds("Breakfast");
        myres_forID = given().log().all().header("Content-Type","application/json")
                .header("Accept","application/json")
                .body(bookingdata)
                .when().post(endpoints.booking)
                .then().log().all().statusCode(200).extract().as(createbookingResponse.class);


    }



    @Test
    public void updatebooking_withValiddata(){

        bookingRequest bookingdata = new bookingRequest();
        bookingdatess dates = new bookingdatess();
        dates.setcheckin("2025-05-05");
        dates.setcheckout("2026-06-06");
        bookingdata.setfirstname("nada");
        bookingdata.setlastname("naduda");
        bookingdata.setdepositpaid(true);
        bookingdata.settotalprice(2000);
        bookingdata.setbookingdates(dates);
        bookingdata.setadditionalneeds("Breakfast");

        given().header("Content-Type","application/json")
                .header("Accept","application/json")
                .header("Cookie","token="+myresponse_fortoken.gettoken())
                .body(bookingdata)
                .when().put(endpoints.booking + "/" + myres_forID.getbookingid())
                .then().log().all().statusCode(200);
    }
}
