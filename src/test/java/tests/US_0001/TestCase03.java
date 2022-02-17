package tests.US_0001;

import com.github.javafaker.Faker;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HotelMyCampMainaAnaSayfa;
import utilities.Driver;

import java.security.Key;

public class TestCase03 {
//5.Ana sayfadaki Welcome to our hotel bölümünün var olup olmadığına bakılır

    @Test
    public void isDisplayedTesti4() throws InterruptedException {
        HotelMyCampMainaAnaSayfa hotelMyCampMainaAnaSayfa=new HotelMyCampMainaAnaSayfa();
        hotelMyCampMainaAnaSayfa.anaSayfaUrl();
        JavascriptExecutor javascriptExecutor=(JavascriptExecutor) Driver.getDriver();
        javascriptExecutor.executeScript("window.scrollBy(0,400)");
        Thread.sleep(3000);
        Assert.assertTrue(hotelMyCampMainaAnaSayfa.welcomeToOur.isDisplayed());

        //6.Ana sayfadaki our rooms bölümüne gidilir ve altındakı seçeneklere tıklanır

        javascriptExecutor.executeScript("arguments[0].click();",hotelMyCampMainaAnaSayfa.viewRoomDetails1);
        Assert.assertTrue(hotelMyCampMainaAnaSayfa.viewRoomDetailsKontrol1.isDisplayed());
        Driver.getDriver().navigate().back();
        Thread.sleep(3000);

        javascriptExecutor.executeScript("arguments[0].click();",hotelMyCampMainaAnaSayfa.viewRoomDetails2);
        Assert.assertTrue(hotelMyCampMainaAnaSayfa.viewRoomDetailsKontrol2.isDisplayed());
        Driver.getDriver().navigate().back();
        Thread.sleep(3000);



        javascriptExecutor.executeScript("arguments[0].click();",hotelMyCampMainaAnaSayfa.viewRoomDetails3);
        Assert.assertTrue(hotelMyCampMainaAnaSayfa.viewRoomDetailsKontrol3.isDisplayed());
        Driver.getDriver().navigate().back();
        Thread.sleep(3000);



        javascriptExecutor.executeScript("arguments[0].click();",hotelMyCampMainaAnaSayfa.viewRoomDetails4);
        Assert.assertTrue(hotelMyCampMainaAnaSayfa.viewRoomDetailsKontrol4.isDisplayed());
        Driver.getDriver().navigate().back();
        Thread.sleep(3000);



        javascriptExecutor.executeScript("arguments[0].click();",hotelMyCampMainaAnaSayfa.viewRoomDetails5);
        Assert.assertTrue(hotelMyCampMainaAnaSayfa.viewRoomDetailsKontrol5.isDisplayed());
        Driver.getDriver().navigate().back();

        Thread.sleep(3000);



        javascriptExecutor.executeScript("arguments[0].click();",hotelMyCampMainaAnaSayfa.viewRoomDetails6);
        Assert.assertTrue(hotelMyCampMainaAnaSayfa.viewRoomDetailsKontrol6.isDisplayed());
        Driver.closeDriver();
    }


}
