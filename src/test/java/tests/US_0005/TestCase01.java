package tests.US_0005;

import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
import pages.HotelMyCampMain;
import utilities.Driver;
import utilities.ReusableMethods;

import java.util.Set;

public class TestCase01 {
    HotelMyCampMain hotel;
    Alert alert;
    JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();

    @Test
    public void test01() throws InterruptedException {
         hotel = new HotelMyCampMain();
         hotel.loginOl();



        hotel.hotelManagementButtonElementi.click();
        hotel.hotelListButtonElementi.click();
        hotel.detailsButonu.click();
        hotel.detailsHotelListButonu.click();


        String ilksyfHandleDegeri = Driver.getDriver().getWindowHandle();

        Set<String> handleSet = Driver.getDriver().getWindowHandles();
        String ikincisyfHandleDegeri = "";
        for (String each : handleSet
        ) {
            if (!each.equals(ilksyfHandleDegeri))
                ikincisyfHandleDegeri = each;
        }
        Driver.getDriver().switchTo().window(ikincisyfHandleDegeri);

        hotel.codeKutusuWebElementi.clear();
        ReusableMethods.waitFor(2);

        hotel.codeKutusuWebElementi.sendKeys("G27");
        hotel.nameKutusuWebElementi.clear();
        ReusableMethods.waitFor(2);
        hotel.nameKutusuWebElementi.sendKeys("Titanic Hotel");
        hotel.addressKutusuWebElementi.clear();
        hotel.addressKutusuWebElementi.sendKeys("US");
        ReusableMethods.waitFor(2);
        hotel.phoneKutusuWebElementi.clear();
        hotel.phoneKutusuWebElementi.sendKeys("+1 408-123-987");
        ReusableMethods.waitFor(2);
        hotel.emailHotelListKutusuWebElementi.clear();

        hotel.emailHotelListKutusuWebElementi.sendKeys("titanichtl@gmail.com");

        Select select=new Select(hotel.idGroupKutusuWebElementi);
        select.selectByVisibleText("Hotel Type2");
        hotel.saveButonuWebElementi.click();

        ReusableMethods.waitFor(3);
        js.executeScript("arguments[0].scrollIntoView()",hotel.alertOkayButonu);

        js.executeScript("arguments[0].click()",hotel.alertOkayButonu);
        ReusableMethods.waitFor(3);

        // hotel.deleteButonuWebElementi.click();
        // js.executeScript("arguments[0].scrollIntoView()",hotel.deleteButonuWebElementi);
        // js.executeScript("arguments[0].click()",hotel.alertOkayButonu);
        hotel.tearDown();
    }

}


