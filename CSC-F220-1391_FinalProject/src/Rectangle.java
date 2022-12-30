
public class Rectangle {

	public double x;
	public double y;

	public double width;
	public double height;

	public Rectangle(double x, double y, double width, double height){
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
	}

	public boolean overlaps(Rectangle other){
		// 4 Cases: 								//
		// Rectangle1 LEFT OF Rectangle 2 OR... 	//
		// Rectangle1 RIGHT OF Rectangle 2 OR... 	//
		// Rectangle1 ABOVE Rectangle 2 OR... 		//
		// Rectangle1 BELOW Rectangle 2 			//
		boolean noOverlap =
				this.x + this.width < other.x ||
				other.x + other.width < this.x ||
				this.y + this.height < other.y ||
				other.y + other.height < this.y;

		return !noOverlap;
	}
}