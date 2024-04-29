package com.example.app.definitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import static io.restassured.RestAssured.given;

import org.json.JSONArray;


public class UserDataDefinition {

    @Given("list of users")
    public void retrieveListOfUsers() {
        RestAssured.baseURI = "https://jsonplaceholder.typicode.com";

        Response response = given()
                .when()
                .get("/users")
                .then()
                .assertThat()
                .statusCode(200)
                .extract().response();

        String responseBody = response.getBody().asString();
        System.out.println(responseBody);

    }

    @When("I confirm {string}'s user ID of {int}")
    public void searchForcommentsLeftByUser(String user, Integer id) {
        RestAssured.baseURI = "https://jsonplaceholder.typicode.com";

        Response response = given()
                .when()
                .get("/users")
                .then()
                .assertThat()
                .statusCode(200)
                .extract().response();

        String responseBody = response.getBody().asString();
        // Parse the JSONArray and find the user's name and ID
        Boolean userIdMatches = false;
        JSONArray jsonArray = new JSONArray(responseBody);
        for (int i = 0; i < jsonArray.length(); i++) {
            String name = jsonArray.getJSONObject(i).getString("name");
            System.out.println(name);
            if (name.equals(user)) {
                Integer userId = jsonArray.getJSONObject(i).getInt("id");
                assert userId.equals(id);
                userIdMatches = true;
                break;
            }
        }
        assert userIdMatches;
    }

    @Then("I should find the comment titled {string}")
    public void i_should_be_told(String string) {
        RestAssured.baseURI = "https://jsonplaceholder.typicode.com";

        Response response = given()
                .when()
                .get("/users")
                .then()
                .assertThat()
                .statusCode(200)
                .extract().response();

        String responseBody = response.getBody().asString();
        Boolean commentExists = false;
        JSONArray jsonArray = new JSONArray(responseBody);
        for (int i = 0; i < jsonArray.length(); i++) {
            String comment = jsonArray.getJSONObject(i).getString("name");
            if (comment.equals(string)) {
                commentExists = true;
                break;
            }
        }
        assert commentExists;
    }
}
