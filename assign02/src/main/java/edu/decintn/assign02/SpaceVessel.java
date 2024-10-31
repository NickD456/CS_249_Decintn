package edu.decintn.assign02;

public class SpaceVessel {
    private String vesselName = "";
    private int length = 0;
    private int weight = 0;

    public String getName()
    {
        return vesselName;
    }

    public int getLength()
    {
        return length;
    }

    public int getWeight()
    {
        return weight;
    }

    public void setName(String name)
    {
        vesselName = name;
    }

    public void setLength(int feet)
    {
        length = feet;
    }

    public void setWeight(int pounds)
    {
        weight = pounds;
    }

    public String getLengthString()
    {
        double meters;
        String vesselLength;
        meters = 0.3048*length;

        vesselLength = length + " ft. (" + String.format("%.2f", meters) + " m)";
        return vesselLength;
    }

    public String getWeightString()
    {
        double kilograms;
        String vesselWeight;
        kilograms = 0.4536*weight;

        vesselWeight = weight + " lbs. (" + String.format("%.2f", kilograms) + " kg)";
        return  vesselWeight;
    }

    public String toString()
    {
        String vesselInfo;

        vesselInfo = "NAME: " + vesselName + "\n" + "LENGTH: " + getLengthString() + "\n" + "WEIGHT: " + getWeightString() + "\n";

        return vesselInfo;
    }

}

