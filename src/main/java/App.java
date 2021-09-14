/*
 *  UCF COP3330 Fall 2021 Assignment 9 Solution
 *  Copyright 2021 Josh Boada
 */

import java.util.Scanner;


public class App {
    public static void main(String[] args) {
        Scanner Length = new Scanner(System.in);
        System.out.println("Enter length: ");
        String Lengthnum = Length.nextLine();

        Scanner Width = new Scanner(System.in);
        System.out.println("Enter width: ");
        String Widthnum = Width.nextLine();

        int length = Integer.parseInt(Lengthnum);
        int width = Integer.parseInt(Widthnum);
        int area = length * width;
        double coverage = 350;
        int gallon = (int)Math.ceil(area / coverage);

        System.out.println("You will need to purchase " + gallon + " gallon of paint to cover " + area + " square feet");

    }
}