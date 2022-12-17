package com.cydeo.test.practice_homeworks;

import com.cydeo.test.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Scroll_Using_JavaScriptExecutor {
    @Test
    public void scrollPractice() throws InterruptedException {
        //TC #7: Scroll using JavascriptExecutor
        //1- Open a chrome browser
        //2- Go to:https://practice.cydeo.com/large
        Driver.getDriver().get("https://practice.cydeo.com/large");

        //3- Scroll down to “Cydeo” link
        WebElement cydeoLink=Driver.getDriver().findElement(By.xpath("//a[@target='_blank']"));
        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
        js.executeScript("arguments[0].scrollIntoView(true)",cydeoLink);
Thread.sleep(2000);
        //4- Scroll up to “Home” link
        WebElement homeText=Driver.getDriver().findElement(By.linkText("Home"));
        js.executeScript("arguments[0].scrollIntoView(true)",homeText);

        //5- Use below provided JS method only
        //
        //JavaScript method to use : arguments[0].scrollIntoView(true)
        //
        //Note: You need to locate the links as web elements and pass them as
        //arguments into executeScript() method



    }

    //TODO
}
