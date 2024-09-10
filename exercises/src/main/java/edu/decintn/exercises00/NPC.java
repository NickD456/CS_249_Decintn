package edu.decintn.exercises00;

public class NPC {
    public final double PI = 3.14;
    private int health = 100;
    private String name = "";

    public int getHealth()
    {
        return health;
    }

    public void setHealth(int h)
    {
        if(h >= 0 && h <= 100)
        {
            health = h;
        }

        else
        {
            System.err.println("error health cannot be < 0");
        }
    }
}
