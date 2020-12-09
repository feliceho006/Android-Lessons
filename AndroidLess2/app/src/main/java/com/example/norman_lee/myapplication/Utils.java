package com.example.norman_lee.myapplication;

public class Utils {

    static void checkInvalidInputs(String value, String Input){
        if(value.contains("-") || value.equals("0")){
            throw new IllegalArgumentException(String.format("Not Positive Input %s: ", Input) + value);
        }
        if(value.isEmpty()){
            throw new NumberFormatException(String.format("Empty Input %s", Input));
        }
    }
}
