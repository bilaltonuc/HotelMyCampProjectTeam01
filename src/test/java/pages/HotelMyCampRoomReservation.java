package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class HotelMyCampRoomReservation {

    public HotelMyCampRoomReservation() {

        PageFactory.initElements(Driver.getDriver(), this);

    }

    //               USER STORY 8  9  VE  10         //
    //               Room Reservation               //


    // US_0009
    @FindBy(xpath = "//option[@value='-1']")
    public WebElement viewAllButtonFirst;

    @FindBy(xpath = "//tbody//tr")
    public List<WebElement> rawsList1;

    @FindBy(xpath = "//tbody//td")
    public List<WebElement> dataList1;

    @FindBy(xpath = "//div[contains(@class,'col-md-8 col-sm-12')]//button[contains(@class,'btn green')][normalize-space()='Save']")
    public WebElement saveButtonGeneralData;

    @FindBy(xpath = "//button[@onclick='javascript:AddBarcode();return false;']")
    public WebElement saveButtonProperty;

    @FindBy(xpath = "//option[@value='-1']")
    public WebElement viewAllButtonSecond;

    @FindBy(xpath = "//tbody//tr")
    public List<WebElement> rawsList2;

    @FindBy(xpath = "//tbody//td")
    public List<WebElement> dataList2;

    @FindBy(id = "btnDelete")  // //button[@id='btnDelete']
    public WebElement deleteButton;
}
