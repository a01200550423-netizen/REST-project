import Builder.requestbuilder;
import Builder.responsebuilder;
import endPoints.endpoints;
import org.testng.annotations.Test;
import pojo.CommonClasses.bookingdatess;
import pojo.CommonClasses.bookingRequest;
import pojo.ResponseClasses.createbookingResponse;

import static io.restassured.RestAssured.given;

public class createbookingTC extends BaseClass{

    @Test
    public void checkcreatebooking_withvalidData(){
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
        given().log().all().spec(requestbuilder.getrequest())
                .body(bookingdata)
                .when().post(endpoints.booking)
                .then().log().all().spec(responsebuilder.getresponse()).extract().as(createbookingResponse.class);
    }
}
