package tests.US_0005;

import org.openqa.selenium.WindowType;
import org.testng.annotations.Test;
import pages.HotelMyCampMain;
import utilities.Driver;

public class TestCase01 {
    HotelMyCampMain hotel;

    @Test
    public void test01() throws InterruptedException {
         hotel = new HotelMyCampMain();
         hotel.loginOl();


        hotel.hotelManagementButtonElementi.click();
        hotel.hotelListButtonElementi.click();
        hotel.detailsHotelListButonu.click();

Driver.getDriver().switchTo().newWindow(WindowType.TAB);
Driver.getDriver().get("https://www.hotelmycamp.com/admin/HotelAdmin/Edit?Id=1074#tab_general");

        hotel.codeKutusuWebElementi.clear();
        hotel.codeKutusuWebElementi.sendKeys("G27");


        // hotel.nameKutusuWebElementi.sendKeys("Titanic Hotel");
        // hotel.addHotelButtonElementi.sendKeys("US");
        // hotel.phoneKutusuWebElementi.sendKeys("+1 408-123-987");
        // hotel.emailHotelListKutusuWebElementi.sendKeys("titanichtl@gmail.com");
        // hotel.idGroupKutusuWebElementi.sendKeys("Hotel Type2");
        // hotel.saveButonuWebElementi.click();
        // actions.perform();




    }
}

