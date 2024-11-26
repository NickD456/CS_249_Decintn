package edu.decintn.assign06;

import edu.decintn.assign04.GameBoard;

public class Rat extends Creature {

    public Rat()
    {

    }

    public Rat(int row, int col)
    {
        super(row, col);
    }

    public String toString()
    {
        return "Rat at " + getRow() + "," + getCol();
    }
    @Override
    public void draw(GameBoard map)
    {
        map.setPos(getRow(), getCol(), 'R');
    }
}
