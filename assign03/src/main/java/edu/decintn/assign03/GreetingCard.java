package edu.decintn.assign03;

public class GreetingCard {

    private String[] otherLines;
    private String[] lines;
    private char boundaryChar;

    public GreetingCard(String [] lines, char boundaryChar)
    {
        setLines(lines);
        setBoundaryChar(boundaryChar);

    }
    public char getBoundaryChar()
    {
        return boundaryChar;
    }

    public String getLines()
    {
        StringBuilder sb = new StringBuilder();
        int size = lines.length;

        for(int i = 0; i < size; i++)
        {
            sb.append(lines[i]);
            sb.append("/n");
        }

        return sb.toString();
    }

    public void setBoundaryChar(char boundaryChar)
    {
        this.boundaryChar = boundaryChar;
    }

    public void setLines(String [] lines)
    {


    }

    public String generateBoundaryLine()
    {

    }

    public String generateCenteredLine(String text)
    {

    }

    public String toString()
    {

    }



}
