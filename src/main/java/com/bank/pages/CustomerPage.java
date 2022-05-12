package com.bank.pages;

import com.bank.utility.Utility;
import javafx.scene.control.Tab;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

public class CustomerPage extends Utility {
    public CustomerPage(){
                PageFactory.initElements(driver,this);
    }

//    search customer that you created.
//    click on "Login" Button
//    verify "Logout" Tab displayed.
//    click on "Logout"
//    verify "Your Name" text displayed.
    @FindBy(xpath = "//button[contains(text(),'Customer Login')]")
    WebElement customerLoginTab;
    @FindBy(xpath = "//select[@id='userSelect']")
    WebElement yourNameDropDownManu;
    @FindBy(xpath = "//button[@class='btn btn-default']")
    WebElement logInTab;
    @FindBy(xpath = "//button[contains(text(),'Logout')]")
    WebElement logOutTab;
    @FindBy(xpath = "//body[1]/div[3]/div[1]/div[2]/div[1]/div[1]/strong[1]")
    WebElement welcomeCustomerNameText;
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
   public void cliclOnLogOutTab(){
       Reporter.log("Clicking on LogOutTab: " + logOutTab.toString()+ "<br>");
       clickOnElement(logOutTab);
   }
   public String verifyLogOutText(){
       Reporter.log("getting LogOutText " + logOutTab.toString()+"<br>");
       return getTextFromElement(logOutTab);
   }
   public String verifyYourNameText(){
       Reporter.log("getting YourNameText " + welcomeCustomerNameText.toString()+"<br>");
       return getTextFromElement(welcomeCustomerNameText);
   }



}
