package Builder;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.specification.RequestSpecification;

public class requestbuilder {

    public static RequestSpecification getrequest(){
        return new RequestSpecBuilder()
                .setContentType("application/json")
                .setAccept("application/json")
                .build();

    }
}
