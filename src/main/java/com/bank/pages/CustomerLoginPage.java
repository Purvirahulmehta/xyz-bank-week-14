package com.bank.pages;

import com.bank.utility.Utility;
import javafx.scene.control.Tab;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

public class CustomerLoginPage extends Utility {
    public CustomerLoginPage(){

        PageFactory.initElements(driver,this);
    }
    @FindBy(xpath = "//button[contains(text(),'Login')]")
    WebElement customerLoginTab;
    @FindBy(xpath = "//select[@id='userSelect']")
    WebElement yourNameDropDownManu;
    @FindBy(xpath = "//button[@class='btn btn-default']")
    WebElement logInTab;
    public void clickOnCustomerLoginTab(){
        Reporter.log("Clicking on CustomerLoginTab : "+ customerLoginTab.toString()+ "<br>");
        clickOnElement(customerLoginTab);
    }
    public void selectYourNameDropDownManu(String text){
        Reporter.log("SelectingYourName : " + text + " from dropdown "+yourNameDropDownManu.toString() + "<br>");
        selectByVisibleTextFromDropDown(yourNameDropDownManu,text);
    }
    public void clickOnLoginTab(){
        Reporter.log("Clicking on LoginTab : " + logInTab.toString()+ "<br>");
        clickOnElement(logInTab);
    }



}
