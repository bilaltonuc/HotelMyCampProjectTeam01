package tests.US_0004;

import com.github.javafaker.Faker;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HotelMyCampHotelList;
import pages.HotelMyCampMain;
import utilities.Driver;
import utilities.ReusableMethods;

import java.io.IOException;

public class TestCase01 {

//1-) 'Hotel Management' altinda, 'Hotel List' gorunuyor ve tiklandiginda
// 'https://www.hotelmycamp.com/admin/HotelAdmin' adresine yonlendiriyor olmali.


    @Test
    public void test01() throws IOException {

        HotelMyCampHotelList hotelList = new HotelMyCampHotelList();
        HotelMyCampMain hotelMyCamp = new HotelMyCampMain();
        hotelMyCamp.loginOl();

        String expectedUrl ="https://www.hotelmycamp.com/Admin/UserAdmin";
        String actualUrl = Driver.getDriver().getCurrentUrl();
        Assert.assertEquals(actualUrl,expectedUrl);

        ReusableMethods.getScreenshot("LoginBasarili");

        Driver.closeDriver();

    }



}
