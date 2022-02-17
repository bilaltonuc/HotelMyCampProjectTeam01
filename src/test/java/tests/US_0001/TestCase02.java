package tests.US_0001;

import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HotelMyCampMainaAnaSayfa;
import utilities.Driver;

public class TestCase02 {

    //3.Ana sayfadaki check-in date,check-out date,room,customer elementlerinin var olup olmadığına bakılır kontrol edılır

    HotelMyCampMainaAnaSayfa hotelMyCampMainaAnaSayfa;

    @Test
    public void isDisPlayedTesti3()  {

        hotelMyCampMainaAnaSayfa=new HotelMyCampMainaAnaSayfa();
        hotelMyCampMainaAnaSayfa.anaSayfaUrl();
        Assert.assertTrue(hotelMyCampMainaAnaSayfa.checkİnDateButton.isDisplayed());
        Assert.assertTrue(hotelMyCampMainaAnaSayfa.checkOutDateButton.isDisplayed());
        Assert.assertTrue(hotelMyCampMainaAnaSayfa.roomTypeButton.isDisplayed());
        Assert.assertTrue(hotelMyCampMainaAnaSayfa.customerButton.isDisplayed());
        Assert.assertTrue(hotelMyCampMainaAnaSayfa.checkAvailabilityButton.isDisplayed());


        hotelMyCampMainaAnaSayfa.checkİnDateButton.click();
        hotelMyCampMainaAnaSayfa.checkİnDateButton.clear();
        hotelMyCampMainaAnaSayfa.checkİnDateButton.click();
        hotelMyCampMainaAnaSayfa.checkİnDateButton.sendKeys("4/28/2022");
        hotelMyCampMainaAnaSayfa.checkOutDateButton.click();
        hotelMyCampMainaAnaSayfa.checkOutDateButton.clear();
        hotelMyCampMainaAnaSayfa.checkOutDateButton.click();
        hotelMyCampMainaAnaSayfa.checkOutDateButton.sendKeys("4/29/2022");


        Select select=new Select(hotelMyCampMainaAnaSayfa.roomTypeButton);
        select.selectByVisibleText("Single");
        Select select1=new Select(hotelMyCampMainaAnaSayfa.customerButton);
        select1.selectByValue("1");

        //4.Gerekli işlemleden sonra check availabiity butonun click sonrası
        // ilgili sayfaya yönlendirip yönlendirmediği kontrol edilirve
        // update edilip edilmediğine bakılır
        hotelMyCampMainaAnaSayfa.checkAvailabilityButton.click();
        Assert.assertTrue(hotelMyCampMainaAnaSayfa.updateControl.isDisplayed());

        Driver.closeDriver();











    }





}
