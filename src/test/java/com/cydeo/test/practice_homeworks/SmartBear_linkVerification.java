package com.cydeo.test.practice_homeworks;

import com.cydeo.test.base.TestBase;
import com.cydeo.test.utilities.SmartBearUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.List;

public class SmartBear_linkVerification extends TestBase {

@Test
    public void login(){


    //1. Open browser
//3. Enter username: “Tester”
//4. Enter password: “test”
//5. Click to Login button
    //2. Go to website:
//http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx



    SmartBearUtils.SmartBearLogin(driver);

    //6. Print out count of all the links on landing page
    List<WebElement> allLinks=driver.findElements(By.tagName("a"));
    System.out.println("allLinks.size() = " + allLinks.size());
//        7. Print out each link text on this page
    for (WebElement eachLink:allLinks){
        System.out.println("eachLink.getText() = " + eachLink.getText());
    }
}




}
