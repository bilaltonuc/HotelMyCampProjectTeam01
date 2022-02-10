package tests.US_0004;

import com.github.javafaker.Faker;
import org.testng.annotations.Test;
import pages.HotelMyCampMain;
import utilities.ReusableMethods;

import java.io.IOException;

public class TestCase01 {

//1-) 'Hotel Management' altinda, 'Hotel List' gorunuyor ve tiklandiginda
// 'https://www.hotelmycamp.com/admin/HotelAdmin' adresine yonlendiriyor olmali.


    @Test
    public void test01() {
        HotelMyCampMain hotelMyCamp = new HotelMyCampMain();
        hotelMyCamp.loginOl();
        hotelMyCamp.hotelManagementButtonElementi.click();
        hotelMyCamp.hotelListButtonElementi.click();
        hotelMyCamp.addHotelButtonElementi.click();
        Faker faker = new Faker();
        //





    }




}
