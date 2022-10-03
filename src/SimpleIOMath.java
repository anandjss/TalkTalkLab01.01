import java.util.Scanner;

/**
 * Simple IO project using input and output and scanner and private methods and algorithms for prime numbers
 * @version 10.03.22
 * @author 24jayashankar
 */

public class SimpleIOMath {
    private String name;

    private int age;

    private int favNumber;


    /**
     *Asking the user for info
     */
    public void promptUser(){
        Scanner in = new Scanner(System.in);
        System.out.println("* Sit yourself down, take a seat *\n" + "* All you gotta do is repeat after me *");
        System.out.print("What is your name? ");
        name = in.nextLine();
        System.out.print("How old are you? ");
        age = in.nextInt();
        System.out.print("What is your favorite number? ");
        favNumber = in.nextInt();

    }




    /**
     *Re-printing the info the user supplied the program
     */
    public void printInfo(){
        System.out.println("I'm gonna teach you how to sing it out\n" +
                "Come on, come on, come on\n" +
                "Let me tell you what it's all about\n" +
                "Reading, writing, arithmetic\n" +
                "Are the branches of the learning tree");
        System.out.println("Your name is " + name);
        System.out.println("Your age is " + age);
        System.out.println("At your next birthday, you will turn " + (age+1) + ".");
        System.out.println("The first prime factor of " + (age+1) + " is " + smallestPrimeFactor(age+1));
        System.out.println("Your favorite number is " + favNumber);
        System.out.println("Your favorite number squared is " + (favNumber * favNumber));
        System.out.println("The square root of your favorite number is " + Math.sqrt(favNumber));
        System.out.println("* end of program *");
    }

    private boolean isPrime(int num)    {
        for(int i = 2; i <= Math.sqrt(num); i++)  {
            if(num % i ==0)
                return false;

        }
        return true;
    }

    private int smallestPrimeFactor(int num) {
        for(int i= 2; i <=Math.sqrt(num) +1; i++)  {
            if(isPrime(i))  {
                if(num % i == 0)
                    return i;

            }
        }
        return num;

    }

    /**
     * Main method for class SimpleIOMath
     * @param args command-line argument, if needed
     */
    public static void main(String[] args) {
        SimpleIOMath app = new SimpleIOMath();
        app.promptUser();
        app.printInfo();

    }

}
