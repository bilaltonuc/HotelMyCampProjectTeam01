package tests.US_0004;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HotelMyCampHotelList;
import pages.HotelMyCampMain;
import utilities.ReusableMethods;

import java.io.IOException;

public class TestCase03 {

    //TC0003
    //"https://www.hotelmycamp.com/admin/HotelAdmin/Create/
    //adresinde 'Create Hotel' yazisi gorunuyor olmali."


    @Test
    public void test03() throws IOException {
        HotelMyCampMain hotelMyCampMain = new HotelMyCampMain();
        HotelMyCampHotelList hotelList = new HotelMyCampHotelList();
        hotelMyCampMain.loginOl();

        hotelMyCampMain.hotelManagementButtonElementi.click();
        hotelMyCampMain.hotelListButtonElementi.click();
        hotelMyCampMain.addHotelButtonElementi.click();

        ReusableMethods.getScreenshot("Create_Hotel");
        String expectedResult = "Create Hotel";
        String actualresult = hotelList.addHotelCreateHotelYazisiElementi.getText();

        Assert.assertEquals(actualresult, expectedResult);












    }












}
