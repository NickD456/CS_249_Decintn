package edu.decintn.assign06;

import edu.decintn.assign04.GameBoard;

import java.util.*;
import java.io.*;

public class GameState implements Loadable {

    private ArrayList<Loadable> loadables = new ArrayList<>();
    private GameBoard baseMap = new GameBoard(12, 30, '.');

    public Loadable createLoadable(String typeName) throws GameFileException
    {
        switch (typeName)
        {
            case "Skeleton":
                return new Skeleton();
            case "Rat":
                return new Rat();
            case "Item":
                return new Item();
            case "Tome":
                return new Tome();
            default:
                throw new GameFileException("Unknown type: " + typeName);
        }
    }

    @Override
    public void load(Scanner input) throws GameFileException
    {
        loadables.clear();
        baseMap.clear();
        int lines = input.nextInt();

        for (int i = 0; i < lines; i++)
        {
            String typeName = input.next();
            Loadable m = createLoadable(typeName);
            m.load(input);
            loadables.add(m);

            if (m instanceof Drawable drawable)
            {
                drawable.draw(baseMap);
            }
        }
    }

    public String toString()
    {
        StringBuilder sb = new StringBuilder();
        sb.append("MAP:\n");
        sb.append(baseMap.getBoardString());
        sb.append("\nCREATURES:\n");

        for (Loadable l : loadables)
        {
            if (l instanceof Creature c)
            {
                sb.append("* ");
                sb.append(c);
                sb.append("\n");
            }
        }

        sb.append("INVENTORY:\n");

        for (Loadable l : loadables)
        {
            if (l instanceof Item i)
            {
                sb.append("* ");
                sb.append(i);
                sb.append("\n");
            }


        }
        return sb.toString();
    }

    public void save(String filename) throws GameFileException
    {
        try(PrintWriter writer = new PrintWriter(filename);)
        {
            writer.print(this.toString());
        }
        catch (Exception e)
        {
            throw new GameFileException("Failed to save file!", e);
        }
    }
}

