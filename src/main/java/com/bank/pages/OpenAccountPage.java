package com.bank.pages;

import com.bank.utility.Utility;
import javafx.scene.control.Tab;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

public class OpenAccountPage extends Utility {
    public OpenAccountPage(){

        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath = "//button[@ng-click='openAccount()']")
    WebElement openAccountTab;
    @FindBy(xpath = "//select[@name='userSelect']")
    WebElement customerNameDropDownManu;
    @FindBy(xpath = "//select[@name='currency']")
    WebElement currencyDropDownMenu;
    @FindBy(xpath = "//button[contains(text(),'Process')]")
    WebElement processTab;
    public void clickOnOpenAccountTab(){
        Reporter.log("Clicking on OpenAccount Tab : " + openAccountTab.toString() + "<br>");
        clickOnElement(openAccountTab);
    }
    public void selectCustomer(String text){
        Reporter.log("Selecting Customer : " + customerNameDropDownManu.toString() + "<br>");
        selectByVisibleTextFromDropDown(customerNameDropDownManu,text);
    }
    public void selectCurrency(String text){
        Reporter.log("Selecting Currency : " + currencyDropDownMenu.toString() + "<br>");
        //selectByIndexFromDropDown(currencyDropDownMenu,1);
        selectByVisibleTextFromDropDown(currencyDropDownMenu,text);
    }
    public void clickOnProcessTab(){
        Reporter.log("Clicking on rocess Tab : " + processTab.toString() + "<br>");
        clickOnElement(processTab);
    }
    public String verifyAlertText(){
        //Reporter.log("getting  text from alert"+.toString()+"<br>");
        return getTextFromAlert();
    }


}
