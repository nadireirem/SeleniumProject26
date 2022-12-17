package com.cydeo.test.practice_homeworks;

import com.cydeo.test.base.TestBase;
import com.cydeo.test.utilities.SmartBearUtils;
import com.github.javafaker.Faker;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Smart_Bear_Order extends TestBase {
    @Test
    public void orderPlace() throws InterruptedException {

        //1. Open browser
        //2. Go to website:
        //http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx
        //3. Enter username: “Tester”
        //4. Enter password: “test”
        //5. Click on Login button


        SmartBearUtils.SmartBearLogin(driver);
//6. Click on Order

        WebElement orderLink=driver.findElement(By.xpath("//a[.='Order']"));
        orderLink.click();

        //7. Select familyAlbum from product, set quantity to 2
        Select productDropdown =new Select(driver.findElement(By.id("ctl00_MainContent_fmwOrder_ddlProduct")));
productDropdown.selectByVisibleText("FamilyAlbum");

WebElement quantity=driver.findElement(By.id("ctl00_MainContent_fmwOrder_txtQuantity"));
quantity.sendKeys("2");


        //8. Click to “Calculate” button
        WebElement calculate=driver.findElement(By.xpath("//input[@value='Calculate']"));
        calculate.click();

        //9. Fill address Info with JavaFaker
                //• Generate: name, street, city, state, zip code
        Faker faker=new Faker();
        WebElement nameBtn=driver.findElement(By.id("ctl00_MainContent_fmwOrder_txtName"));
        nameBtn.sendKeys(faker.name().fullName());

        WebElement street=driver.findElement(By.xpath("//input[@name='ctl00$MainContent$fmwOrder$TextBox2']"));
        street.sendKeys(faker.address().streetAddress());

        WebElement city=driver.findElement(By.id("ctl00_MainContent_fmwOrder_TextBox3"));
        city.sendKeys( faker.address().cityName());

        WebElement state=driver.findElement(By.id("ctl00_MainContent_fmwOrder_TextBox4"));
        state.sendKeys(faker.address().state());

        WebElement zip=driver.findElement(By.id("ctl00_MainContent_fmwOrder_TextBox5"));
        zip.sendKeys( faker.address().zipCode().replaceAll("-",""));




        //10. Click on “visa” radio button
WebElement visaBtn=driver.findElement(By.xpath("//input[@value='Visa']"));
visaBtn.click();


        //11. Generate card number using JavaFaker
        WebElement cardNumber=driver.findElement(By.id("ctl00_MainContent_fmwOrder_TextBox6"));
        cardNumber.sendKeys(faker.finance().creditCard().replaceAll("-",""));
        Thread.sleep(3000);

        WebElement expireDate=driver.findElement(By.id("ctl00_MainContent_fmwOrder_TextBox1"));
        expireDate.sendKeys(faker.numerify("12/##"));
        Thread.sleep(3000);

        //12. Click on “Process”
        WebElement process=driver.findElement(By.id("ctl00_MainContent_fmwOrder_InsertButton"));
      ((WebElement) process).click();
        Thread.sleep(3000);

        //13. Verify success message “New order has been successfully added.”
WebElement msg=driver.findElement(By.xpath("//div[@class='buttons_process']//strong"));
String actualMsg=msg.getText();

String expectedMsg="New order has been successfully added.";
        Assert.assertEquals(actualMsg,expectedMsg,"Verification failed!");
        Thread.sleep(2000);
    }
}
