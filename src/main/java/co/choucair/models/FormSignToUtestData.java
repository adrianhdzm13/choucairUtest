package co.choucair.models;

import co.choucair.utils.BaseConfig;

public class FormSignToUtestData extends BaseConfig {

    private String firstName;
    private String lastName;
    private String email;
    private String month;
    private String day;
    private String year;


    public FormSignToUtestData(String firstName, String lastName, String email, String month, String day, String year) {
        super(FormSignToUtestData.class);
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.month = month;
        this.day = day;
        this.year = year;
        BaseConfig.log.info("User information setup ["+this.getClass().getName()+"]");
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getEmail() {
        return email;
    }

    public String getMonth() {
        return month;
    }

    public String getDay() {
        return day;
    }

    public String getYear() {
        return year;
    }


    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setMonth(String month) {
        this.month = month;
    }

    public void setDay(String day) {
        this.day = day;
    }

    public void setYear(String year) {
        this.year = year;
    }

}
