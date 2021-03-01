package com.company;



public class Log extends ConsoleLog implements ILog {

    public static final String ANSI_BLACK = "\u001B[30m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_RESET = "\u001B[0m";

   public Log(){
       super();
   }

   @Override
    public void error(String tag,String message){
       System.out.println(ANSI_RED + "(E) " + tag + ": " + message + ANSI_RESET);
   }

   @Override
    public void warning(String tag,String message){
       System.out.println("(W) " + tag + ": " + message);
   }

   @Override
    public void debug(String tag,String message){
       System.out.println(ANSI_BLUE + "(D) " + tag + ": " + message + ANSI_RESET);
   }

   @Override
    public void info(String tag,String message){
       System.out.println(ANSI_BLACK + "(I) " + tag + ": " + message + ANSI_RESET);
   }

   @Override
    public void Verbose(String tag,String message){
       System.out.println(ANSI_BLACK + "(V) " + tag + ": " + message + ANSI_BLACK);
   }





}
