package com.zerobank.stepDefs;

import com.zerobank.pages.HomePage;
import com.zerobank.utilities.ConfigurationReader;
import com.zerobank.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class HomePage_StepDefs {
    HomePage homePage = new HomePage();

    @Given("The user is on the home page")
    public void the_user_is_on_the_home_page() {
        Driver.get().get(ConfigurationReader.get("url"));
    }

    @When("The user clicks on the Signin button")
    public void the_user_clicks_on_the_signin_button() {
        homePage.clickSignInBtn();
    }

    @Then("The user should be able to see {string} on the home page")
    public void the_user_should_be_able_to_see_on_the_home_page(String expectedAccountName) {
        String actualAccountName = homePage.getAccountName();
        Assert.assertEquals(expectedAccountName,actualAccountName);
    }

    @When("The user navigates to tab: {string}")
    public void theUserNavigatesToTab(String tabName) {
        homePage.navigateToTab(tabName);
    }
}
