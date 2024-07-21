package com.zerobank.stepDefs;

import com.zerobank.pages.OnlineBankingPage;
import io.cucumber.java.en.When;

public class OnlineBanking_Stepdefs {
    OnlineBankingPage onlineBankingPage = new OnlineBankingPage();
    @When("The user navigates to transaction type: {string}")
    public void the_user_navigates_to_transaction_type(String transactionType) {
       onlineBankingPage.navigateToTransactionType(transactionType);
    }


}
