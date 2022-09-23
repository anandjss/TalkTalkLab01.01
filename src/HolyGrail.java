import java.util.Scanner;

/**
 * Simple IO project using scanner
 * @version 09.23.22
 * @author 24jayashankar
 */

public class HolyGrail {
    /**
     * Main method of class HolyGrail
     * @param args command line arguments, if needed
     */
    public static void main(String[] args) {
        //declaring local variable
        String name, quest, color;
        Scanner in = new Scanner(System.in);
        System.out.println("* A chat with the bridge keeper *\n" +
                "Who would cross the Bridge of Death must answer me these\n" +
                "questions three, ere the other side he see.");

        //getting user input
        System.out.print("What is your name? ");
        name = in.nextLine();
        System.out.print("What is your quest? ");
        quest = in.nextLine();
        System.out.print("What is your favorite color? ");
        color = in.nextLine();

        // King Arthur dialogue

        System.out.println("King Arthur says, \"You have to know these things when you're a\n" +
                "king, you know.\"");
        //summary of user input
        System.out.println("Your name is: " + name);
        System.out.println("Your quest is: " + quest);
        System.out.println("Your favorite color is: " + color);
        //end of program!!!
        System.out.println("* end of program *");
    }

}
