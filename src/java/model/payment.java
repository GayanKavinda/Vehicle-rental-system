/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Prasad Chathuranga
 */
public class payment {

    public int getPid() {
        return pid;
    }

    public void setPid(int pid) {
        this.pid = pid;
    }

    private int pid;
    private String customer_name;
    private String amount;
    private String payment_type;
    private String discount;

    public payment(String customer_name, String amount, String payment_type, String discount) {

        this.customer_name = customer_name;
        this.amount = amount;
        this.payment_type = payment_type;
        this.discount = discount;
    }

    public payment() {

    }

    public String getCustomer_name() {
        return customer_name;
    }

    public void setCustomer_name(String customer_name) {
        this.customer_name = customer_name;
    }

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    public String getPayment_type() {
        return payment_type;
    }

    public void setPayment_type(String payment_type) {
        this.payment_type = payment_type;
    }

    public String getDiscount() {
        return discount;
    }

    public void setDiscount(String discount) {
        this.discount = discount;
    }

    //6 line
    public boolean isNameFilled() {

        if (!(customer_name.isEmpty())) {
            return true;
        } else {
            return false;
        }
    }
    
     public boolean isAmountFilled() {

        if (!(amount.isEmpty()) ) {
            return true;
        } else {
            return false;
        }
    }

}
