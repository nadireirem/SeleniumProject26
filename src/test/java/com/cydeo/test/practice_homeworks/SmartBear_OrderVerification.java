package com.cydeo.test.practice_homeworks;

import com.cydeo.test.base.TestBase;
import com.cydeo.test.utilities.SmartBearUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SmartBear_OrderVerification extends TestBase {
    @Test
    public void orderVerification(){
        //1. Open browser and login to Smartbear software
        SmartBearUtils.SmartBearLogin(driver);

        //2. Click on View all orders
        WebElement viewOrders=driver.findElement(By.xpath("//a[.='View all orders']"));
        viewOrders.click();
        //3. Verify Susan McLaren has order on date “01/05/2010”
        WebElement susanMcLarenDateCell =
                driver.findElement(By.xpath("//td[.='Susan McLaren']//following-sibling::td[3]"));

        String actualSusanMcLarenDateCell= susanMcLarenDateCell.getText();
        String expectedSusanDate = "01/05/2010";

        Assert.assertEquals(actualSusanMcLarenDateCell,expectedSusanDate,"verification failed!");






    }

}
