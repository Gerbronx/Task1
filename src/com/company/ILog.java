package com.company;

public interface ILog {

     void error(String tag,String message);

     void warning(String tag,String message);

     void debug(String tag,String message);

     void info(String tag,String message);

     void Verbose(String tag,String message);


}
