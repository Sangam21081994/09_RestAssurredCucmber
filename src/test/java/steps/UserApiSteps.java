package steps;

import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import io.restassured.response.Response;
import services.UserApiService;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class UserApiSteps {
    private Response response;
    private final UserApiService userApiService;

    public UserApiSteps() {
        this.userApiService = new UserApiService();
    }

    @When("I send a GET request to {string}")
    public void iSendAGetRequestTo(String url) {
        response = userApiService.sendGetRequest(url);
    }

    @Then("the response status code should be {int}")
    public void theResponseStatusCodeShouldBe(int expectedStatusCode) {
        assertEquals(expectedStatusCode, userApiService.getStatusCode(response));
    }
} 