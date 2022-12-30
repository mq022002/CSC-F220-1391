package problem_1;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class People{

	public static void main(String[] args) throws IOException {
		Person[] names = new Person[10];

		Scanner scan = new Scanner(new File("names.txt"));

		int count = 0;

		while(scan.hasNextLine()){
			names[count] = new Person(scan.next(), scan.next(), scan.nextInt());
			count++;
		}

		scan.close();

		for(Person n: names)
			System.out.println(n);
	}
}