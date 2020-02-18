package com.vanguardswift.vanguardapp;

public class ResponseA {
    public String Q1_age = "";
    public String Q2_gender = "";
    public String Q3_schoolYears;
    public String Q4a_familySizeMen;
    public String Q4b_familySizeWomen;
    public String Q4c_familySizeChildren;
    public String Q5_yearsFarming;

    public ResponseA() {

    }

    public ResponseA(String q1_age, String q2_gender, String q3_schoolYears, String q4a_familySizeMen, String q4b_familySizeWomen, String q4c_familySizeChildren, String q5_yearsFarming) {
        Q1_age = q1_age;
        Q2_gender = q2_gender;
        Q3_schoolYears = q3_schoolYears;
        Q4a_familySizeMen = q4a_familySizeMen;
        Q4b_familySizeWomen = q4b_familySizeWomen;
        Q4c_familySizeChildren = q4c_familySizeChildren;
        Q5_yearsFarming = q5_yearsFarming;
    }
}
