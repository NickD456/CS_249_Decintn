package edu.decintn.assign03;

public class GreetingCard {

    private static int maxWidth = 50;
    private String[] line;
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
        int size = line.length;

        for(int i = 0; i < size; i++)
        {
            sb.append(line[i]);
            sb.append("\n");
        }

        return sb.toString();
    }

    public void setBoundaryChar(char boundaryChar)
    {

        this.boundaryChar = boundaryChar;
    }

    public void setLines(String [] lines)
    {
        line = new String[lines.length];

        for (int i = 0; i < lines.length; i++)
        {
            line[i] = lines[i];
        }
    }

    public String generateBoundaryLine()
    {
        StringBuilder boundaryLine = new StringBuilder();

        for (int i = 0; i < maxWidth; i++)
        {
            boundaryLine.append(boundaryChar);

        }
        boundaryLine.append("\n");

        return boundaryLine.toString();

    }

    public String generateCenteredLine(String text)
    {
        if (!text.isEmpty())
        {
            text = " " + text + " ";
        }

        StringBuilder centeredLine = new StringBuilder();
        int totalPad = 50 - text.length();
        int halfPad = totalPad / 2;
        int secondPad = totalPad - halfPad;

        for (int i = 0; i < halfPad; i++)
        {
            centeredLine.append(boundaryChar);
        }
        centeredLine.append(text);
        for (int i = 0; i < secondPad; i++)
        {
            centeredLine.append(boundaryChar);
        }
        centeredLine.append("\n");

        return centeredLine.toString();

    }

    public String toString()
    {
        StringBuilder greeting = new StringBuilder();
        int totalLines = line.length;
        int lineCount;
        int extraLineCount;

        for (int i = 0; i < totalLines; i+= 5)
        {
            if(!greeting.isEmpty())
            {
                greeting.append("\n");
            }

            greeting.append(generateBoundaryLine());
            greeting.append(generateBoundaryLine());

            int linesLeft = totalLines - i;

            if (linesLeft < 5)
            {
                lineCount = linesLeft;
                extraLineCount = 5 - linesLeft;
            }
            else
            {
                lineCount = 5;
                extraLineCount = 0;
            }

            for (int j = 0; j <lineCount; j++)
            {
                greeting.append(generateCenteredLine(line[i+j]));
            }

            for (int j = 0; j < extraLineCount; j++ )
            {
                greeting.append((generateBoundaryLine()));
            }

            greeting.append(generateBoundaryLine());
            greeting.append(generateBoundaryLine());
        }
        return greeting.toString();

    }



}
