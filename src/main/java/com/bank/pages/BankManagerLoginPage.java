package com.bank.pages;

import com.bank.utility.Utility;
import javafx.scene.control.Tab;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

public class BankManagerLoginPage extends Utility {
    public BankManagerLoginPage(){
                PageFactory.initElements(driver,this);
    }
//    click On "Bank Manager Login" Tab
//    click On "Add Customer" Tab
//    enter FirstName
//    enter LastName
//    enter PostCode
//    click On "Add Customer" Button
//    popup display
//    verify message "Customer added successfully"
//    click on "ok" button on popup.
    @FindBy(xpath = "//button[contains(text(),'Bank Manager Login')]")
    WebElement bankManagerLoginTab;
    @FindBy(xpath = "//body/div[3]/div[1]/div[2]/div[1]/div[1]/button[1]")
    WebElement addCustomerTab;
    @FindBy(xpath = "//body/div[3]/div[1]/div[2]/div[1]/div[1]/button[2]")
    WebElement openAccountTab;
    @FindBy(xpath = "//body/div[3]/div[1]/div[2]/div[1]/div[1]/button[3]")
    WebElement customers;
public void clickOnAddCustomerTab(){
    Reporter.log("Clicking on AddCustomer Tab: " +addCustomerTab.toString() + "<br>");
    clickOnElement(addCustomerTab);
}
public void clickOnOpenAccountTab(){
    Reporter.log("Clicking on OpenAccount Tab: " +openAccountTab.toString() + "<br>");
    clickOnElement(openAccountTab);
}
public void clickOnCustomers(){
    Reporter.log("Clicking on Customers Tab: " +customers.toString() + "<br>");
    clickOnElement(customers);
}



}
