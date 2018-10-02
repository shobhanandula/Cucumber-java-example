package com.shobha.cucumber.test;

import com.shobha.cucumber.Day;
import static org.junit.Assert.assertEquals;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class Stepdefs {
  
  private String actual = null;
  
    @Given("Today is {string}")
    public void sunday(String date) throws Throwable {
        Day day = new Day();
        actual = day.isSunday(date);
    }
    
    @Then("I expect {string}")
    public void expect(String string) {
      assertEquals(actual , string);
    }
}
