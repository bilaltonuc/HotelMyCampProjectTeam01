package tests.US_0008;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HotelMyCampMain;
import pages.HotelMyCampRoomReservation;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class TestCase01 {
    HotelMyCampRoomReservation hotelMyCampRoomReservation;
    HotelMyCampMain hotelMyCampMain;


    @Test
    public void test01() {

        Driver.getDriver().get(ConfigReader.getProperty("HMCUrl"));
        ReusableMethods.waitFor(5);

        hotelMyCampMain=new HotelMyCampMain();
        hotelMyCampMain.anasayfaLogin.click();
        hotelMyCampMain.usernameBox.sendKeys(ConfigReader.getProperty("ValidUserName"));
        hotelMyCampMain.passwordBox.sendKeys(ConfigReader.getProperty("ValidPassword"));
        ReusableMethods.waitFor(5);
        hotelMyCampMain.loginButtonElementi.click();


    }
    @Test
    public void test02(){
        Assert.assertTrue(hotelMyCampMain.hotelManagementButtonElementi.isDisplayed());
        ReusableMethods.waitFor(5);
        hotelMyCampMain.hotelManagementButtonElementi.click();
        ReusableMethods.waitFor(5);
        Assert.assertTrue(hotelMyCampMain.roomReservationButtonElementi.isDisplayed());

    }

    @Test
    public void test03(){

        hotelMyCampMain.roomReservationButtonElementi.click();
        Assert.assertTrue(hotelMyCampMain.addRoomReservationButtonElementi.isDisplayed());
    }

    @Test
    public void test04(){

        hotelMyCampMain.addRoomReservationButtonElementi.click();
    }




























}
