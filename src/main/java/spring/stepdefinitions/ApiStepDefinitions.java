package spring.stepdefinitions;

import com.fasterxml.jackson.databind.JsonNode;
import com.google.gson.*;
import com.google.gson.stream.JsonReader;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.restassured.RestAssured;
import io.restassured.config.EncoderConfig;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import static org.hamcrest.MatcherAssert.*;
import java.io.IOException;
import static org.hamcrest.Matchers.*;

public class ApiStepDefinitions {

    public static String generateEmpJWT;
    public String emplocationUrl;
    public static String getEmpUrlCode;
    public static String empAccessToken;
    TestScope testScope;
    static Response apiResponse;

    @When("I send the get request to {string}")
    public void i_send_the_get_request_to_and_save_the_response_as(String httpLink) {
        System.out.println("START...");
        EncoderConfig encoderconfig = new EncoderConfig();
        
        Response response = RestAssured
                .given()
                .log().all()
                .config(RestAssured.config()
                        .encoderConfig(encoderconfig.appendDefaultContentCharsetToContentTypeIfUndefined(false)))
                .when()
                .get(httpLink)
                .then()
                //.body("data[0].employee_name", equalTo("Tiger Nixon"))
                .statusCode(200)
                .extract()
                .response();

        System.out.println(response.getBody().asString());
        //testScope.response = response;
        //testScope.getInstance(response);
        apiResponse = testScope.getInstance(response);
        //System.out.println(apiResponse.getBody().asString());

        //String s = generateEmpJWT = response.body().prettyPrint();
        //System.out.println(s);

    }



}

