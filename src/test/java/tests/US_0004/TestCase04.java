package tests.US_0004;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HotelMyCampHotelList;
import pages.HotelMyCampMain;
import utilities.Driver;
import utilities.ReusableMethods;

import java.io.IOException;

public class TestCase04 {

   //TC0004
    //SAVE' butonuna basildiginda alert olarak 'Hotel was inserted successfully' mesaji ekranda gorunmeli.


    @Test
    public void test01() throws IOException {

        HotelMyCampMain hotelMyCamp = new HotelMyCampMain();
        HotelMyCampHotelList hotelList = new HotelMyCampHotelList();

        hotelMyCamp.loginOl();
        hotelMyCamp.hotelManagementButtonElementi.click();
        hotelMyCamp.hotelListButtonElementi.click();
        hotelMyCamp.addHotelButtonElementi.click();



/*
        "Code: 13579
        Name: Deneme Hotel
        Address: 9 E. Loockerman street, suite 311 Dover, DE 19901
        Phone: 302 718 2180
        Email: info@hotelmycamp.com
        Yukaridaki bilgilerle yeni hotel olusturulacak.
*/



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
        ReusableMethods.getScreenshot("Hotel_Save");

        String expectedResultText = "Hotel was inserted successfully";
        String actualResultText = hotelList.addHotelAlertMesajiElementi.getText();
        Assert.assertTrue(actualResultText.contains(expectedResultText));

        WebElement alertOkButtonElementi = hotelList.addHotelAlertOkButtonElementi;
        alertOkButtonElementi.click();
        Driver.closeDriver();







    }





}
