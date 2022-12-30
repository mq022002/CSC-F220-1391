package problem_3;

//********************************************************************
//Movies.java Author: Lewis/Loftus
//
//Demonstrates the use of an array of objects.
//********************************************************************

public class Movies{

	//-----------------------------------------------------------------
	// Creates a DVDCollection object and adds some DVDs to it. Prints
	// reports on the status of the collection.
	//-----------------------------------------------------------------

	public static void main(String[] args){

		DVDCollection movies = new DVDCollection();

		movies.addDVD("Kimetsu No Yaiba: Mugen Train", "Haruo Sotozaki", 2021, 18.99, true);
		movies.addDVD("A Silent Voice: The Movie", "Naoko Yamada", 2017, 22.99, true);
		movies.addDVD("The Shawshank Redemption", "Frank Darabont", 1994, 9.99, true);
		movies.addDVD("Miracle in Cell No.7", "Lee Hwan-kyung", 2013, 22.95, false);
		movies.addDVD("The Green Mile", "Frank Darabont", 1999, 5.99, true);

		System.out.println(movies);

		movies.sortByCost();
		System.out.println(movies);
	}
}