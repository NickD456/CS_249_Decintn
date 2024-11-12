package edu.decintn.assign05;

import java.util.ArrayList;

public class Woods {
    private ArrayList<Giant> giants = new ArrayList<>();

    public Giant createGiant(String name, String typeName)
    {
        if (name.isEmpty())
        {
            return null;
        }

        return switch (typeName.toUpperCase()) {
            case "GIANT" -> new Giant(name);
            case "TROLL" -> new Troll(name);
            case "TREE" -> new Tree(name);
            case "ENT" -> new Ent(name);
            case "HUORN" -> new Huorn(name);
            default -> null;
        };
    }

    public boolean addGiant(String name, String typeName)
    {
        Giant giant = createGiant(name, typeName);

        if (giant != null)
        {
            giants.add(giant);
            return true;
        }
        else
        {
            return false;
        }
    }

    public Giant getGiant(int index)
    {
        if (index >= 0 && index < giants.size())
        {
            return giants.get(index);
        }
        else
        {
            return null;
        }
    }

    public void printAllGiants()
    {
        System.out.println("ALL GIANTS:");
        for (int i = 0; i < giants.size(); i++)
        {
            System.out.println("- " + giants.get(i).toString());
        }
    }

    public void printAllTrees()
    {
        System.out.println("ALL TREES:");

        for (int i = 0; i < giants.size(); i++)
        {
            Giant giant = giants.get(i);

            if (giant instanceof Tree tree)
            {
                System.out.println("- " + tree.toString() + ": " + tree.speak());
            }
        }
    }

    public void printAllTrolls()
    {
        System.out.println("ALL TROLLS:");

        for (int i = 0; i < giants.size(); i++)
        {
            Giant giant = giants.get(i);

            if (giant instanceof Troll troll)
            {
                System.out.println("- " + troll.toString() + ": " + troll.cook());
            }
        }
    }


}
