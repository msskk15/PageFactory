package org.example;

import PageFactory.*;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class AssertCart_PageFactory{
    WebDriver driver;

    @BeforeMethod
    public void setWebDriver(){

        System.setProperty("webdriver.chrome.driver","src/test/chromedriver");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        driver.manage().window().maximize();
       // driver.get("https://spree-vapasi-prod.herokuapp.com/login");
        driver.get("https://spree-vapasi.herokuapp.com/login");
        LoginPage loginpage =new LoginPage(driver);
        loginpage.login("manasakk15@test.com" , "12345678");

    }

    @AfterMethod
    public void logOut(){
        // productPage  = new ProductPage(webDriver);

        driver.quit();
    }

    @Test
    public void assertCartValue() {



        //Select Category
        CategoryPage category = new CategoryPage(driver);
        category.selectCategory();
        category.selectProduct();

        //select quantity and add to cart
        ProductPage product = new ProductPage(driver);
        product.addProducttocart();

        //Click Checkout in Cart Page
        CartPage cart =  new CartPage(driver);
        cart.clickCheckOut();

        //Enter Billing address in CheckoutPage
        CheckoutPage checkout = new CheckoutPage(driver);
       checkout.addBillingAddress("manasa" , "kk" ,
               "Seattle gm", "Seattle_cvr" , "Seattle","98101","9999900000");
    }


}