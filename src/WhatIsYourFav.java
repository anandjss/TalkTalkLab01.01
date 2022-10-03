import java.util.Scanner;
/**
 * This is a simple ask-a-question class. Nothing other than main.
 * @author 24jayashankar
 * @version 09.13.22
 */
public class WhatIsYourFav {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("What is your favorite movie? ");
        String movie = in.nextLine();
        System.out.println(movie + "is terrible! I hate that. ");
        System.out.println("JK!! I love " + movie + " too. ");
    }
}
