package com.java9;


public class Main implements Square {
    public static void main(String[] args) {
        double number = 5.0;
        // Using default method to find square
        double square = new Main().findSquare(number);
        System.out.println("Square: " + square);

        // Using public method to display cube
        new Main().displaycube(number);

        // Using static method to display square root
        Square.displaySquareRoot(number);
    }
		
	}