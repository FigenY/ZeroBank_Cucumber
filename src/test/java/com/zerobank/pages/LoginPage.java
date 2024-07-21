package com.zerobank.pages;

import com.zerobank.utilities.BrowserUtils;
import com.zerobank.utilities.ConfigurationReader;
import com.zerobank.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage{

    @FindBy(xpath = "//input[@id='user_login']")
    private WebElement usernameBox;

    @FindBy(id = "user_password")
    private WebElement passwordBox;

    @FindBy(css = "[name='submit']")
    private WebElement signInBtn;

    @FindBy(css = ".alert.alert-error")
    private WebElement errorMessage;

    public void login(String username, String password){
        usernameBox.sendKeys(username);
        passwordBox.sendKeys(password);
        signInBtn.click();

    }

    public void login(){
        usernameBox.sendKeys(ConfigurationReader.get("userName"));
        passwordBox.sendKeys(ConfigurationReader.get("passWord"));
        signInBtn.click();
    }

    public String getErrorMessageText(){
        return errorMessage.getText();
    }
}
