package com.cydeo.test.vytrack;

import com.cydeo.test.base.TestBase;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class US_14 extends TestBase {
    @Test
    public void userStoryTest() throws InterruptedException {

        driver.get("https://qa2.vytrack.com/user/login");
        //"1.Verify that store manager or sales manager should be able to access Vehicle model page and
        //able to see all Vehicles model information

        driver.findElement(By.id("prependedInput")).sendKeys("storemanager83");
        driver.findElement(By.id("prependedInput2")).sendKeys("UserUser123");
        driver.findElement(By.id("_submit")).click();



        //2. Verify that Store manager or Sales manager should be able to create new Vehicle model

        //3.Verify that during the creation, all required field should be displayed and Fuel type drop down
        //should displayed as (Gasoline,Diesel,Electric,Hybird)

        //4.Verfiy that store manager or sales manager should be able to Edit or delete the Vehicle model.

        //5.Verify that store manager or sales manager should be able to reset the grid by click on
        //Grid setting."
    }
}
