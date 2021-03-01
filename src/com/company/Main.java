package com.company;



public class Main{

    public static void main(String[] args) {
	// write your code here
        System.out.println("\n");
     Log.e("TAG","missatge estàtic de tipus error");
     Log.w("TAG","missatge estàtic de tipus warning");
     Log.d("TAG","missatge estàtic de tipus debug");
     Log.i("TAG","missatge estàtic de tipus info");
     Log.v("TAG","missatge estàtic de tipus verbose");

     System.out.println("\n");
     Log log = new Log();
     log.error("TAG","missatge mitjançant Log instanciat de tipus error");
     log.warning("TAG","missatge mitjançant Log instanciat de tipus warning");
     log.debug("TAG","missatge mitjançant Log instanciat de tipus debug");
     log.info("TAG","missatge mitjançant Log instanciat de tipus info");
     log.Verbose("TAG","missatge mitjançant Log instanciat de tipus verbose");
    }
}
