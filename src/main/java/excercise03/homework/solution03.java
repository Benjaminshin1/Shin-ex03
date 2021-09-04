/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Benjamin Shin
 */
package excercise03.homework;

import java.util.Scanner;
// ask user for an author and a quote from them
//print quotes around the promp that the user inputs
//scan in the user inputs
// system out author + "says" + prompt with quotes around it

public class solution03 {
    public static void main(String[] args) {
        System.out.println("What is the quote?:");
        Scanner quote = new Scanner(System.in);
        String str1 = "";
        str1+=quote.nextLine();


        System.out.println("Who said it?:");
        Scanner author = new Scanner(System.in);
        String str2 = "";
        str2+=author.nextLine();
        author.close();

        System.out.println(str2 + " says, " + "\"" + str1 + "\"");
    }
}
