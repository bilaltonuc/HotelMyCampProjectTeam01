package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.ConfigReader;
import utilities.Driver;

public class HotelListPages {

     public HotelListPages(){

        PageFactory.initElements(Driver.getDriver(),this);
    }




    // Hotel List WebElement Locator********************************************************************

    @FindBy(xpath = "//a[text()='Log in']")
    public WebElement anasayfaLogin;

    @FindBy(xpath = "//input[@id='UserName']")
    public WebElement usernameBox;

    @FindBy(xpath = "//input[@id='Password']")
    public WebElement passwordBox;

    @FindBy(xpath = "//input[@id='btnSubmit']")
    public WebElement loginButtonElementi;

    @FindBy(xpath = "//span[text()='Hotel Management']")
    public WebElement hotelManagementButtonElementi;


    @FindBy(xpath = "(//a[@href='/admin/HotelAdmin'])[1]")
    public WebElement hotelListButtonElementi;


    @FindBy(xpath = "/html/body/div[3]/div[1]/div/ul/li[3]/ul/li[2]/ul/li[1]")
    public WebElement hotelListYaziWebElementi;

    @FindBy(xpath = "//span[text()='List Of Hotels']")
    public WebElement hotelListYazisi;

    @FindBy(xpath = "(//tr[@class='odd'])[1]")
    public WebElement detailsButonu;

    @FindBy(xpath = "(//a[@class='btn btn-xs default'])[1]")
    public WebElement detailsHotelListButonu;

    @FindBy(xpath = "(//div[@class='caption'])[1]")
    public WebElement editHotelYazisi;

    @FindBy(xpath = "//div[@class='portlet-title'][1]")
    public WebElement hotelDataWebElementi;

    //@FindBy(xpath = "(//div[@class='col-md-10 value'])[1]")
    //public WebElement codeKutusuWebElementi;

    @FindBy(id= "Code")
    public WebElement codeKutusuWebElementi;

    @FindBy(id = "Name")
    public WebElement nameKutusuWebElementi;


    @FindBy(id = "Address")
    public WebElement addressKutusuWebElementi;

    @FindBy(id = "Phone")
    public WebElement phoneKutusuWebElementi;

    @FindBy(id = "Email")
    public WebElement emailKutusuWebElementi;


    @FindBy(id = "Email")
    public WebElement emailHotelListKutusuWebElementi;


    @FindBy(id = "IDGroup")
    public WebElement idGroupKutusuWebElementi;

    @FindBy(xpath = "(//button[@class='btn green'])[1]")
    public WebElement saveButonuWebElementi;

    @FindBy(xpath = "//button[text()='OK']")
    public WebElement alertOkayButonu;

    @FindBy(id = "btnDelete")
    public WebElement deleteButonuWebElementi;

    @FindBy(xpath = "//button[text()='Cancel']")
    public WebElement alertCancelButonuWebElementi;


    public void loginOl() {

        Driver.getDriver().get(ConfigReader.getProperty("HMCUrl"));
        anasayfaLogin.click();
        usernameBox.sendKeys(ConfigReader.getProperty("ValidUserName"));
        passwordBox.sendKeys(ConfigReader.getProperty("ValidPassword"));
        loginButtonElementi.click();

    }

    public void tearDown(){

        Driver.closeDriver();
    }
}
