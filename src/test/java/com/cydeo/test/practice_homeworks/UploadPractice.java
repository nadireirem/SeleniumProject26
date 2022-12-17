package com.cydeo.test.practice_homeworks;

import com.cydeo.test.utilities.ConfigurationReader;
import com.cydeo.test.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class UploadPractice {
    @Test
    public void upload_test() {


        //1. Go to https://practice.cydeo.com/upload
        Driver.getDriver().get(ConfigurationReader.getProperty("upload.practice"));

        //2. Find some small file from your computer, and get the path of it.
        WebElement chooseFile = Driver.getDriver().findElement(By.id("file-upload"));
        chooseFile.sendKeys("C:\\Users\\uslul\\Desktop\\Screenshot 2022-06-21 173349.png");

        //3. Upload the file.
        WebElement uploadBtn = Driver.getDriver().findElement(By.id("file-submit"));
        uploadBtn.click();
        //4. Assert:
        //-File uploaded text is displayed on the page
        //
        WebElement resulMsg=Driver.getDriver().findElement(By.xpath("//div[@class='example']"));

        String actualMsg =resulMsg.getText();
        System.out.println("actualMsg " + actualMsg);

        Driver.closeDriver();


    }
}