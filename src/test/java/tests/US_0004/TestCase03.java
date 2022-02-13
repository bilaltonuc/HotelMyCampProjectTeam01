package tests.US_0004;

import org.testng.annotations.Test;
import pages.HotelMyCampHotelList;
import pages.HotelMyCampMain;

public class TestCase03 {

    //TC0003
    //"https://www.hotelmycamp.com/admin/HotelAdmin/Create/
    //adresinde 'Create Hotel' yazisi gorunuyor olmali."


    @Test
    public void test03() {
        HotelMyCampMain hotelMyCampMain = new HotelMyCampMain();
        HotelMyCampHotelList hotelList = new HotelMyCampHotelList();
        hotelMyCampMain.loginOl();

        hotelMyCampMain.hotelManagementButtonElementi.click();
        hotelMyCampMain.hotelListButtonElementi.click();
        hotelMyCampMain.addHotelButtonElementi.click();












    }












}
