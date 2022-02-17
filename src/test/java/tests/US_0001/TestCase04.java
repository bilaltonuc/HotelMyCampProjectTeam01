package tests.US_0001;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HotelMyCampMainaAnaSayfa;
import utilities.Driver;

public class TestCase04 {
    //7.Ana sayfadaki slider bölümünün görünür olup olmadığı kontrol edilir
    // ve altıındakı yönlendirme butonları tıklanıp tıklanmadığına bakılır

    @Test
    public void isDisplayedTesti5() {
        HotelMyCampMainaAnaSayfa hotelMyCampMainaAnaSayfa = new HotelMyCampMainaAnaSayfa();
        hotelMyCampMainaAnaSayfa.anaSayfaUrl();
        JavascriptExecutor javascriptExecutor = (JavascriptExecutor) Driver.getDriver();

        javascriptExecutor.executeScript("window.scrollBy(0,3200)");
        Assert.assertTrue(hotelMyCampMainaAnaSayfa.sliderBolumu.isDisplayed());

        javascriptExecutor.executeScript("arguments[0].click();", hotelMyCampMainaAnaSayfa.sliderBölümüButton1);
        Assert.assertTrue(hotelMyCampMainaAnaSayfa.sliderBölümüButton1.isEnabled());


        javascriptExecutor.executeScript("arguments[0].click();", hotelMyCampMainaAnaSayfa.sliderBölümüButton2);
        Assert.assertTrue(hotelMyCampMainaAnaSayfa.sliderBölümüButton2.isEnabled());

        javascriptExecutor.executeScript("arguments[0].click();", hotelMyCampMainaAnaSayfa.sliderBölümüButton3);
        Assert.assertTrue(hotelMyCampMainaAnaSayfa.sliderBölümüButton3.isEnabled());

        javascriptExecutor.executeScript("arguments[0].click();", hotelMyCampMainaAnaSayfa.sliderBölümüButton4);
        Assert.assertTrue(hotelMyCampMainaAnaSayfa.sliderBölümüButton4.isEnabled());


//8.Recent Blog bölümü görünüp görünmediği kontrol edilir ve içerisindeki elementler tıklanıyor mu bakılır
        javascriptExecutor.executeScript("window.scrollBy(0,+350)");
        Assert.assertTrue(hotelMyCampMainaAnaSayfa.recentBlog.isDisplayed());

        hotelMyCampMainaAnaSayfa.getRecentBlog1.click();
        String actualTitle1 = Driver.getDriver().getTitle();
        String expectedTitle1 = "Even the all-powerful Pointing has no control about the blind texts 6";
        Assert.assertTrue(actualTitle1.contains(expectedTitle1));
        Driver.getDriver().navigate().back();

        hotelMyCampMainaAnaSayfa.getRecentBlog2.click();
        String actualTitle2 = Driver.getDriver().getTitle();
        String expectedTitle2 = "Even the all-powerful Pointing has no control about the blind texts 5";
        Assert.assertTrue(actualTitle2.contains(expectedTitle2));
        Driver.getDriver().navigate().back();

        hotelMyCampMainaAnaSayfa.getRecentBlog3.click();
        String actualTitle3 = Driver.getDriver().getTitle();
        String expectedTitle3 = "Even the all-powerful Pointing has no control about the blind texts 4";
        Assert.assertTrue(actualTitle3.contains(expectedTitle3));
        Driver.getDriver().navigate().back();

        hotelMyCampMainaAnaSayfa.getRecentBlog4.click();
        String actualTitle4 = Driver.getDriver().getTitle();
        String expectedTitle4 = "Even the all-powerful Pointing has no control about the blind texts 3";
        Assert.assertTrue(actualTitle4.contains(expectedTitle4));


        Driver.closeDriver();


    }
}


