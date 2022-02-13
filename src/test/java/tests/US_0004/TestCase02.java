package tests.US_0004;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HotelMyCampHotelList;
import pages.HotelMyCampMain;
import utilities.Driver;
import utilities.ReusableMethods;

import java.io.IOException;

public class TestCase02 {

    //"https://www.hotelmycamp.com/admin/HotelAdmin/
    //Adresindeki 'ADD HOTEL' butonu gorunuyor ve tiklanabiliyor olmali."

    @Test
    public void test02() throws IOException {

        HotelMyCampMain hotelMyCamp = new HotelMyCampMain();
        HotelMyCampHotelList hotelList = new HotelMyCampHotelList();

        hotelMyCamp.loginOl();

        hotelMyCamp.hotelManagementButtonElementi.click();
        hotelMyCamp.hotelListButtonElementi.click();

        WebElement addHotelButtonElementi = hotelMyCamp.addHotelButtonElementi;
        Assert.assertTrue(addHotelButtonElementi.isDisplayed());

        addHotelButtonElementi.click();

        ReusableMethods.getScreenshot("AddHotelPage");

        String expectedUrl = "https://www.hotelmycamp.com/admin/HotelAdmin/Create";
        String actualUrl = Driver.getDriver().getCurrentUrl();

        Assert.assertEquals(actualUrl, expectedUrl);


        Driver.closeDriver();



    }





  
}
