package pojo.ResponseClasses;

import pojo.CommonClasses.bookingIDS;

import java.util.List;

public class getbooksResponse {
    private List<bookingIDS> allbooks_ids;

    public List<bookingIDS> getallbooks_ids() {
        return allbooks_ids;
    }

    public void setallbooks_ids(List<bookingIDS> allbooks_ids) {
        this.allbooks_ids = allbooks_ids;
    }
}
