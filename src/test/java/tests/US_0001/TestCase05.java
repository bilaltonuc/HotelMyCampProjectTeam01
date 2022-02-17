
    package tests.US_0001;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.HotelMyCampMainaAnaSayfa;
import utilities.Driver;

import java.io.File;
import java.io.IOException;

    public class TestCase05 {

        //9.Instagram kısmı görünüp görünmediğine bakılır ve içerisindeki elementler
        // tıklanıp tıklanmadığı kontrol edilir

        HotelMyCampMainaAnaSayfa hotelMyCampMainaAnaSayfa;
        @Test
        public void instgramTesti() throws IOException {

            hotelMyCampMainaAnaSayfa=new HotelMyCampMainaAnaSayfa();
            hotelMyCampMainaAnaSayfa.anaSayfaUrl();


            JavascriptExecutor javascriptExecutor=(JavascriptExecutor) Driver.getDriver();
          //  javascriptExecutor.executeScript("arguments[0].scrollIntoView(true);",hotelMyCampMainaAnaSayfa.instgramResim1);
            javascriptExecutor.executeScript("arguments[0].click();",hotelMyCampMainaAnaSayfa.instgramResim1);
            Assert.assertTrue(hotelMyCampMainaAnaSayfa.instgramResim1.isEnabled());

            javascriptExecutor.executeScript("arguments[0].click();",hotelMyCampMainaAnaSayfa.instgramResim2);
            Assert.assertTrue(hotelMyCampMainaAnaSayfa.instgramResim2.isEnabled());

            javascriptExecutor.executeScript("arguments[0].click();",hotelMyCampMainaAnaSayfa.instgramResim3);
            Assert.assertTrue(hotelMyCampMainaAnaSayfa.instgramResim3.isEnabled());

            javascriptExecutor.executeScript("arguments[0].click();",hotelMyCampMainaAnaSayfa.instgramResim4);
            Assert.assertTrue(hotelMyCampMainaAnaSayfa.instgramResim4.isEnabled());

            Driver.closeDriver();


        }
        //10.Sayfanın en altındakı footer bolümü görünür mü bakılır ve
        // içerisindeki elementler tıklanıp tıklanmadığu kontrol edilir
        @Test
        public void instgramTesti2() {
            hotelMyCampMainaAnaSayfa=new HotelMyCampMainaAnaSayfa();
            hotelMyCampMainaAnaSayfa.anaSayfaUrl();
            Assert.assertTrue(hotelMyCampMainaAnaSayfa.footerBölümü.isDisplayed());

            JavascriptExecutor javascriptExecutor=(JavascriptExecutor) Driver.getDriver();
            javascriptExecutor.executeScript("arguments[0].click();",hotelMyCampMainaAnaSayfa.footerEmail);
            String actualUrl=Driver.getDriver().getCurrentUrl();
            String expectedUrl="https://www.hotelmycamp.com/#";
            Assert.assertEquals(actualUrl,expectedUrl);

            javascriptExecutor.executeScript("arguments[0].click();",hotelMyCampMainaAnaSayfa.footerPhone);
            String actualUrl1=Driver.getDriver().getCurrentUrl();
            String expectedUrl1="https://www.hotelmycamp.com/#";
            Assert.assertEquals(actualUrl1,expectedUrl1);

            javascriptExecutor.executeScript("arguments[0].click();",hotelMyCampMainaAnaSayfa.footerPrivacyAboutUs);
            String actualUrl2=Driver.getDriver().getCurrentUrl();
            String expectedUrl2="https://www.hotelmycamp.com/#";
            Assert.assertEquals(actualUrl2,expectedUrl2);

            javascriptExecutor.executeScript("arguments[0].click();",hotelMyCampMainaAnaSayfa.footerPrivacyCareer);
            String actualUrl3=Driver.getDriver().getCurrentUrl();
            String expectedUrl3="https://www.hotelmycamp.com/#";
            Assert.assertEquals(actualUrl3,expectedUrl3);

            javascriptExecutor.executeScript("arguments[0].click();",hotelMyCampMainaAnaSayfa.footerPrivacyContactUs);
            String actualUrl4=Driver.getDriver().getCurrentUrl();
            String expectedUrl4="https://www.hotelmycamp.com/#";
            Assert.assertEquals(actualUrl4,expectedUrl4);

            javascriptExecutor.executeScript("arguments[0].click();",hotelMyCampMainaAnaSayfa.footerPrivacyServices);
            String actualUrl5=Driver.getDriver().getCurrentUrl();
            String expectedUrl5="https://www.hotelmycamp.com/#";
            Assert.assertEquals(actualUrl5,expectedUrl5);
            Driver.closeDriver();







        }



    }
