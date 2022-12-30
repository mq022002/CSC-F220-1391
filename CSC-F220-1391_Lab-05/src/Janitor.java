//********************************************************************
//  Janitor.java       Authors: Lewis/Loftus
//
//  Solution to Programming Project 9.2
//********************************************************************

public class Janitor extends Administrator
{
    protected boolean sweeping;

    //-----------------------------------------------------------------
    //  Sets up this janitor with the specified information.
    //-----------------------------------------------------------------
    public Janitor(String empName, int empNumber, String dept, boolean sw)
    {
        super(empName, empNumber, dept);
        sweeping = sw;
    }

    //-----------------------------------------------------------------
    //  Sets the sweeping status of this janitor.
    //-----------------------------------------------------------------
    public void setIsSweeping(boolean isS)
    {
        sweeping = isS;
    }

    //-----------------------------------------------------------------
    //  Returns the current sweeping status of this janitor.
    //-----------------------------------------------------------------
    public boolean getIsSweeping()
    {
        return sweeping;
    }

    //-----------------------------------------------------------------
    //  Returns a description of this janitor as a string.
    //-----------------------------------------------------------------
    public String toString()
    {
        return super.toString() + "\tSweeping: " + sweeping;
    }

    //-----------------------------------------------------------------
    //  Prints a message appropriate for this janitor.
    //-----------------------------------------------------------------
    public void sweep()
    {
        System.out.print(name + " is");
        if (!sweeping)
            System.out.print(" not");
        System.out.println(" sweeping the floor.");
    }
}