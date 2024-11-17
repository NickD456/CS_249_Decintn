package edu.decintn.assign04;

public class Box {
    private int startingRow;
    private int startingCol;
    private int endingRow;
    private int endingCol;
    private boolean isFilled;
    private char drawChar;


    public Box(int sr, int sc, int er, int ec, boolean filled, char drawChar)
    {
        startingRow = sr;
        startingCol = sc;
        endingRow = er;
        endingCol = ec;
        isFilled = filled;
        this.drawChar = drawChar;
    }

    public String toString()
    {
        if (isFilled)
        {
            return "Filled Box from (" + startingRow + "," + startingCol + ") to (" + endingRow + "," + endingCol + ") with char '" + drawChar + "'";
        }
        else
        {
            return "Box from (" + startingRow + "," + startingCol + ") to (" + endingRow + "," + endingCol + ") with char '" + drawChar + "'";
        }
    }

    public void draw(GameBoard s)
    {
        for (int row = startingRow; row <= endingRow; row++)
        {
            for (int col = startingCol; col <= endingCol; col++)
            {
                if (isFilled)
                {

                    s.setPos(row, col, drawChar);
                }
                else
                {
                    // Outline the box
                    if (row == startingRow || row == endingRow || col == startingCol || col == endingCol)
                    {
                        s.setPos(row, col, drawChar);

                    }
                }
            }
        }
    }
}
