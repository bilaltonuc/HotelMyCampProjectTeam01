package tests.US_0004;

import org.testng.annotations.Test;
import pages.HotelMyCampMain;

public class TestCase01 {

//1-) 'Hotel Management' altinda, 'Hotel List' gorunuyor ve tiklandiginda
// 'https://www.hotelmycamp.com/admin/HotelAdmin' adresine yonlendiriyor olmali.


    @Test
    public void test01() {
        HotelMyCampMain hotelMyCamp = new HotelMyCampMain();
        hotelMyCamp.loginOl();




    }




}
