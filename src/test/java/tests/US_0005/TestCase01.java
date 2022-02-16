package tests.US_0005;

import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HotelMyCampHotelList;
import pages.HotelMyCampMain;
import utilities.Driver;
import utilities.ReusableMethods;

import java.util.Set;

public class TestCase01 {
    HotelMyCampHotelList hmclist;
    Alert alert;


    @Test
    public void test01() throws InterruptedException {
         hmclist = new HotelMyCampHotelList();
         hmclist.loginOl();

        hmclist.hotelManagementButtonElementi.click();
        hmclist.hotelListButtonElementi.click();


        WebElement hotelYaziElementi= hmclist.listofHotelsYazisi;
        Assert.assertTrue(hotelYaziElementi.isDisplayed());


    }
}



