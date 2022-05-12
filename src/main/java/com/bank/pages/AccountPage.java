package com.bank.pages;

import com.bank.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

public class AccountPage extends Utility {
    public AccountPage() {

        PageFactory.initElements(driver, this);
    }
        @FindBy(xpath = "//button[contains(text(),'Logout')]")
        WebElement logOutTab;
        @FindBy(xpath = "//strong/span[@class='fontBig ng-binding']")
        WebElement welcomeCustomerNameText;


        @FindBy(xpath = "//body/div[3]/div[1]/div[2]/div[1]/div[3]/button[2]")
        WebElement depositTab;
        @FindBy(xpath = "//body/div[3]/div[1]/div[2]/div[1]/div[4]/div[1]/form[1]/div[1]/input[1]")
        WebElement depositAmountField;
        @FindBy(xpath = "//body/div[3]/div[1]/div[2]/div[1]/div[4]/div[1]/form[1]/button[1]")
        WebElement depositFinalTab;
        @FindBy(xpath = "//span[contains(text(),'Deposit Successful')]")
        WebElement depositSuccessfulMessage;
        @FindBy(xpath = "//body/div[3]/div[1]/div[2]/div[1]/div[3]/button[3]")
        WebElement withdrawlTab;
        @FindBy(xpath = "//body/div[3]/div[1]/div[2]/div[1]/div[4]/div[1]/form[1]/div[1]/input[1]")
        WebElement withdrawlAmountField;
        @FindBy(xpath = "//body/div[3]/div[1]/div[2]/div[1]/div[4]/div[1]/form[1]/button[1]")
        WebElement withdrawlFinalTab;
        @FindBy(xpath = "//span[contains(text(),'Transaction successful')]")
        WebElement transactionSuccessfulMessage;
        public String verifyTextMessage(){
            Reporter.log("getting YourNameText " + depositSuccessfulMessage.toString() + "<br>");
            return getTextFromElement(depositSuccessfulMessage);
        }
        public void cliclOnLogOutTab () {
            Reporter.log("Clicking on LogOutTab: " + logOutTab.toString() + "<br>");
            clickOnElement(logOutTab);
        }
        public String verifyLogOutText () {
            Reporter.log("getting LogOutText " + logOutTab.toString() + "<br>");
            return getTextFromElement(logOutTab);
        }
        public String verifyYourNameText () {
            Reporter.log("getting YourNameText " + welcomeCustomerNameText.toString() + "<br>");
            return getTextFromElement(welcomeCustomerNameText);
        }

        public void clickOnDepositTab () {
            Reporter.log("Clicking on DepositTab : " + depositTab.toString() + "<br>");
            clickOnElement(depositTab);
        }
        public void setDepositAmount (String amount){
            Reporter.log("Enter DepositAmount: " + depositAmountField.toString() + "<br>");
            sendTextToElement(depositAmountField, amount);
        }
        public void clickOnFinalDepositTab () {
            Reporter.log("Clicking on FinalDepositTab : " + depositFinalTab.toString() + "<br>");
            clickOnElement(depositFinalTab);
        }
        public String getDepositSuccessfulText () {
            Reporter.log("getting DepositSuccessfulText: " + depositSuccessfulMessage.toString() + "<br>");
            return getTextFromElement(depositSuccessfulMessage);
        }
        public void clickOnWithdrawlTab () {
            Reporter.log("Clicking on WithdrawlTab : " + withdrawlTab.toString() + "<br>");
            clickOnElement(withdrawlTab);
        }
        public void setWithdrawlAmount (String amount){
            Reporter.log("Enter WithdrawlAmount :" + withdrawlAmountField.toString() + "<br>");
            sendTextToElement(withdrawlAmountField, amount);
        }
        public void clickOnFinanWithdrawlTab () {
            Reporter.log("Clicking on FinanWithdrawlTab : " + withdrawlFinalTab.toString() + "<br>");
            clickOnElement(withdrawlFinalTab);
        }
        public String getTransactionSuccessfulText () {
            Reporter.log("getting TransactionSuccessfulText : " + transactionSuccessfulMessage.toString() + "<br>");
            return getTextFromElement(transactionSuccessfulMessage);
        }
    public String verifyAlertText(){
        return getTextFromAlert();
    }



}
