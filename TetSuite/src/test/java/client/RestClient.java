package client;

import static io.restassured.RestAssured.given;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class RestClient {

    public Response SendGetRequest(String uri) {

        return given().when().get(uri);

    }

    public Response SendPostRequest(String uri, Object body) {

        return given().contentType(ContentType.JSON).when().body(body).post(uri);

    }

    public Response SendPutRequest(String uri, Object body) {

        return given().contentType(ContentType.JSON).when().body(body).put(uri);

    }

    public Response SendPatchRequest(String uri, Object body) {

        return given().contentType(ContentType.JSON).when().body(body).patch(uri);

    }

    public Response SendDeleteRequest(String uri) {

        return given().when().delete(uri);

    }

}
