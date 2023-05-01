package com.saucedemo.testsuite;

import com.saucedemo.pages.LoginPage;
import com.saucedemo.testbase.BaseTest;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest {

    LoginPage loginPage = new LoginPage();

    @Test
 public void userShouldLoginSuccessfullyWithValidCredentials(){

        loginPage.enterUserName();
        loginPage.enterPassword();
        loginPage.clickOnLoginButton();
        loginPage.verifyTextProducts();

 }@Test
    public void verifyThatSixProductsAreDisplayedOnPage(){
        loginPage.enterUserName();
        loginPage.enterPassword();
        loginPage.clickOnLoginButton();
        loginPage.verifyProductList();

    }


}
