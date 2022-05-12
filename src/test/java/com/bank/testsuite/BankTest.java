package com.bank.testsuite;

import com.bank.pages.*;
import com.bank.testbase.TestBase;
import javafx.scene.control.Tab;
import org.checkerframework.checker.units.qual.C;
import org.openqa.selenium.Alert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class BankTest extends TestBase {
    HomePage homePage;
    AccountPage accountPage;
    AddCustomerPage addCustomerPage;
    BankManagerLoginPage bankManagerLoginPage;
    CustomerLoginPage customerLoginPage;
    CustomerPage customerPage;
    OpenAccountPage openAccountPage;

    @BeforeMethod(alwaysRun = true)
    public void inIt() {
        homePage = new HomePage();
        accountPage = new AccountPage();
        addCustomerPage = new AddCustomerPage();
        bankManagerLoginPage = new BankManagerLoginPage();
        customerLoginPage = new CustomerLoginPage();
        customerPage = new CustomerPage();
        openAccountPage = new OpenAccountPage();
    }

    @Test(priority = 0,groups = {"sanity","regression"})
    public void bankManagerShouldAddCustomerSuccessfully() throws InterruptedException {
        homePage.clickOnBankManagerButtonTab();
        bankManagerLoginPage.clickOnAddCustomerTab();
        addCustomerPage.setFirstNameTextField("Rama");
        addCustomerPage.setLastNameTextField("Patel");
        addCustomerPage.setPostCodeTextTab("GU21 5DS");
        addCustomerPage.clickOnAddCustomerManagerTab();
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals(addCustomerPage.verifyAlertText().substring(0, 27), "Customer added successfully");
        softAssert.assertAll();
        acceptAlert();
        homePage.clickOnHomeButton();
    }

    @Test(priority = 1,groups = {"sanity","regression","smoke"})
    public void bankManagerShouldOpenAccountSuccessfully() throws InterruptedException {
        homePage.clickOnHomeButtonTab();
        homePage.clickOnBankManagerButtonTab();
        bankManagerLoginPage.clickOnOpenAccountTab();
        openAccountPage.selectCustomer("Rama Patel");
        openAccountPage.selectCurrency("Pound");
        openAccountPage.clickOnProcessTab();
        SoftAssert softAssert = new SoftAssert();
        try {
            softAssert.assertEquals(addCustomerPage.verifyAlertText().substring(0, 28), "Account created successfully");
            acceptAlert();
        } catch (Exception E) {
            //Exception handling
        }
        softAssert.assertAll();
    }

    @Test(priority = 2,groups = {"regression","smoke"})
    public void customerShouldLoginAndLogoutSuceessfully() throws InterruptedException {
        homePage.clickOnHomeButtonTab();
        homePage.clickOnCustomerLoginTab();
        customerLoginPage.selectYourNameDropDownManu("Rama Patel");
        customerLoginPage.clickOnLoginTab();
        Thread.sleep(1000);
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals(accountPage.verifyLogOutText(), "Logout");
        softAssert.assertEquals(accountPage.verifyYourNameText(), "Rama Patel");
      softAssert.assertAll();
        accountPage.cliclOnLogOutTab();
    }

    @Test(priority = 3,groups = {"regression","smoke"})
    public void customerShouldDepositMoneySuccessfully() {
        homePage.clickOnHomeButton();
        homePage.clickOnCustomerLoginTab();
        customerLoginPage.selectYourNameDropDownManu("Rama Patel");
        customerLoginPage.clickOnCustomerLoginTab();
        accountPage.clickOnDepositTab();
        accountPage.setDepositAmount("100");
        accountPage.clickOnFinalDepositTab();
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals(accountPage.getDepositSuccessfulText(), "Deposit Successful");
        softAssert.assertAll();
    }
  @Test(priority = 4,groups = {"regression"})
  public void customerShouldWithdrawMoneySuccessfully() throws InterruptedException {
      homePage.clickOnHomeButton();
      homePage.clickOnCustomerLoginTab();
      customerLoginPage.selectYourNameDropDownManu("Rama Patel");
      customerLoginPage.clickOnCustomerLoginTab();
      Thread.sleep(1000);
      accountPage.clickOnWithdrawlTab();
      accountPage.setDepositAmount("50");
      accountPage.clickOnFinanWithdrawlTab();
      SoftAssert softAssert = new SoftAssert();
      softAssert.assertEquals(accountPage.getTransactionSuccessfulText(), "Transaction successful");
      softAssert.assertAll();
  }
}

