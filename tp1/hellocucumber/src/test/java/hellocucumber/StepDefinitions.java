package hellocucumber;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinitions {
    private String today;
    private String answer;

    static String isItFriday(String today) {
        return "Friday".equals(today) ? "TGIF" : "Nope";
    }

    @Given("today is {string}")
    public void today_is(String day) {
        this.today = day; 
    }

    @When("I ask whether it's Friday yet")
    public void i_ask_whether_it_s_friday_yet() {
        this.answer = isItFriday(this.today); 
    }

    @Then("I should be told {string}")
    public void i_should_be_told(String expectedAnswer) {
        if (!this.answer.equals(expectedAnswer)) {
            throw new AssertionError("Expected: " + expectedAnswer + ", but got: " + this.answer);
        }
    }

      @Given("an example scenario")
    public void anExampleScenario() {
    }

    @When("all step definitions are implemented")
    public void allStepDefinitionsAreImplemented() {
    }

    @Then("the scenario passes")
    public void theScenarioPasses() {
    }
}
