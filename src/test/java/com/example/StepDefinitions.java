package com.example;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class StepDefinitions {

    private String getCurrentTimestamp() {
        return LocalDateTime.now().format(DateTimeFormatter.ofPattern("HH:mm:ss.SSS"));
    }

    private void log(String message) {
        System.out.println(getCurrentTimestamp() + " - " + message + " - Thread: " + Thread.currentThread().getId());
    }

    private void simulateWork() {
        try {
            Thread.sleep(1000); // Sleep for 1 second to simulate work
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    // Feature 1 steps
    @Given("I have a step")
    public void iHaveAStep() {
        log("Step 1 in Feature 1");
        simulateWork();
    }

    @When("I execute it")
    public void iExecuteIt() {
        log("Executing step in Feature 1");
        simulateWork();
    }

    @Then("it should pass")
    public void itShouldPass() {
        log("Step passed in Feature 1");
    }

    @Given("I have another step")
    public void iHaveAnotherStep() {
        log("Another step in Feature 1");
        simulateWork();
    }

    @Then("it should also pass")
    public void itShouldAlsoPass() {
        log("Another step passed in Feature 1");
    }

    // Feature 2 steps
    @Given("I have a different step")
    public void iHaveADifferentStep() {
        log("Step 1 in Feature 2");
        simulateWork();
    }

    @When("I run it")
    public void iRunIt() {
        log("Running step in Feature 2");
        simulateWork();
    }

    @Then("it should succeed")
    public void itShouldSucceed() {
        log("Step succeeded in Feature 2");
    }

    @Given("I have yet another step")
    public void iHaveYetAnotherStep() {
        log("Another step in Feature 2");
        simulateWork();
    }

    @Then("it should also succeed")
    public void itShouldAlsoSucceed() {
        log("Another step succeeded in Feature 2");
    }
}