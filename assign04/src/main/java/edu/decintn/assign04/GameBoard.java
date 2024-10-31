package edu.decintn.assign04;

public class GameBoard {
    public char fillChar;
    private char[][] charArray;
    public int arrayRow;
    public int arrayCol;

    public GameBoard(int rowCnt, int colCnt, char fillChar)
    {
        charArray = new char[rowCnt][colCnt];

        for(int row = 0; row < charArray.length; row++)
        {
            for(int col = 0; col < charArray[row].length; col++)
            {
                charArray[row][col] = fillChar;
                arrayCol = col;
            }
            arrayRow = row;
        }
        arrayRow = arrayRow + 1;
        arrayCol = arrayCol + 1;
        this.fillChar = fillChar;

    }

    public void clear()
    {
        for(int row = 0; row < charArray.length; row++)
        {
            for(int col = 0; col < charArray[row].length; col++)
            {
                charArray[row][col] = fillChar;
            }

        }
    }

    public int getRowCnt()
    {
        return arrayRow;
    }

    public int getColCnt()
    {
        return arrayCol;
    }

    public boolean isValidPosition(int row, int col)
    {
        if (row >= 0 && row < arrayRow && col >= 0 && col < arrayCol)
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    public char getPos(int row, int col)
    {
        if (row >= 0 && row < arrayRow && col >= 0 && col < arrayCol)
        {
            return charArray[row][col];
        }
        else
        {
            return ' ';
        }
    }

    public boolean setPos(int row, int col, char c)
    {
        if (row >= 0 && row < arrayRow && col >= 0 && col < arrayCol)
        {
            charArray[row][col] = c;
            return true;
        }
        else
        {
            return false;
        }
    }

    public String toString()
    {
        String gameBoard;

        gameBoard = arrayRow + " x " + arrayCol + " GameBoard (default: " + fillChar + ")";
        return gameBoard;
    }

    public String getBoardString()
    {
        StringBuilder sb = new StringBuilder();
        for(int row = 1; row <= charArray.length; row++)
        {
            for(int col = 1; col <= charArray[row].length; col++)
            {
                sb.append(charArray[row][col]);
            }
            sb.append("\n");

        }
        return sb.toString();

    }


}
