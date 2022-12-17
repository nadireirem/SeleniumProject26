package com.cydeo.test.extraSessions;

import com.cydeo.test.base.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class MehmetHomeWork extends TestBase {

    @Test
    public void Test(){
        driver.get("https://moneygaming.qa.gameaccount.com/");

        //            2. Click the JOIN NOW button to open the registration page
        WebElement joinBtn=driver.findElement(By.xpath("//a[@class='newUser green']"));
        joinBtn.click();


        //        3. Select a title value from the dropdown
        Select titleDropdown=new Select(driver.findElement(By.xpath("//select[@name='map(title)']")));

        titleDropdown.selectByValue("Ms");



        //        4. Enter your first name and surname in the form
        WebElement firstName=driver.findElement(By.xpath("//input[@name='map(firstName)']"));
        firstName.sendKeys("Ayse");

        WebElement surname=driver.findElement(By.xpath("//input[@name='map(lastName)']"));
        surname.sendKeys("Ates");


        //        5. Check the tickbox with text "I accept the Terms and Conditions and certify that I am over the age of 18.
        WebElement checkBox=driver.findElement(By.id("checkbox"));
        checkBox.click();

        //            6. Submit the form by clicking the JOIN NOW button
        WebElement joinNowBtn=driver.findElement(By.xpath("//input[@value='Join Now!']"));
        joinNowBtn.click();


        //        7. Validate that a validation message with text "This field is required" appears under the date of birth box
        WebElement errorMsg=driver.findElement(By.xpath("//label[@for='dob']"));
        System.out.println("errorMsg.getText() = " + errorMsg.getText());
        Assert.assertTrue(errorMsg.isDisplayed(),"This field is required");
        //8. Validate that 18 "This field is required" messages  appears
        // //label[.='This field is required']

        List<WebElement> allErrorMessages = driver.findElements(By.xpath("//label[.='This field is required']"));
        Assert.assertEquals(allErrorMessages.size(),18);



    }


}
