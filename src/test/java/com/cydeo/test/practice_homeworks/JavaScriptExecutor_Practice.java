package com.cydeo.test.practice_homeworks;

import com.cydeo.test.utilities.Driver;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

public class JavaScriptExecutor_Practice {

    @Test
    public void jSExecutor() throws InterruptedException {

        //TC #6: Scroll using JavascriptExecutor
        //1- Open a chrome browser
        //2- Go to: https://practice.cydeo.com/infinite_scroll
        Driver.getDriver().get("https://practice.cydeo.com/infinite_scroll");
        //3- Use below JavaScript method and scroll
        //a.  750 pixels down 10 times.

        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
      for (int i = 0 ; i<=10 ;i++) {
            js.executeScript("window.scrollBy(0,750)");
            Thread.sleep(1000);
        }
        //b.  750 pixels up 10 times
       for (int i = 0 ; i<=10 ;i++) {
            js.executeScript("window.scrollBy(0,-750)");
           Thread.sleep(1000);
            //JavaScript method to use : window.scrollBy(0,0)
       }
    }


    //TODO
}
