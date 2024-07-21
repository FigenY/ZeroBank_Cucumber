package com.zerobank.pages;

import com.zerobank.utilities.BrowserUtils;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class AccountSummaryPage extends BasePage{

    @FindBy(tagName = "h2")
    private List<WebElement> accountSummaryTypes;

    @FindBy(xpath = "(//table)[3]//th")
    private List<WebElement> creditAccountsColumns;

    public List<String> getAccountSummaryTypeNames(){
       return BrowserUtils.getElementsText(accountSummaryTypes);
    }

    public List<String> getCreditAccountColumnNames(){
        return BrowserUtils.getElementsText(creditAccountsColumns);
    }


}
