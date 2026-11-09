package pojo.ResponseClasses;

import pojo.CommonClasses.bookingRequest;

public class createbookingResponse {
    private int bookingid;
    private bookingRequest booking;

    public int getbookingid() {
        return bookingid;
    }

    public void setbookingid(int bookingid) {
        this.bookingid = bookingid;
    }

    public bookingRequest getbooking() {
        return booking;
    }

    public void setbooking(bookingRequest booking) {
        this.booking = booking;
    }
}
