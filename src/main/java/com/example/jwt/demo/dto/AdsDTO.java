package com.example.jwt.demo.dto;

public class AdsDTO {
    private String ad_category_name;
    private String ad_item_name;
    private String ad_item_condition;
    private String ad_title;
    private String ad_description;
    private String ad_city;
    private String ad_price;
    private String ad_image;
    private String ad_user_email;
    private String ad_user_unique_id;
    private String ad_user_contact_no;

    public AdsDTO() {
    }

    @Override
    public String toString() {
        return "AdsDTO{" + "\n" +
                "ad_category_name='" + getAd_category_name() + '\'' + "\n" +
                ", ad_item_name='" + getAd_item_name() + '\'' + "\n" +
                ", ad_item_condition='" + getAd_item_condition() + '\'' + "\n" +
                ", ad_title='" + getAd_title() + '\'' + "\n" +
                ", ad_description='" + getAd_description() + '\'' + "\n" +
                ", ad_city='" + getAd_city() + '\'' + "\n" +
                ", ad_price='" + getAd_price() + '\'' + "\n" +
                ", ad_image='" + getAd_image() + '\'' + "\n" +
                ", ad_user_email='" + getAd_user_email() + '\'' + "\n" +
                ", ad_user_unique_id='" + getAd_user_unique_id() + '\'' + "\n" +
                ", ad_user_contact_no='" + getAd_user_contact_no() + '\'' + "\n" +
                '}';
    }

    public String getAd_category_name() {
        return ad_category_name;
    }

    public void setAd_category_name(String ad_category_name) {
        this.ad_category_name = ad_category_name;
    }

    public String getAd_item_name() {
        return ad_item_name;
    }

    public void setAd_item_name(String ad_item_name) {
        this.ad_item_name = ad_item_name;
    }

    public String getAd_item_condition() {
        return ad_item_condition;
    }

    public void setAd_item_condition(String ad_item_condition) {
        this.ad_item_condition = ad_item_condition;
    }

    public String getAd_title() {
        return ad_title;
    }

    public void setAd_title(String ad_title) {
        this.ad_title = ad_title;
    }

    public String getAd_description() {
        return ad_description;
    }

    public void setAd_description(String ad_description) {
        this.ad_description = ad_description;
    }

    public String getAd_city() {
        return ad_city;
    }

    public void setAd_city(String ad_city) {
        this.ad_city = ad_city;
    }

    public String getAd_price() {
        return ad_price;
    }

    public void setAd_price(String ad_price) {
        this.ad_price = ad_price;
    }

    public String getAd_image() {
        return ad_image;
    }

    public void setAd_image(String ad_image) {
        this.ad_image = ad_image;
    }

    public String getAd_user_email() {
        return ad_user_email;
    }

    public void setAd_user_email(String ad_user_email) {
        this.ad_user_email = ad_user_email;
    }

    public String getAd_user_unique_id() {
        return ad_user_unique_id;
    }

    public void setAd_user_unique_id(String ad_user_unique_id) {
        this.ad_user_unique_id = ad_user_unique_id;
    }

    public String getAd_user_contact_no() {
        return ad_user_contact_no;
    }

    public void setAd_user_contact_no(String ad_user_contact_no) {
        this.ad_user_contact_no = ad_user_contact_no;
    }
}
