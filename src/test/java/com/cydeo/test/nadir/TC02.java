package com.cydeo.test.nadir;

import com.cydeo.test.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class TC02 {
    WebDriver driver;

    @BeforeMethod
    public void SetUp(){
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        //Providing extra time for our driver before it throws NoSuchElementException
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

//        2. Go to website: https://login2.nextbasecrm.com/
        driver.get("https://login2.nextbasecrm.com/");
    }
    @Test
    public void Message() throws InterruptedException {

        //login
        WebElement login=driver.findElement(By.xpath("//input[@name='USER_LOGIN']"));
        login.sendKeys("hr33@cybertekschool.com");
        WebElement password=driver.findElement(By.xpath("//input[@name='USER_PASSWORD']"));
        password.sendKeys("UserUser");
        WebElement loginBtn=driver.findElement(By.xpath("//input[@type='submit']"));
        loginBtn.click();
//2. As a user, I should be able to send message.
//"1. Verify users can send message by clicking ""MESSAGE"" tab

        WebElement message=driver.findElement(By.xpath("//span[@id='feed-add-post-form-tab-message']"));
        message.click();


        driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@class='bx-editor-iframe']")));
        driver.findElement(By.xpath("//body[@contenteditable='true']")).sendKeys("Test message 002");

        Thread.sleep(2000);

//2. Verify users can cancel message.
        WebElement cancelBtn=driver.findElement(By.xpath("//button[@id='blog-submit-button-cancel']"));
        cancelBtn.click();



//3. Verify users can attach link by clicking on the link icon."
        WebElement linkBtn=driver.findElement(By.xpath("//span[@class='bxhtmled-top-bar-btn bxhtmled-button-link']"));
        linkBtn.click();





    }
}
