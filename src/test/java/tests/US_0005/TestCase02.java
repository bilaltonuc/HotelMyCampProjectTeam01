package tests.US_0005;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HotelMyCampHotelList;
import pages.HotelMyCampMain;

public class TestCase02 {

    @Test
    public void test2(){

        HotelMyCampHotelList hmclist;
        hmclist = new HotelMyCampHotelList();
        hmclist.loginOl();

        hmclist.detailsButonu.click();
        hmclist.detailsHotelListButonu.click();
        String actualHotelYazisi=hmclist.editHotelYazisi.getText();
        String expectedHotelYazisi="Edit Hotel";

       Assert.assertEquals(actualHotelYazisi,expectedHotelYazisi);

    }


}
