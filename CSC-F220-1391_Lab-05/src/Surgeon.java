//********************************************************************
//  Surgeon.java       Authors: Lewis/Loftus
//
//  Solution to Programming Project 9.2
//********************************************************************

public class Surgeon extends Doctor
{
    protected boolean operating;

    //-----------------------------------------------------------------
    //  Sets up this surgeon with the specified information.
    //-----------------------------------------------------------------
    public Surgeon(String empName, int empNumber,
            String special, boolean isOper)
    {
        super(empName, empNumber, special);
        operating = isOper;
    }

    //-----------------------------------------------------------------
    //  Sets the operating status of this surgeon.
    //-----------------------------------------------------------------
    public void setIsOperating(boolean isOper)
    {
        operating = isOper;
    }

    //-----------------------------------------------------------------
    //  Gets the current operating status of this surgeon.
    //-----------------------------------------------------------------
    public boolean getIsOperating()
    {
        return operating;
    }

    //-----------------------------------------------------------------
    //  Returns a description of this surgeon as a string.
    //-----------------------------------------------------------------
    public String toString()
    {
        return super.toString() + "\tOperating: " + operating;
    }

    //-----------------------------------------------------------------
    //  Prints a message appropriate for this surgeon.
    //-----------------------------------------------------------------
    public void operate()
    {
        System.out.print(name + " is");
        if (!operating)
            System.out.print(" not");
        System.out.println(" operating now.");
    }
}