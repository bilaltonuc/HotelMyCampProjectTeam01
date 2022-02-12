package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.ConfigReader;
import utilities.Driver;



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


    //Create User Register Form Web Element Locator *******************************************************

    @FindBy(xpath = "//input[@id='UserName']")
    public WebElement createUserRegisterFormUserNameBoxElementi;

    @FindBy(xpath = "//input[@id='txtPassword']")
    public WebElement createUserRegisterFormPasswordBoxElementi;

    @FindBy(xpath = "//input[@id='Email']")
    public WebElement createUserRegisterFormEmailBoxElementi;

    @FindBy(xpath = "//input[@id='NameSurname']")
    public WebElement createUserRegisterFormNameBoxElementi;

    @FindBy(xpath = "//input[@id='PhoneNo']")
    public WebElement createUserRegisterFormTelNoElementi;

    @FindBy(xpath = "//input[@id='SSN']")
    public WebElement createUserRegisterFormSocialSecurityBoxElementi;

    @FindBy(xpath = "//input[@id='DrivingLicense']")
    public WebElement createUserRegisterFormDriverLicenseBoxElementi;

    @FindBy(xpath = "//select[@id='IDCountry']")
    public WebElement createUserRegisterFormCountryDropDownElementi;

    @FindBy(xpath = "//select[@id='IDState']")
    public WebElement createUserRegisterFormStateDropDownElementi;

    @FindBy(xpath = "//input[@id='Address']")
    public WebElement createUserRegisterFormAddressBoxElementi;

    @FindBy(xpath = "//input[@id='BirthDate']")
    public WebElement createUserRegisterFormBirthDayBoxElementi;

    @FindBy(xpath = "//input[@id='WorkingSector']")
    public WebElement createUserRegisterFormWorkingSectorBoxElementi;

    @FindBy(xpath = "//select[@id='IDRole']")
    public WebElement createUserRegisterFormRoleDropDownElementi;

    @FindBy(xpath = "(//div[@class='radio'])[1]")
    public WebElement createUserRegisterFormApprovedRadioButtonYes;

    @FindBy(xpath = "(//div[@class='radio'])[2]")
    public WebElement createUserRegisterFormApprovedRadioButtonNo;

    @FindBy(xpath = "//button[@id='btnSubmit']")
    public WebElement createUserRegisterFormSaveButtonElementi;

//********************************************************************************************************//







public void loginOl(){

    Driver.getDriver().get(ConfigReader.getProperty("HMCUrl"));
    anasayfaLogin.click();
    usernameBox.sendKeys(ConfigReader.getProperty("ValidUserName"));
    passwordBox.sendKeys(ConfigReader.getProperty("ValidPassword"));
    loginButtonElementi.click();


}

    public void bekle(int saniye){
        try {
            Thread.sleep(saniye*1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }




















}
