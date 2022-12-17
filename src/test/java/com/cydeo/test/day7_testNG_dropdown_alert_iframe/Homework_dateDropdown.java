package com.cydeo.test.day7_testNG_dropdown_alert_iframe;

import com.cydeo.test.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class Homework_dateDropdown {


    WebDriver driver;
    @BeforeMethod
    public void SetUp(){
        //TC : Selecting date on dropdown and verifying
        //1. Open Chrome browser

        driver= WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        //2. Go to https://practice.cydeo.com/dropdown

        driver.get("https://practice.cydeo.com/dropdown");


    }
    @Test
            public void selectDate(){
        //3. Select “December 1st, 1923” and verify it is selected.




        Select year=new Select(driver.findElement(By.id("year")));
        //Select year using : visible text
        year.selectByVisibleText("1923");

        Select month=new Select(driver.findElement(By.id("month")));
        //Select month using : value attribute Select
        month.selectByValue("11");

Select day=new Select(driver.findElement(By.id("day")));
        //day using : index number
        day.selectByIndex(0);


        String expectedYear="1923";
        String actualYear=year.getFirstSelectedOption().getText();
        Assert.assertTrue(actualYear.equals(expectedYear));

        String expectedMonth="December";
        String actualMonth=month.getFirstSelectedOption().getText();
        Assert.assertEquals(actualMonth,expectedMonth);

        String expectedDay="1";
        String actualDay=day.getFirstSelectedOption().getText();

        Assert.assertEquals(actualDay,expectedDay);


    }

    @AfterMethod
    public void tearDownMethod(){
        driver.close();
    }


}
