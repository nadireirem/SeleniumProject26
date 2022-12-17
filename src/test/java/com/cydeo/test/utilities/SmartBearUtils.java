package com.cydeo.test.utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SmartBearUtils {

    //• Create a method called loginToSmartBear
    //• This method simply logs in to SmartBear when you call it.
    //• Accepts WebDriver type as parameter
    public static void SmartBearLogin(WebDriver driver){
        driver.get("http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx ");

        WebElement username = driver.findElement(By.xpath("//input[@class='txt'][1]"));
        username.sendKeys("Tester");

        WebElement password = driver.findElement(By.xpath("//input[@class='txt'][2]"));
        password.sendKeys("test");

        WebElement loginBtn = driver.findElement(By.xpath("//input[@class='button']"));
        loginBtn.click();

    }
}
