package services;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class UserApiService {
    
    public Response sendGetRequest(String url) {
        return RestAssured.given()
                .when()
                .get(url);
    }
    
    public int getStatusCode(Response response) {
        return response.getStatusCode();
    }
} 