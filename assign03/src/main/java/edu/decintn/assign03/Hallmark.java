package edu.decintn.assign03;

import java.util.Scanner;

public class Hallmark {

    public static GreetingCard generateCard(Scanner input)
    {
        System.out.println("Enter boundary character:");
        char bound = input.next().charAt(0);

        input.nextLine();

        System.out.println("Enter number of lines:");
        String intString = input.nextLine();
        int lineCount = Integer.parseInt(intString);

    }

    public static void main(String [] args)
    {

    }


}
