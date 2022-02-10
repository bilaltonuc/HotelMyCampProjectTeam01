package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.ConfigReader;
import utilities.Driver;

import java.time.Duration;

public class HotelMyCampMain {

    public HotelMyCampMain() {

        PageFactory.initElements(Driver.getDriver(), this);

    }


    @FindBy(xpath = "//a[text()='Log in']")
    public WebElement anasayfaLogin;

    @FindBy(xpath = "//input[@id='UserName']")
    public WebElement usernameBox;

    @FindBy(xpath = "//input[@id='Password']")
    public WebElement passwordBox;

    @FindBy(xpath = "//input[@id='btnSubmit']")
    public WebElement loginButtonElementi;

    @FindBy(xpath = "//span[text()='Create a new account']")
    public WebElement createNewAccountButtonElementi;

    @FindBy(xpath = "//span[text()='System Management']")
    public WebElement systemManagementButtonElementi;

    @FindBy(xpath = "//span[text()='User Management']")
    public WebElement userManagementButtonElementi;

    @FindBy(xpath = "(//ul[@class='sub-menu'])[2]")
    public WebElement userListButtonElementi;

    @FindBy(xpath = "//span[text()='Hotel Management']")
    public WebElement hotelManagementButtonElementi;

    @FindBy(xpath = "//span[text()='Add User ']")
    public WebElement addUserButtonElementi;

    @FindBy(xpath = "(//a[@href='/admin/HotelAdmin'])[1]")
    public WebElement hotelListButtonElementi;

    @FindBy(xpath = "//a[@href='/admin/HotelRoomAdmin']")
    public WebElement hotelRoomsButtonElementi;

    @FindBy(xpath = "//a[@href='/admin/RoomReservationAdmin']")
    public WebElement roomReservationButtonElementi;

    @FindBy(xpath = "//span[text()='Add Hotel ']")
    public WebElement addHotelButtonElementi;


    @FindBy(xpath = "//span[text()='Add Hotelroom ']")
    public WebElement addHotelRoomButtonElementi;

    @FindBy(xpath = "//span[text()='Add Room Reservation ']")
    public WebElement addRoomReservationButtonElementi;

    @FindBy(xpath = "//input[@id='Email']")
    public WebElement registerFormEmailBoxElementi;

    @FindBy(xpath = "//input[@id='NameSurname']")
    public WebElement registerFormNameBoxElementi;

    @FindBy(xpath = "//input[@id='PhoneNo']")
    public WebElement registerFormTelNoElementi;

    @FindBy(xpath = "//input[@id='SSN']")
    public WebElement registerFormSocialSecurityBoxElementi;

    @FindBy(xpath = "//input[@id='DrivingLicense']")
    public WebElement registerFormDriverLicenseBoxElementi;

    @FindBy(xpath = "//select[@id='IDCountry']")
    public WebElement registerFormCountryDropDownElementi;








public void loginOl(){

    Driver.getDriver().get(ConfigReader.getProperty("HMCUrl"));
    anasayfaLogin.click();
    usernameBox.sendKeys(ConfigReader.getProperty("ValidUserName"));
    passwordBox.sendKeys(ConfigReader.getProperty("ValidPassword"));
    loginButtonElementi.click();


}





















}
