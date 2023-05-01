package com.saucedemo.pages;

import com.saucedemo.utilites.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class LoginPage extends Utility {

    By userName = By.xpath("//input[@id='user-name']");
    By password = By.xpath("//input[@id='password']");
    By clickOnButton = By.xpath("//input[@id='login-button']");
    By verifyProduct = By.xpath("//span[contains(text(),'Products')]");
    By productList = By.xpath("//div[@class='inventory_item']");


    //Enter “standard_user” username
    public void enterUserName(){

        sendTextToElement(userName,"standard_user");
    }//* Enter “secret_sauce” password
    public void enterPassword(){

        sendTextToElement(password,"secret_sauce");
    }//* Click on ‘LOGIN’ button
    public void clickOnLoginButton(){

        clickOnElement(clickOnButton);
    }//Verify the text “PRODUCTS”
    public void verifyTextProducts(){

     verifyText(driver,verifyProduct,"//span[contains(text(),'Products')]");

    }
    public int verifyProductList()
    {
        List<WebElement> number = driver.findElements(productList);
        return number.size();
    }

}
