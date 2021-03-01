package com.company;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import static java.lang.System.*;

public class ConsoleLog<dateFormat> {


    public static final String ANSI_BLACK = "\u001B[30m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_RESET = "\u001B[0m";
    //public static DateFormat dateFormat;


    //Constructor
    public ConsoleLog(){

    }

    //dateFormat =  new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
    //Date date = new Date();

    public static void e(String tag,String message){
         System.out.println(ANSI_RED  + "(E) " + tag + ": " + message + ANSI_RESET);
    }

    public static void w(String tag,String message){
        System.out.println("(W) " + tag + ": " + message);
    }

    public static void d(String tag, String message){
        System.out.println(ANSI_BLUE + "(D) " + tag + ": " + message + ANSI_RESET);
    }

    public static void i(String tag,String message){
        System.out.println(ANSI_BLACK + "(I) " + tag + ": " + message + ANSI_RESET);
    }

    public static void v(String tag,String message){
        System.out.println(ANSI_BLACK + "(V) " + tag + ": " + message + ANSI_RESET);
    }


}
