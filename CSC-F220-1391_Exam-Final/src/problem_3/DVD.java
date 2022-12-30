package problem_3;

//********************************************************************
//  DVD.java       Author: Lewis/Loftus
//
//  Represents a DVD video disc.
//********************************************************************

import java.text.NumberFormat;
import java.util.Comparator;

public class DVD implements Comparable<DVD>{

	private String title, director;
	private int year;
	private double cost;
	private boolean bluRay;

	//-----------------------------------------------------------------
	// Implement a Comparator.
	//-----------------------------------------------------------------

	public static Comparator<DVD> COST_COMP = new Comparator<DVD>(){

		@Override
		public int compare(DVD o1, DVD o2) {
			return (int)(o2.cost - o1.cost);
		}
	};

	//-----------------------------------------------------------------
	// Creates a new DVD with the specified information.
	//-----------------------------------------------------------------

	public DVD(String title, String director, int year, double cost, boolean bluRay){

		this.title = title;
		this.director = director;
		this.year = year;
		this.cost = cost;
		this.bluRay = bluRay;
	}


	//-----------------------------------------------------------------
	// Returns a string description of this DVD.
	//-----------------------------------------------------------------

	public String toString(){

		NumberFormat fmt = NumberFormat.getCurrencyInstance();

		String description;
		description = fmt.format(cost) + "\t" + year + "\t";
		description += title + "\t" + director;

		if (bluRay)
			description += "\t" + "Blu-Ray";
		return description;
	}

	@Override
	public int compareTo(DVD o) {
		return this.title.compareTo(o.title);
	}
}