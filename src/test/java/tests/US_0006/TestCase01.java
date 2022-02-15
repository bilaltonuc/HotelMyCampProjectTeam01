package tests.US_0006;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import pages.HotelMyCampHotelList;
import pages.HotelMyCampHotelRooms;
import pages.HotelMyCampMain;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

import java.io.IOException;

public class TestCase01 {
    //Adresindeki 'Login' buttonu tiklanir. "https://www.hotelmycamp.com/Account/Logon
    //Adresinde dogru username ve password girilerek sisteme giris yapilir."
    @Test
    public void test2() throws IOException {
        HotelMyCampHotelList hotelList = new HotelMyCampHotelList();
        HotelMyCampMain hotelMyCamp = new HotelMyCampMain();
        HotelMyCampHotelRooms hotelMyCampHotelRooms=new HotelMyCampHotelRooms();

        hotelMyCamp.loginOl();

        String expectedUrl ="https://www.hotelmycamp.com/Admin/UserAdmin";
        String actualUrl = Driver.getDriver().getCurrentUrl();
        Assert.assertEquals(actualUrl,expectedUrl);

        ReusableMethods.getScreenshot("LoginBasarili");
    }
    @Test
    public void test1() throws InterruptedException {
        HotelMyCampMain hotelMyCamp = new HotelMyCampMain();
       Driver.getDriver().get(ConfigReader.getProperty("HMCUrl"));
       hotelMyCamp.anasayfaLogin.click();

    }
    @AfterClass
    public void close(){
        Driver.closeDriver();
    }
}
