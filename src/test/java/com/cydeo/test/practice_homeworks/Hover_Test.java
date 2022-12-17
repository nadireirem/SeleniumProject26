package com.cydeo.test.practice_homeworks;

import com.cydeo.test.utilities.ConfigurationReader;
import com.cydeo.test.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Hover_Test {
    @Test
    public void hover_practice(){

        //1. Go to https://practice.cydeo.com/hovers
        Driver.getDriver().get(ConfigurationReader.getProperty("hover.practice"));
        //2. Hover over to first image
        WebElement firstImg=Driver.getDriver().findElement(By.xpath("(//div[@class='figure']/img)[1]"));
        Actions actions=new Actions(Driver.getDriver());
        actions.moveToElement(firstImg).perform();

        //3. Assert:
        //a. “name: user1” is displayed
        WebElement firstImgText=Driver.getDriver().findElement(By.xpath("//h5[.='name: user1']"));
        System.out.println("firstImgText.isDisplayed() = " + firstImgText.isDisplayed());



        //b. “view profile” is displayed
      //  WebElement firstViewProfile=Driver.getDriver().findElement
        //4. Hover over to second image
        //5. Assert:
        //a. “name: user2” is displayed
        //b. “view profile” is displayed
        //6. Hover over to third image
        //7. Confirm:
        //a. “name: user3” is displayed
        //b. “view profile” is displayed


    }


    //TODO


}
