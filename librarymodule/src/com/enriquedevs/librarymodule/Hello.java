package com.enriquedevs.librarymodule;

public class Hello implements HelloInterface {
	public static void doSomething() {
        System.out.println("Hello from library module!");
    }

	@Override
	public void sayHello() {
		System.out.println("Hello again from library module!");
	}
	
}
