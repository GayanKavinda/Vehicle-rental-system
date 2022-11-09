package model;

public class vehicle {

    private int vid;
    private String reg_no;
    private String category;
    private String make;
    private String model;
    private String year;
    private String color;
    private String mileage;
    private String monthly;

    public vehicle(String reg_no, String category, String make, String model, String year, String color, String mileage, String monthly) {
        this.reg_no = reg_no;
        this.category = category;
        this.make = make;
        this.model = model;
        this.year = year;
        this.color = color;
        this.mileage = mileage;
        this.monthly = monthly;
    }
    public vehicle() {

    }

    public int getVid() {
        return vid;
    }

    public void setVid(int vid) {
        this.vid = vid;
    }
    
    public void setMonthly(String monthly) {
        this.monthly = monthly;
    }

    public String getMonthly() {
        return monthly;
    }
   
    public void setReg_no(String reg_no) {
        this.reg_no = reg_no;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setMileage(String mileage) {
        this.mileage = mileage;
    }

    public String getReg_no() {
        return reg_no;
    }

    public String getCategory() {
        return category;
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public String getYear() {
        return year;
    }

    public String getColor() {
        return color;
    }

    public String getMileage() {
        return mileage;
    }

    public boolean isRegNoFilled() {

        if (!(reg_no.isEmpty())) {
            return true;
        } else {
            return false;
        }
    }

    public boolean isModelFilled() {

        if (!(model.isEmpty())) {
            return true;
        } else {
            return false;
        }
    }

    public boolean isMileageFilled() {

        if (!(mileage.isEmpty())) {
            return true;
        } else {
            return false;
        }
    }

    public boolean isCategoryFilled() {

        if (!(category.isEmpty())) {
            return true;
        } else {
            return false;
        }
    }
   
    public boolean isMonthlyFilled() {

        if (!(monthly.isEmpty())) {
            return true;
        } else {
            return false;
        }
    }

}
