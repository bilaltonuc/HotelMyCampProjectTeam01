package tests.US_0001;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HotelMyCampMainaAnaSayfa;
import utilities.Driver;

public class TestCase01 {
    ////1.  https://www.hotelmycamp.com/ adresine gidilir  ve
//// home,Rooms,Restarurant,AboutBlog,Contact ve Log in butonları görüyor mu dıye bakılır

    HotelMyCampMainaAnaSayfa hotelMyCampMainaAnaSayfa;


    @Test
    public void isDisplayedTesti1() {

        hotelMyCampMainaAnaSayfa=new HotelMyCampMainaAnaSayfa();
        hotelMyCampMainaAnaSayfa.anaSayfaUrl();
        Assert.assertTrue(hotelMyCampMainaAnaSayfa.homeButton.isDisplayed());
        Assert.assertTrue(hotelMyCampMainaAnaSayfa.roomsButton.isDisplayed());
        Assert.assertTrue(hotelMyCampMainaAnaSayfa.restaurantButton.isDisplayed());
        Assert.assertTrue(hotelMyCampMainaAnaSayfa.aboutButton.isDisplayed());
        Assert.assertTrue(hotelMyCampMainaAnaSayfa.contactButton.isDisplayed());
        Assert.assertTrue(hotelMyCampMainaAnaSayfa.anasayfaLogin.isDisplayed());

        Driver.closeDriver();

    }

    //2. https://www.hotelmycamp.com/ adresine gidilir ve
    // Navbar'daki butonlara tıklanır ilgili sayfaya gidip gitmediği kontrol edilir

    @Test
    public void isDisplayedTesti2() {

        HotelMyCampMainaAnaSayfa hotelMyCampMainaAnaSayfa=new HotelMyCampMainaAnaSayfa();
        hotelMyCampMainaAnaSayfa.anaSayfaUrl();

        hotelMyCampMainaAnaSayfa.roomsButton.click();
        Assert.assertTrue(hotelMyCampMainaAnaSayfa.roomSayfaControl.isDisplayed());

        hotelMyCampMainaAnaSayfa.restaurantButton.click();
        Assert.assertTrue(hotelMyCampMainaAnaSayfa.restaurantSayfaControl.isDisplayed());

        hotelMyCampMainaAnaSayfa.aboutButton.click();
        String actualUrl= Driver.getDriver().getCurrentUrl();
        String expectedUrl="https://www.hotelmycamp.com/content/about";
        Assert.assertEquals(actualUrl,expectedUrl);

        hotelMyCampMainaAnaSayfa.contactButton.click();
        Assert.assertTrue(hotelMyCampMainaAnaSayfa.contactSayfaControl.isDisplayed());

        hotelMyCampMainaAnaSayfa.anasayfaLogin.click();
        Assert.assertTrue(hotelMyCampMainaAnaSayfa.logInSayfaControl.isDisplayed());


        Driver.closeDriver();





    }

}
