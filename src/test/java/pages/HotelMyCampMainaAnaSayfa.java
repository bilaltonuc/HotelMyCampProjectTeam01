package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.ConfigReader;
import utilities.Driver;

public class HotelMyCampMainaAnaSayfa {

    public HotelMyCampMainaAnaSayfa() {

        PageFactory.initElements(Driver.getDriver(), this);

    }
    @FindBy(xpath = "//a[text()='Log in']")
    public WebElement anasayfaLogin;

    @FindBy(xpath = "//a[text()='Contact']")
    public  WebElement contactButton;

    @FindBy(xpath = "//a[text()='Blog']")
    public  WebElement blogButton;

    @FindBy(xpath = "//a[text()='About']")
    public  WebElement aboutButton;

    @FindBy(id="navRestaurant")
    public  WebElement restaurantButton;

    @FindBy(xpath = "(//a[@class='nav-link'])[2]")
    public  WebElement roomsButton;

    @FindBy(id="navHome")
    public WebElement homeButton;

    @FindBy(xpath = "//h1[@class='mb-4 bread']")
    public WebElement roomSayfaControl;

    @FindBy(xpath = "//h1[text()='OurRestaurant']")
    public  WebElement restaurantSayfaControl;

    @FindBy(xpath = "//h1[text()='Contact Form']")
    public  WebElement contactSayfaControl;

    @FindBy(xpath = "//h1[text()='Log in']")
    public  WebElement logInSayfaControl;

    @FindBy(xpath = "//input[@class='form-control checkin_date']")
    public WebElement checkİnDateButton;

    @FindBy(xpath = "//input[@class='form-control checkout_date']")
    public WebElement checkOutDateButton;

    @FindBy(xpath = "(//select[@class='form-control required'])[1]")
    public WebElement roomTypeButton;

    @FindBy(xpath = "(//select[@class='form-control required'])[2]")
    public WebElement customerButton;

    @FindBy(xpath = "//input[@type='submit']")
    public WebElement checkAvailabilityButton;

    @FindBy(xpath = "//div[@class='fields']")
    public WebElement updateControl;


    @FindBy(xpath =" //h2[text()='Welcome To Our Hotel']")
    public WebElement welcomeToOur;

    @FindBy(xpath = "(//a[@class='btn-custom'])[1]")
    public WebElement viewRoomDetails1;

    @FindBy(xpath = "//h1[@class='mb-4 bread']")
    public WebElement viewRoomDetailsKontrol1;


    @FindBy(xpath = "(//a[@class='btn-custom'])[2]")
    public WebElement viewRoomDetails2;

    @FindBy(xpath = "//h1[@class='mb-4 bread']")
    public WebElement viewRoomDetailsKontrol2;

    @FindBy(xpath = "(//a[@class='btn-custom'])[3]")
    public WebElement viewRoomDetails3;

    @FindBy(xpath = "//h1[@class='mb-4 bread']")
    public WebElement viewRoomDetailsKontrol3;

    @FindBy(xpath = "(//a[@class='btn-custom'])[4]")
    public WebElement viewRoomDetails4;

    @FindBy(xpath = "//h1[@class='mb-4 bread']")
    public WebElement viewRoomDetailsKontrol4;

    @FindBy(xpath = "(//a[@class='btn-custom'])[5]")
    public WebElement viewRoomDetails5;

    @FindBy(xpath = "//h1[@class='mb-4 bread']")
    public WebElement viewRoomDetailsKontrol5;

    @FindBy(xpath = "(//a[@class='btn-custom'])[6]")
    public WebElement viewRoomDetails6;

    @FindBy(xpath = "//h1[@class='mb-4 bread']")
    public WebElement viewRoomDetailsKontrol6;

    @FindBy(xpath = "(//div[@class='row justify-content-center'])[2]")
    public  WebElement sliderBolumu;

    @FindBy(xpath = "//section[@class='ftco-section testimony-section bg-light']")
    public WebElement sliderBölümüButton1;

    @FindBy(xpath = "//p[@class='name']")
    public WebElement sliderKontrol1;


    @FindBy(xpath = "(//button[@role='button'])[2]")
    public WebElement sliderBölümüButton2;

    @FindBy(xpath = "(//div[@class='user-img mb-4'])[5]")
    public WebElement sliderKontrol2;


    @FindBy(xpath = "(//button[@role='button'])[3]")
    public WebElement sliderBölümüButton3;

    @FindBy(xpath = "(//button[@role='button'])[4]")
    public WebElement sliderBölümüButton4;

    @FindBy(xpath = "(//button[@role='button'])[5]")
    public WebElement sliderBölümüButton5;

    @FindBy(xpath = "(//div[@class='row d-flex'])[2]")
    public WebElement recentBlog;

    @FindBy(xpath = "//a[text()='Even the all-powerful Pointing has no control about the blind texts 6']")
    public WebElement getRecentBlog1;

    @FindBy(xpath = "//a[text()='Even the all-powerful Pointing has no control about the blind texts 5']")
    public WebElement getRecentBlog2;

    @FindBy(xpath = "//a[text()='Even the all-powerful Pointing has no control about the blind texts 4']")
    public WebElement getRecentBlog3;

    @FindBy(xpath = "//a[text()='Even the all-powerful Pointing has no control about the blind texts 3']")
    public WebElement getRecentBlog4;


    @FindBy(xpath = "(//div[@class='icon d-flex justify-content-center'])[1]")
    public WebElement instgramResim1;

    @FindBy(xpath = "(//div[@class='icon d-flex justify-content-center'])[2]")
    public WebElement instgramResim2;

    @FindBy(xpath = "(//div[@class='icon d-flex justify-content-center'])[3]")
    public WebElement instgramResim3;

    @FindBy(xpath = "(//div[@class='icon d-flex justify-content-center'])[4]")
    public WebElement instgramResim4;

    @FindBy(xpath = "//img[@class='mfp-img']")
    public WebElement ınstgramResimControl;



    @FindBy(xpath = "//footer[@class='ftco-footer ftco-bg-dark ftco-section']")
    public WebElement footerBölümü;

    @FindBy(xpath = "(//a[@class='py-2 d-block'])[1]")
    public WebElement footerUsefulLinksBlog;

    @FindBy(xpath = "(//a[@class='py-2 d-block'])[2]")
    public WebElement footerUsefulLinksRooms;

    @FindBy(xpath = "(//a[@class='py-2 d-block'])[3]")
    public WebElement footerUsefulLinksAmenitiesTest;

    @FindBy(xpath = "(//a[@class='py-2 d-block'])[4]")
    public WebElement footerUsefulLinksGiftCard;

    @FindBy(xpath = "(//a[@class='py-2 d-block'])[5]")
    public WebElement footerPrivacyCareer;

    @FindBy(xpath = "(//a[@class='py-2 d-block'])[6]")
    public WebElement footerPrivacyAboutUs;

    @FindBy(xpath = "(//a[@class='py-2 d-block'])[7]")
    public WebElement     footerPrivacyContactUs;

    @FindBy(xpath = "(//a[@class='py-2 d-block'])[8]")
    public WebElement footerPrivacyServices;

    @FindBy(xpath = "//span[text()='302 718 2180']")
    public WebElement footerPhone;

    @FindBy(xpath = "//span[text()='info@hotelmycamp.com']")
    public WebElement footerEmail;






    public void anaSayfaUrl() {

        Driver.getDriver().get(ConfigReader.getProperty("HMCUrl"));
    }





























}
