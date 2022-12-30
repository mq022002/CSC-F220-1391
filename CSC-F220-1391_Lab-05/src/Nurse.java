//********************************************************************
//  Nurse.java       Authors: Lewis/Loftus
//
//  Solution to Programming Project 9.2
//********************************************************************

public class Nurse extends HospitalEmployee
{
    protected int numPatients;

    //-----------------------------------------------------------------
    //  Sets up this nurse with the information specified.
    //-----------------------------------------------------------------
    public Nurse(String empName, int empNumber, int numPat)
    {
        super(empName, empNumber);
        numPatients = numPat;
    }

    //-----------------------------------------------------------------
    //  Sets the number of patients for this nurse.
    //-----------------------------------------------------------------
    public void setNumPatients(int pat)
    {
        numPatients = pat;
    }

    //-----------------------------------------------------------------
    //  Returns this nurse's current number of patients.
    //-----------------------------------------------------------------
    public int getNumPatients()
    {
        return numPatients;
    }

    //-----------------------------------------------------------------
    //  Returns a description of this nurse as a string.
    //-----------------------------------------------------------------
    public String toString()
    {
        return super.toString() + " has " + numPatients + " patients.";
    }

    //-----------------------------------------------------------------
    //  Prints a message appropriate for this nurse.
    //-----------------------------------------------------------------
    public void assist()
    {
        System.out.println(name + " is a nurse with " +
                numPatients + " patients.");
    }
}