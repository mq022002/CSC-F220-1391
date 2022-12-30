//********************************************************************
//  Administrator.java       Authors: Lewis/Loftus
//
//  Solution to Programming Project 9.2
//********************************************************************

public class Administrator extends HospitalEmployee
{
    protected String department;

    //-----------------------------------------------------------------
    //  Sets up this administrator with the specified information.
    //-----------------------------------------------------------------
    public Administrator(String empName, int empNumber, String dept)
    {
        super(empName, empNumber);
        department = dept;
    }

    //-----------------------------------------------------------------
    //  Sets this administrator's department.
    //-----------------------------------------------------------------
    public void setDepartment(String dept)
    {
        department = dept;
    }

    //-----------------------------------------------------------------
    //  Returns this administrator's department.
    //-----------------------------------------------------------------
    public String getDepartment()
    {
        return department;
    }

    //-----------------------------------------------------------------
    //  Returns a description of this administrator as a string.
    //-----------------------------------------------------------------
    public String toString()
    {
        return super.toString() + " works in " + department;
    }

    //-----------------------------------------------------------------
    // Prints a message appropriate for this administrator.
    //-----------------------------------------------------------------
    public void administrate()
    {
        System.out.println(name + " works in the " +
                department + " department.");
    }
}