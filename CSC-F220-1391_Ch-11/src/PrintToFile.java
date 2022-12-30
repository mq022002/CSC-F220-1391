import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;

public class PrintToFile {

	public static void main(String[] args) throws IOException{

		PrintWriter outFile = new PrintWriter("test.txt");

		Random gen = new Random();

		for(int row = 1; row <= 10; row++){
			for(int col = 1; col <= 10; col++)
				outFile.print(gen.nextInt(90) + 10 + "\t");
			outFile.println();
		}

		outFile.close();
		System.out.println("Done");
	}
}
