package com.lzy.spring;

/**
 * @ Author     ：lzy
 * @ Date       ：Created in  2019/5/6 16:42
 * @ Description：
 */
public class HelloWord {

    private String massage;

    public String getMassage() {
        return massage;
    }

    public void setMassage(String massage) {
        this.massage = massage;
    }

    public void printMassage(){
        System.out.println("Your massage:"+massage);
    }
}
