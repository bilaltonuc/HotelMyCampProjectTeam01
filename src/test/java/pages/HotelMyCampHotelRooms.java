package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class HotelMyCampHotelRooms {

   public HotelMyCampHotelRooms() {

        PageFactory.initElements(Driver.getDriver(), this);

    }
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

    @FindBy(xpath = "(//a[@class='btn btn-xs default'])[1]")
    public WebElement detailsButonu;

    @FindBy(xpath = "//a[text()='General Data']")
    public WebElement generalDataElementi;

    @FindBy(xpath = "//a[text()='Photos']")
    public WebElement photosElementi;

    @FindBy(xpath = "//a[text()='Properties']")
    public WebElement propertiesElementi;

    @FindBy(xpath = "//select[@id='IDHotel']")
    public WebElement hotelDropDownElementi;

    @FindBy(xpath = "(//button[@class='btn green'])[1]")
    public WebElement saveButonuWebElementi;

    @FindBy(id = "btnDelete")
    public WebElement deleteButonuWebElementi;

    @FindBy(xpath = "//button[text()='Cancel']")
    public WebElement alertCancelButonuWebElementi;

    @FindBy(xpath = "//input[@id='Code']")
    public WebElement codeElementi;

    @FindBy(xpath = "//input[@id='Name']")
    public WebElement nameElementi;

    @FindBy(xpath = "//input[@id='Locations']")
    public WebElement locationElementi;

    @FindBy(xpath = "//input[@id='Price']")
    public WebElement priceElementi;

     @FindBy(xpath = "//input[@id='MaxAdultCount']")
     public WebElement maxAdultCountElementi;

     @FindBy(xpath = "//input[@id='MaxChildCount']")
     public WebElement maxChildCountElementi;

     @FindBy(xpath = "//input[@id='IsAvailable']")
      public WebElement isAvailableElementi;

         @FindBy(xpath = "//a[.='200 ']")
     public WebElement price200Elementi;
     @FindBy(xpath = "//a[.='300 ']")
     public WebElement price300Elementi;
     @FindBy(xpath = "//a[.='500 ']")
     public WebElement price500Elementi;
     @FindBy(xpath = "//a[.='400 ']")
     public WebElement price400Elementi;
     @FindBy(xpath = "//a[.='600 ']")
     public WebElement price600Elementi;
     @FindBy(xpath = "//a[.='700 ']")
     public WebElement price700Elementi;
     @FindBy(xpath = "//textarea[@class='cke_source cke_reset cke_enable_context_menu cke_editable cke_editable_themed cke_contents_ltr']")
     public WebElement descriptionElementi;
     @FindBy(xpath = "//select[@id='IDGroupRoomType']")
     public WebElement roomTypeDropDownElementi;
     @FindBy(xpath = "//a[@id='tab_images_uploader_pickfiles']")
     public WebElement selectPhotoElementi;
     @FindBy(xpath = "//a[@id='tab_images_uploader_uploadfiles']")
     public WebElement uploadPhotoElementi;

     @FindBy(xpath = "//select[@id='IkpBarcodeTypes']")
      public WebElement tipDropDownElementi;

      @FindBy(xpath = "//input[@id='txtBarcode']")
      public WebElement codePropertiesElementi;

      @FindBy(xpath = "//textarea[@id='txtBarcode']")
      public  WebElement valuePropertiesElementi;



}
