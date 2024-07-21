package com.zerobank.stepDefs;

import com.zerobank.pages.LoginPage;
import com.zerobank.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.bidi.log.Log;

public class LoginPage_StepDefs {
    LoginPage loginPage = new LoginPage();

    @When("The user enters valid credentials: {string} and {string}")
    public void the_user_enters_valid_credentials_and(String userName, String passWord) {
        loginPage.login(userName, passWord);
        Driver.get().navigate().back();
    }

    @When("The user enters invalid credentials: {string} and {string}")
    public void the_user_enters_invalid_credentials_and(String username, String password) {
        loginPage.login(username, password);
    }

    @Then("The user should see error message: {string}")
    public void the_user_should_see_error_message(String expectedMessage) {
        String actualMessage = loginPage.getErrorMessageText();
        Assert.assertEquals(expectedMessage, actualMessage);
    }
}
