package Model;

import java.util.Date;

public class Booking {

    private String title;
    private String customer_name;
    private String customer_surname;
    private String customer_email;
    private String customer_mobile;
    private String customer_houseNo;
    private String customer_street;
    private String customer_city;
    private String customer_postcode;
    private String customer_num_of_persons;
    private String roomtype;
    private Date check_in;
    private Date check_out;

    public Booking(String title, String customer_name, String customer_surname, String customer_email, String customer_mobile, String customer_houseNo, String customer_street, String customer_city, String customer_postcode, String customer_num_of_persons, String roomtype, Date check_in, Date check_out) {
        this.title = title;
        this.customer_name = customer_name;
        this.customer_surname = customer_surname;
        this.customer_email = customer_email;
        this.customer_mobile = customer_mobile;
        this.customer_houseNo = customer_houseNo;
        this.customer_street = customer_street;
        this.customer_city = customer_city;
        this.customer_postcode = customer_postcode;
        this.customer_num_of_persons = customer_num_of_persons;
        this.roomtype = roomtype;
        this.check_in = check_in;
        this.check_out = check_out;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCustomer_name() {
        return customer_name;
    }

    public void setCustomer_name(String customer_name) {
        this.customer_name = customer_name;
    }

    public String getCustomer_surname() {
        return customer_surname;
    }

    public void setCustomer_surname(String customer_surname) {
        this.customer_surname = customer_surname;
    }

    public String getCustomer_email() {
        return customer_email;
    }

    public void setCustomer_email(String customer_email) {
        this.customer_email = customer_email;
    }

    public String getCustomer_mobile() {
        return customer_mobile;
    }

    public void setCustomer_mobile(String customer_mobile) {
        this.customer_mobile = customer_mobile;
    }

    public String getCustomer_houseNo() {
        return customer_houseNo;
    }

    public void setCustomer_houseNo(String customer_houseNo) {
        this.customer_houseNo = customer_houseNo;
    }

    public String getCustomer_street() {
        return customer_street;
    }

    public void setCustomer_street(String customer_street) {
        this.customer_street = customer_street;
    }

    public String getCustomer_city() {
        return customer_city;
    }

    public void setCustomer_city(String customer_city) {
        this.customer_city = customer_city;
    }

    public String getCustomer_postcode() {
        return customer_postcode;
    }

    public void setCustomer_postcode(String customer_postcode) {
        this.customer_postcode = customer_postcode;
    }

    public String getCustomer_num_of_persons() {
        return customer_num_of_persons;
    }

    public void setCustomer_num_of_persons(String customer_num_of_persons) {
        this.customer_num_of_persons = customer_num_of_persons;
    }

    public String getRoomtype() {
        return roomtype;
    }

    public void setRoomtype(String roomtype) {
        this.roomtype = roomtype;
    }

    public Date getCheck_in() {
        return check_in;
    }

    public void setCheck_in(Date check_in) {
        this.check_in = check_in;
    }

    public Date getCheck_out() {
        return check_out;
    }

    public void setCheck_out(Date check_out) {
        this.check_out = check_out;
    }
}
