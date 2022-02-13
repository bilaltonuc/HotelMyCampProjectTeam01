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


    @Test(invocationCount = 500)
    public void test01() {
        HotelMyCampHotelList hotelList = new HotelMyCampHotelList();
        HotelMyCampMain hotelMyCamp = new HotelMyCampMain();
        hotelMyCamp.loginOl();
        hotelMyCamp.hotelManagementButtonElementi.click();
        hotelMyCamp.hotelListButtonElementi.click();
        hotelMyCamp.addHotelButtonElementi.click();
        hotelList.addHotelCodeBoxElementi.sendKeys("13579");
        hotelList.addHotelNameBoxElementi.sendKeys("Deneme Hotel");
        hotelList.addHotelAddressBoxElementi.sendKeys("9 E. Loockerman street, suite 311 Dover, DE 19901");
        hotelList.addHotelPhoneBoxElementi.sendKeys("302 718 2180");
        hotelList.addHotelEmailBoxElementi.sendKeys("info@hotelmycamp.com");
        WebElement dropDownElementi = hotelList.addHotelIDGroupDropDownElementi;
        Select select = new Select(dropDownElementi);
        select.selectByIndex(1);
        hotelList.addHotelSaveButtonElementi.click();

        String expectedResultText = "Hotel was inserted successfully";

        String actualResultText = hotelList.addHotelAlertMesajiElementi.getText();
        Assert.assertTrue(actualResultText.contains(expectedResultText));

        hotelMyCamp.bekle(1);
        WebElement alertOkButtonElementi = hotelList.addHotelAlertOkButtonElementi;
        alertOkButtonElementi.click();


        Driver.closeDriver();
    }



}
