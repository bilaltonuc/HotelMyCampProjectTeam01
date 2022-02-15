package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.ConfigReader;
import utilities.Driver;

public class HotelMyCampHotelList {


   public HotelMyCampHotelList() {
        PageFactory.initElements(Driver.getDriver(), this);
    }



    //              USER STORY 4 VE 5         //
    //              HOTEL LIST               //



    @FindBy(xpath = "(//a[@href='/admin/HotelAdmin'])[1]")
    public WebElement hotelListButtonElementi;


    @FindBy(xpath = "//span[text()='Add Hotel ']")
    public WebElement addHotelButtonElementi;


    @FindBy(xpath = "//input[@id='Code']")
    public WebElement addHotelCodeBoxElementi;


    @FindBy(xpath = "//input[@id='Name']")
    public WebElement addHotelNameBoxElementi;


    @FindBy(xpath = "//input[@id='Address']")
    public WebElement addHotelAddressBoxElementi;


    @FindBy(xpath = "//input[@id='Phone']")
    public WebElement addHotelPhoneBoxElementi;


    @FindBy(xpath = "//input[@id='Email']")
    public WebElement addHotelEmailBoxElementi;


    @FindBy(xpath = "//select[@id='IDGroup']")
    public WebElement addHotelIDGroupDropDownElementi;


    @FindBy(xpath = "//button[@id='btnSubmit']")
    public WebElement addHotelSaveButtonElementi;


    @FindBy(xpath = "//div[@class='bootbox modal fade bootbox-alert in']//div[@class='modal-body']")
    public WebElement addHotelAlertMesajiElementi;


    @FindBy(xpath = "//button[@class='btn btn-primary']")
    public WebElement addHotelAlertOkButtonElementi;


    @FindBy(xpath = "//button[text()='Search']")
    public WebElement addHotelSearchButtonElementi;


    @FindBy(xpath = "//input[@name='Code']")
    public WebElement addHotelCodeSearchBoxElementi;

    @FindBy(xpath = "//input[@name='Name']")
    public WebElement addHotelNameSearchBoxElementi;

    @FindBy(xpath = "//input[@name='Phone']")
    public WebElement addHotelPhoneSearchBoxElementi;



    @FindBy(xpath = "//a[text()='Details']")
    public WebElement addHotelIlkDetailsButtonElementi;

    @FindBy(xpath = "//div[@class='caption']")
    public WebElement addHotelCreateHotelYazisiElementi;


    @FindBy(xpath = "//select[@name='datatable_ajax_length']")
    public WebElement addHotelkayitSayisiDropDownElementi;


 // Hotel List WebElement Locator************************

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

 @FindBy(xpath = "//div[text()='Hotel was updated successfully']")
 public WebElement alertTexti;


 @FindBy(xpath = "//button[text()='OK']")
 public WebElement alertOkayButonu;

 @FindBy(id = "btnDelete")
 public WebElement deleteButonuWebElementi;

 @FindBy(xpath = "//button[text()='Cancel']")
 public WebElement alertCancelButonuWebElementi;

 @FindBy (xpath = "//div[text()='Would you like to continue?']")
 public WebElement deleteAlertYazisi;


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
