/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

public class vehicle_availability {
    
    private String pu_day;
    private String pu_month;
    private String pu_year;
    private String drop_day;
    private String drop_month;
    private String drop_year;
   
    public vehicle_availability(String pu_day, String pu_month, String pu_year, String drop_day, String drop_month, String drop_year ) {
        this.pu_day = pu_day;
        this.pu_month = pu_month;
        this.pu_year = pu_year;
        this.drop_day = drop_day;
        this.drop_month = drop_month;
        this.drop_year = drop_year;
        
    }
    public vehicle_availability(){
    
    }
    public String getPu_day() {
        return pu_day;
    }
    public String getPu_month() {
        return pu_month;
    }
    public String getPu_year() {
        return pu_year;
    }
    public String getDrop_day() {
        return drop_day;
    }
    public String getDrop_month() {
        return drop_month;
    }
    public String getDrop_year() {
        return drop_year;
    }
    public void setPu_day(String pu_day) {
        this.pu_day = pu_day;
    }
    public void setPu_month(String pu_month) {
        this.pu_month = pu_month;
    }
    public void setPu_year(String pu_year) {
        this.pu_year = pu_year;
    }
    public void setDrop_day(String drop_day) {
        this.drop_day = drop_day;
    }
    public void setDrop_month(String drop_month) {
        this.drop_month = drop_month;
    }
    public void setDrop_year(String drop_year) {
        this.drop_year = drop_year;
    }

}
