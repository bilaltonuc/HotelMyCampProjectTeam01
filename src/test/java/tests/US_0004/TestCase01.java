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

    @Test
    public void test01() throws IOException {

        HotelMyCampHotelList hotelList = new HotelMyCampHotelList();
        HotelMyCampMain hotelMyCamp = new HotelMyCampMain();

//Login butonu tiklanarak giris yapilabilmeli.
//	Username ve Password box alanina veri girilebilmeli ve Login butonuna tiklanabilmeli.

        hotelMyCamp.loginOl();


        String expectedUrl ="https://www.hotelmycamp.com/Admin/UserAdmin";
        String actualUrl = Driver.getDriver().getCurrentUrl();
        Assert.assertEquals(actualUrl,expectedUrl);

        ReusableMethods.getScreenshot("LoginBasarili");


//	"https://www.hotelmycamp.com/Admin/UserAdmin/
//Adresindeki 'Hotel List' butonu gorunuyor ve tiklanabiliyor olmali."

        WebElement hotelManagementButtonElementi = hotelMyCamp.hotelManagementButtonElementi;
        hotelManagementButtonElementi.click();
        WebElement hotelListButtonElementi = hotelList.hotelListButtonElementi;
        Assert.assertTrue(hotelListButtonElementi.isDisplayed());

        WebElement kayitSayisiDropDownElementi = hotelList.addHotelkayitSayisiDropDownElementi;
        Select select = new Select(kayitSayisiDropDownElementi);
        select.selectByValue("-1");
       // Driver.closeDriver();

    }



}
