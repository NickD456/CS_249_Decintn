package edu.decintn.assign02;

import java.util.Scanner;

public class Armada {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        SpaceVessel vessel = new SpaceVessel();

        System.out.println("Enter vessel name: ");
        String name = input.nextLine();

        System.out.println("Enter length and weight: ");
        String dataLine = input.nextLine();

        Scanner parseLine = new Scanner(dataLine);

        int lengthInFeet = parseLine.nextInt();
        int weightInPounds = parseLine.nextInt();

        vessel.setName(name);
        vessel.setLength(lengthInFeet);
        vessel.setWeight(weightInPounds);

        String vesselInfo = vessel.toString();

        System.out.println(vesselInfo);


    }
}
