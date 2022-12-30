import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Prob1 {

	public static void main(String[] args) throws IOException{
		Name[] names = new Name[3];

		@SuppressWarnings("resource")
		Scanner scan = new Scanner(new File("names.txt"));

		int count = 0;
		while(scan.hasNextLine()){
			names[count] = new Name(scan.next(), scan.next());
			count++;
		}

		for(Name n: names){
			System.out.println(n);
		}
	}
}