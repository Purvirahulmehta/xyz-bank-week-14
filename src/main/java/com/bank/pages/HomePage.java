package com.bank.pages;

import com.bank.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

public class HomePage extends Utility {
    public HomePage(){
                PageFactory.initElements(driver,this);
    }
    @FindBy(xpath = "//button[contains(text(),'Home')]")
    WebElement homeButtonTab;
    @FindBy(xpath = "//button[contains(text(),'Customer Login')]")
    WebElement customerLoginTab;
    @FindBy(xpath = "//button[contains(text(),'Bank Manager Login')]")
    WebElement bankManagerLoginTab;
    @FindBy(xpath = "//button[contains(text(),'Home')]")
    WebElement homeButton;
    public void clickOnHomeButton(){
        Reporter.log("Clicking on HomeButton Tab: " +homeButtonTab.toString() + "<br>");
        clickOnElement(homeButtonTab);
    }

    public void clickOnCustomerLoginTab(){
        Reporter.log("Clicking on CustomerLogin Tab: " +customerLoginTab.toString() + "<br>");
        clickOnElement(customerLoginTab);
    }
    public void clickOnHomeButtonTab(){
        Reporter.log("Clicking on Home Tab: " +homeButtonTab.toString() + "<br>");
        clickOnElement(homeButtonTab);
    }
    public void clickOnBankManagerButtonTab(){
        Reporter.log("Clicking on BankManagerLoginTab : " +bankManagerLoginTab.toString() + "<br>");
        clickOnElement(bankManagerLoginTab);
    }



}
