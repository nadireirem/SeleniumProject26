package com.cydeo.test.practice_homeworks;

import com.cydeo.test.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class CountLinks {
    /*



TC #3: Counting the number of links that does not have text
1. Open Chrome browser
2. Go to https://www.openxcell.com
3. Count the number of links that does not have text and verify
Expected: 109


     */
    // TC #1: Checking the number of links on the page
    WebDriver driver;

    @BeforeMethod
    public void setUp() {
        //1. Open Chrome browser
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);


    }

    @Test
    public void countLinks() {
        //2. Go to https://www.openxcell.com
        driver.get("https://www.openxcell.com");

        //3. Count the number of the links on the page and verify
        //Expected: 332
        List<WebElement> links = driver.findElements(By.tagName("a"));
        System.out.println("links.size() = " + links.size());

     //   String expectedLinks = "332";
     //   Assert.assertEquals(links, expectedLinks, "Verification failed!");

        //3. Print out all of the texts of the links on the page

        for (WebElement eachLink : links) {
            System.out.println("eachLink.getText() = " + eachLink.getText());




        }
    }
}