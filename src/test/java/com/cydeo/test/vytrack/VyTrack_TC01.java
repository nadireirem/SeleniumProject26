package com.cydeo.test.vytrack;

import com.cydeo.test.base.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class VyTrack_TC01 extends TestBase {

    @Test
    public void loginTest() throws InterruptedException {

        driver.get("https://qa2.vytrack.com/");

        //"1. Given I am a truck driver
//When I log in my account
//And when I go Vehicles page
//Then I see all Vehicles information"

        WebElement userName=driver.findElement(By.id("prependedInput"));
        userName.sendKeys("user48");
        WebElement password= driver.findElement(By.id("prependedInput2"));
        password.sendKeys("UserUser123");
        WebElement loginBtn=driver.findElement(By.id("_submit"));
        loginBtn.click();





      WebElement fleet = driver.findElement(By.xpath("//span[@class='title title-level-1']"));
        fleet.click();
        Thread.sleep(3000);
        WebElement vehicles = driver.findElement(By.xpath("//span[.='Vehicles']"));
        vehicles.click();
        Thread.sleep(6000);








    }



}
