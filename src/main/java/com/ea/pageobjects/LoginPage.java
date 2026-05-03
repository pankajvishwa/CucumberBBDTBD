package com.ea.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
    WebDriver driver;

    By text_username = By.id("user-name");
    By text_password = By.id("password");
    By btn_login = By.id("login-button");
    By lit_products = By.xpath("//span[text()='Products']");

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    public void enterUsername(String username){
        driver.findElement(text_username).sendKeys(username);
    }

    public void enterPassword(String password){
        driver.findElement(text_password).sendKeys(password);
    }

    public void clickLoginButton(){
        driver.findElement(btn_login).click();
    }

    public boolean isProductDisplayed(){
       return driver.findElement(lit_products).isDisplayed();
    }
}