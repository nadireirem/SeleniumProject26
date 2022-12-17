package com.cydeo.test.nadir;

import com.cydeo.test.base.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class TC01 extends TestBase {
    @Test
//1. As a user, I should be able to login to the app



    public void LogIn() throws InterruptedException {
        driver.get("https://login2.nextbasecrm.com/");

        //2. verify users can check ""Remember me on this computer"" option

        WebElement checkBox=driver.findElement(By.xpath("//input[@type='checkbox']"));
        System.out.println("checkBox.isSelected() = " + checkBox.isSelected());
        checkBox.click();
        System.out.println("checkBox.isSelected() = " + checkBox.isSelected());

        //3. Verify users can access to ""FORGOT YOUR PASSWORD?"" link page
        WebElement forgotPassword= driver.findElement(By.xpath("//a[@class='login-link-forgot-pass']"));
        forgotPassword.click();
        Thread.sleep(2000);
        driver.navigate().back();

        //"1. Verify users can login

        WebElement login=driver.findElement(By.xpath("//input[@name='USER_LOGIN']"));
        login.sendKeys("hr33@cybertekschool.com");
        WebElement password=driver.findElement(By.xpath("//input[@name='USER_PASSWORD']"));
        password.sendKeys("UserUser");
        WebElement loginBtn=driver.findElement(By.xpath("//input[@type='submit']"));
        loginBtn.click();



    }



    }


