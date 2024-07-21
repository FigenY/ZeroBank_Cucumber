package com.zerobank.pages;

import com.zerobank.utilities.Driver;
import org.openqa.selenium.By;

public class OnlineBankingPage extends BasePage{

    public void navigateToTransactionType(String transactionType){
        Driver.get().findElement(By.xpath("//span[text()='"+transactionType+"']")).click();
    }

}
