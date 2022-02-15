package tests.US_0005;

import org.checkerframework.checker.units.qual.A;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HotelMyCampHotelList;
import pages.HotelMyCampMain;
import utilities.Driver;
import utilities.ReusableMethods;

public class TestCase04 {
    HotelMyCampHotelList hmclist;
    JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();

    @Test
    public void test04(){
       hmclist=new HotelMyCampHotelList();
        hmclist = new HotelMyCampHotelList();
        hmclist.loginOl();

        ReusableMethods.waitFor(3);
        js.executeScript("arguments[0].scrollIntoView()",hmclist.alertOkayButonu);

        js.executeScript("arguments[0].click()",hmclist.alertOkayButonu);
        ReusableMethods.waitFor(3);

       Assert.assertTrue(hmclist.alertTexti.isDisplayed());





    }

}
