package creatingfiles;
import java.util.*;

public class CreatingFiles {

	public static void main(String[] args) {

		@SuppressWarnings("unused")
		final Formatter x;

		try{
			x = new Formatter("CreatingFiles.txt");
			System.out.println("You created a file.");
		}
		catch(Exception e){
			System.out.println("Error encountered.");
		}
	}
}