package com.bank.pages;

import com.bank.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

public class AddCustomerPage extends Utility {
    public AddCustomerPage(){

        PageFactory.initElements(driver,this);
    }

   @FindBy(xpath = "//input[@placeholder='First Name']")
    WebElement firstNameTextField;
    @FindBy(xpath = "//input[@placeholder='Last Name']")
    WebElement lastNameTextField;
    @FindBy(xpath = "//input[@ng-model='postCd']")
    WebElement postCodeTextTab;
    @FindBy(xpath = "//button[@class='btn btn-default']")
    WebElement addCustomerManagerTab;
public void setFirstNameTextField(String text){
    Reporter.log("Enter FirstName: " + firstNameTextField.toString() + "<br>");
    sendTextToElement(firstNameTextField,text);
}
public void setLastNameTextField(String text){
    Reporter.log("Enter LastName: " + lastNameTextField.toString() + "<br>");
    sendTextToElement(lastNameTextField,text);
}
public void setPostCodeTextTab(String text){
    Reporter.log("Enter PostCode: " + postCodeTextTab.toString() + "<br>");
    sendTextToElement(postCodeTextTab,text);
}
    public String verifyAlertText(){
        //Reporter.log("getting  text from alert"+.toString()+"<br>");
        return getTextFromAlert();
    }
public void clickOnAddCustomerManagerTab(){
    Reporter.log("Clicking on AddCustomer Tab : "+ addCustomerManagerTab.toString()+ "<br>");
    clickOnElement(addCustomerManagerTab);
}


}
