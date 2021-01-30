package spring.stepdefinitions;

import com.fasterxml.jackson.databind.JsonNode;
import com.google.gson.JsonArray;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import io.restassured.path.json.JsonPath;
import org.json.JSONException;
import org.json.simple.parser.ParseException;

import java.io.IOException;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

public class TrialStepDef {

    TestScope testScope;
    @Then("I validate the node {string} equals to {string}")
    public void i_validate_the_node_equals_to_from(String string, String string2) throws IOException, ParseException, JSONException {

        String resp = testScope.response.getBody().asString();
        System.out.println("Looking for: " + string + " - " + string2);
        System.out.println(resp);
        JsonPath jp = new JsonPath(resp);
        String node = jp.get(string);
        assertThat(node, equalTo(string2));
        System.out.println("END...");

        //OR

       /* String s = testScope.jsonStringParser(testScope.response);
        System.out.println(s);
        assertThat(s, equalTo(string2));
*/
    }

    @Given("I clear all request")
    public void i_clear_all_request() {
        testScope.getNullInstance(testScope.response);
    }
    }

