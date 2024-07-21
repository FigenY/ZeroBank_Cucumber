package com.zerobank.pages;

import com.zerobank.utilities.BrowserUtils;
import com.zerobank.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.Browser;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage{

    @FindBy (id = "signin_button")
    private WebElement signInBtn;

    @FindBy (xpath = "(//a[@class='dropdown-toggle'])[2]")
    private WebElement accountName;


    public void clickSignInBtn(){
       signInBtn.click();
    }

    public String getAccountName(){
        return accountName.getText();
    }

    public void navigateToTab(String tabName){
        Driver.get().findElement(By.xpath("//strong[text()='"+tabName+"']")).click();
    }

}
