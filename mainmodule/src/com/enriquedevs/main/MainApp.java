package com.enriquedevs.main;

import com.enriquedevs.librarymodule.Hello;
import com.enriquedevs.librarymodule.HelloInterface;

public class MainApp {
	public static void main(String[] args) {
        Hello.doSomething();
        
        HelloInterface helloInterface = new Hello();
        helloInterface.sayHello();
    }
}
