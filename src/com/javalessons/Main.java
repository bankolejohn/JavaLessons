package com.javalessons;

public class Main {
// demonstrate lifetime of a variable
    public static void main(String[] args) {
	int x;
	for(x = 0; x < 3; x++) {
	    int y = -1; // y is intialized each time block is entered
        System.out.println("y is " + y);
        y = 100;
        System.out.println("Y is now: " + y);
    }
    }
}
