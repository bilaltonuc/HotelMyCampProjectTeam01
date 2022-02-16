package tests.US_0005;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HotelMyCampHotelList;
import utilities.Driver;
import utilities.ReusableMethods;

import java.util.Set;

public class TestCase02 {
    HotelMyCampHotelList hmclist;
    JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();

@Test
    public void test01(){

       hmclist = new HotelMyCampHotelList();
    //hmclist.loginOl();

    hmclist.hotelManagementButtonElementi.click();
    hmclist.hotelListButtonElementi.click();

    js.executeScript("arguments[0].scrollIntoView()",hmclist.detailsHotelListButonu);
    js.executeScript("arguments[0].click()",hmclist.detailsHotelListButonu);

    //Assert.assertTrue(hmclist.editHotelYazisi.isDisplayed());


}
}
