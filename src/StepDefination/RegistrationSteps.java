package StepDefination;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.equalTo;


public class RegistrationSteps {

    @Given("^the API base URI is \"([^\"]*)\"$")
    public void setAPIBaseURI(String baseURI) {
        RestAssured.baseURI = baseURI;
    }

    @When("^a POST request is made to \"([^\"]*)\" with the following payload:$")
    public void makePostRequest(String endpoint, String payload) {
        given()
                .contentType(ContentType.JSON)
                .body(payload)
                .when()
                .post(endpoint);
    }

    @Then("^the response status code should be (\\d+)$")
    public void verifyStatusCode(int statusCode) {
        RestAssured
                .expect()
                .statusCode(statusCode)
                .when()
                .get();
    }

    @Then("^the response body should contain:$")
    public void verifyResponseBody(String expectedBody) {
        RestAssured
                .expect()
                .body(equalTo(expectedBody))
                .when()
                .get();
    }
}
