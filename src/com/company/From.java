package com.company;

public class From {
    private int intParam;
    private String strParam;

    public From(int intParam, String strParam) {
        this.intParam = intParam;
        this.strParam = strParam;
    }

    public int getIntParam() {
        return intParam;
    }

    public String getStrParam() {
        return strParam;
    }
    @Override
    public String toString() {
        return "{" +
                "intParam=" + intParam +
                ", strParam='" + strParam + '\'' +
                '}';
    }
}
