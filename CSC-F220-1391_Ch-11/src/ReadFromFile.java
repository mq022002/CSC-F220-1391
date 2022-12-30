import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class ReadFromFile {

	public static void main(String[] args) throws IOException{
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(new File("test.txt"));

		while(scan.hasNextLine())
			System.out.println(scan.nextLine());
	}
}
