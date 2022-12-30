
public class TwoD {

	public static void main(String[] args) {
		int[][] table = new int[5][10];
		for(int r=0; r<table.length; r++)
			for(int c=0; c<table[r].length; c++)
				table[r][c] = r*10+c;

		for(int r=0; r<table.length; r++){
			for(int c=0; c<table[r].length; c++)
				System.out.println(table[r][c] + "\t");
			System.out.println();
		}
	}
}
