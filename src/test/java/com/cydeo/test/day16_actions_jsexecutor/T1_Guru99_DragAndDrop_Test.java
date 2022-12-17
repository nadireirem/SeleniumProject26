package com.cydeo.test.day16_actions_jsexecutor;

import com.cydeo.test.utilities.ConfigurationReader;
import com.cydeo.test.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class T1_Guru99_DragAndDrop_Test {

    @Test
    public void guru99_dragAndDrop_test(){

        //    1- Open a chrome browser
//    2- Go to: https://demo.guru99.com/test/drag_drop.html
        Driver.getDriver().get(ConfigurationReader.getProperty("guru99.dropdown.url"));

//    3- Drag “BANK” and drop into Account area under Debit Side
        WebElement bank = Driver.getDriver().findElement(By.partialLinkText("BANK"));
        WebElement debitAccount = Driver.getDriver().findElement(By.id("bank"));

        Actions actions = new Actions(Driver.getDriver());
        actions.dragAndDrop(bank,debitAccount).perform();

//    4- Drag “5000” and drop into Amount area under Debit Side
        WebElement fiveK = Driver.getDriver().findElement(By.linkText("5000"));
        WebElement debitAmount = Driver.getDriver().findElement(By.id("amt7"));

        actions.dragAndDrop(fiveK,debitAmount).perform();



//    5- Drag “SALES” and drop into Account area under Credit Side
        WebElement sales=Driver.getDriver().findElement(By.linkText("SALES"));
        WebElement creditAmount=Driver.getDriver().findElement(By.cssSelector("#loan"));

        actions.dragAndDrop(sales,creditAmount).perform();


//    6- Drag “5000” and drop into Amount area under Credit Side
        WebElement fiveThousand=Driver.getDriver().findElement(By.linkText("5000"));
        WebElement creditSide=Driver.getDriver().findElement(By.id("amt8"));

        actions.dragAndDrop(fiveThousand,creditSide).perform();



//    7- Verify “Perfect!” text displayed.
        WebElement text=Driver.getDriver().findElement(By.linkText("Perfect!"));
        String actual=text.getText();
        String expected="Perfect!";
        Assert.assertEquals(actual,expected,"failed to get expected text");
    }
}