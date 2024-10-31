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

        String[] allLines = new String[lineCount];
        System.out.println("Enter lines:");

        for(int i=0; i<lineCount; i++)
        {
            allLines[i] = input.nextLine();
        }

        return new GreetingCard(allLines,bound);
    }

    public static void main(String [] args)
    {
        Scanner input = new Scanner(System.in);
        GreetingCard n = generateCard(input);
        System.out.println("For any occasion:");
        System.out.println(n);
    }


}
