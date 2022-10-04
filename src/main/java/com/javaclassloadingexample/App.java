package com.javaclassloadingexample;

public class App {
    public static void main( String[] args ) {
    	for (;;) {
    		Class<?> myStaticClass = new Reloader().loadClass("com.javaclassloadingexample.MyStaticClass");
    		try {
    			Object obj = myStaticClass.newInstance();
    			System.out.println (obj.toString ());
    			Thread.sleep(2000);

    		} catch (Exception e1) {
    			e1.printStackTrace();
    		}
		  }    
	  }
}
