package tests.US_0006;

import org.testng.annotations.Test;
import pages.HotelMyCampHotelList;
import pages.HotelMyCampHotelRooms;
import pages.HotelMyCampMain;

public class TestCase02 {
    //https://www.hotelmycamp.com/admin/HotelRoomAdmin
    //Hotel Managenment tiklanir
    //Adresindeki 'Edit Hotelroom' yazisinin görünürlüğü kontrol edilmelidir
    HotelMyCampHotelList hotelList = new HotelMyCampHotelList();
    HotelMyCampMain hotelMyCamp = new HotelMyCampMain();
    HotelMyCampHotelRooms hotelMyCampHotelRooms=new HotelMyCampHotelRooms();
    @Test
    public void test1(){
        hotelMyCampHotelRooms.addHotelRoomButtonElementi.click();
        


    }
}
