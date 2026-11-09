package pojo.CommonClasses;

public class bookingRequest {
    private String firstname;
    private String lastname;
    private  int totalprice;
    private boolean depositpaid;
    private bookingdatess bookingdates;
    private String additionalneeds;

    public String getfirstname() {
        return firstname;
    }

    public void setfirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getlastname() {
        return lastname;
    }

    public void setlastname(String lastname) {
        this.lastname = lastname;
    }

    public int gettotalprice() {
        return totalprice;
    }

    public void settotalprice(int totalprice) {
        this.totalprice = totalprice;
    }

    public boolean isdepositpaid() {
        return depositpaid;
    }

    public void setdepositpaid(boolean depositpaid) {
        this.depositpaid = depositpaid;
    }

    public String getadditionalneeds() {
        return additionalneeds;
    }

    public void setadditionalneeds(String additionalneeds) {
        this.additionalneeds = additionalneeds;
    }

    public bookingdatess getbookingdates() {
        return bookingdates;
    }

    public void setbookingdates(bookingdatess bookingdates) {
        this.bookingdates = bookingdates;
    }
}
