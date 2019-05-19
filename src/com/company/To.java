package com.company;

public class To {
    private int intParam;
    private String strParam;

    public void setIntParam(int intParam) {
        this.intParam = intParam;
    }

    public void setStrParam(String strParam) {
        this.strParam = strParam;
    }

    @Override
    public String toString() {
        return "{" +
                "intParam=" + intParam +
                ", strParam='" + strParam + '\'' +
                '}';
    }
}
