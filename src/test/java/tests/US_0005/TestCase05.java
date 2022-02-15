package tests.US_0005;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HotelMyCampHotelList;
import pages.HotelMyCampMain;
import utilities.Driver;

public class TestCase05 {
    HotelMyCampHotelList hmclist;
    JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
    @Test
    public void test05(){

   hmclist=new HotelMyCampHotelList();

        hmclist.loginOl();

        hmclist.deleteButonuWebElementi.click();
        js.executeScript("arguments[0].scrollIntoView()",hmclist.deleteButonuWebElementi);
        js.executeScript("arguments[0].click()",hmclist.alertOkayButonu);

        Assert.assertTrue(hmclist.deleteAlertYazisi.isDisplayed());
       hmclist.tearDown();


    }
}
