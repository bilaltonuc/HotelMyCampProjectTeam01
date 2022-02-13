package tests.US_0004;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HotelMyCampHotelList;
import pages.HotelMyCampMain;
import utilities.Driver;
import utilities.ReusableMethods;

import java.io.IOException;

public class TestCase02 {

    //"https://www.hotelmycamp.com/admin/HotelAdmin/
    //Adresindeki 'ADD HOTEL' butonu gorunuyor ve tiklanabiliyor olmali."

    @Test
    public void test02() throws IOException {

        HotelMyCampMain hotelMyCamp = new HotelMyCampMain();
        HotelMyCampHotelList hotelList = new HotelMyCampHotelList();

        hotelMyCamp.loginOl();

        hotelMyCamp.hotelManagementButtonElementi.click();
        hotelMyCamp.hotelListButtonElementi.click();

        WebElement addHotelButtonElementi = hotelMyCamp.addHotelButtonElementi;
        Assert.assertTrue(addHotelButtonElementi.isDisplayed());

        addHotelButtonElementi.click();

        ReusableMethods.getScreenshot("AddHotelPage");

        String expectedUrl = "https://www.hotelmycamp.com/admin/HotelAdmin/Create";
        String actualUrl = Driver.getDriver().getCurrentUrl();

        Assert.assertEquals(actualUrl, expectedUrl);
























/*
        String code ="13579";
        hotelList.addHotelCodeBoxElementi.sendKeys(code);

        String hotelName = "Deneme Hotel";
        hotelList.addHotelNameBoxElementi.sendKeys(hotelName);

        String hotelAddress ="9 E. Loockerman street, suite 311 Dover, DE 19901";
        hotelList.addHotelAddressBoxElementi.sendKeys(hotelAddress);

        String hotelPhone="302 718 2180";
        hotelList.addHotelPhoneBoxElementi.sendKeys(hotelPhone);

        String hotelMail = "info@hotelmycamp.com";
        hotelList.addHotelEmailBoxElementi.sendKeys(hotelMail);


        WebElement dropDownElementi = hotelList.addHotelIDGroupDropDownElementi;
        Select select = new Select(dropDownElementi);
        select.selectByIndex(1);
        hotelList.addHotelSaveButtonElementi.click();

        hotelMyCamp.bekle(1);
        ReusableMethods.getScreenshot("Save");

        String expectedResultText = "Hotel was inserted successfully";
        String actualResultText = hotelList.addHotelAlertMesajiElementi.getText();
        Assert.assertTrue(actualResultText.contains(expectedResultText));

        WebElement alertOkButtonElementi = hotelList.addHotelAlertOkButtonElementi;
        alertOkButtonElementi.click();
*/

        Driver.closeDriver();
    }





















  
}
