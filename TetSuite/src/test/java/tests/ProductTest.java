package tests;

import io.restassured.RestAssured;
import org.junit.BeforeClass;
import org.junit.Test;
import request.RequestFactory;

import java.util.HashMap;
import java.util.Map;

public class ProductTest {
    RequestFactory requestFactory;

    @BeforeClass
    public void setup(){

        RestAssured.baseURI = "";
        RestAssured.port = 3030;

        requestFactory = new RequestFactory();
    }

    @Test
    public void verifyGetRequest(){
        requestFactory.getAllProducts().then().log().all().statusCode(200);
    }

    @Test
    public void verifyAddProduct(){
        String requestPayload = "{\n"
            + " \"name\":   \"Xiaomi\", \n"
            + "}";
        requestFactory.addProducts(requestPayload).then().log().all().statusCode(201);
    }

    @Test
    public void verifyAddProductWithRequestPayloadAsMap(){
        Map<String, Object> requestPayload = new HashMap<>();

        requestPayload.put("name", "Xiaomi");
        requestFactory.addProducts(requestPayload).then().log().all().statusCode(201);

    }
}
