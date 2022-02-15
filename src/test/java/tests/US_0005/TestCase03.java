package tests.US_0005;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
import pages.HotelMyCampHotelList;
import pages.HotelMyCampMain;
import utilities.Driver;
import utilities.ReusableMethods;

import java.util.Set;

public class TestCase03 {

    @Test
    public void test03(){


        HotelMyCampHotelList hmclist;
        hmclist = new HotelMyCampHotelList();
        hmclist.loginOl();

        hmclist.detailsButonu.click();
       hmclist.detailsHotelListButonu.click();

        hmclist.detailsButonu.click();
       hmclist.detailsHotelListButonu.click();


        String ilksyfHandleDegeri = Driver.getDriver().getWindowHandle();

        Set<String> handleSet = Driver.getDriver().getWindowHandles();
        String ikincisyfHandleDegeri = "";
        for (String each : handleSet
        ) {
            if (!each.equals(ilksyfHandleDegeri))
                ikincisyfHandleDegeri = each;
        }
        Driver.getDriver().switchTo().window(ikincisyfHandleDegeri);

       hmclist.codeKutusuWebElementi.clear();
        ReusableMethods.waitFor(2);

        hmclist.codeKutusuWebElementi.sendKeys("G27");
        hmclist.nameKutusuWebElementi.clear();
        ReusableMethods.waitFor(2);
        hmclist.nameKutusuWebElementi.sendKeys("Titanic Hotel");
        hmclist.addressKutusuWebElementi.clear();
        hmclist.addressKutusuWebElementi.sendKeys("US");
        ReusableMethods.waitFor(2);
        hmclist.phoneKutusuWebElementi.clear();
        hmclist.phoneKutusuWebElementi.sendKeys("+1 408-123-987");
        ReusableMethods.waitFor(2);
        hmclist.emailHotelListKutusuWebElementi.clear();

        hmclist.emailHotelListKutusuWebElementi.sendKeys("titanichtl@gmail.com");

        Select select=new Select(hmclist.idGroupKutusuWebElementi);
        select.selectByVisibleText("Hotel Type2");
        hmclist.saveButonuWebElementi.click();





    }
}
