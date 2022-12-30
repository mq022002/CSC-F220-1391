import java.util.Random;

import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;

public class Lab1 {

	public static void main(String[] args) {
		System.out.println(average(3, 5));
		System.out.println(average(2,4,7));
		System.out.println(average(1,6,8,9));
		System.out.println(multiConcat("hi", 4));
		System.out.println(multiConcat("test"));
	}

//Ex7.1
	public static double average(int num1, int num2)
	{
		return (num1 + num2)/2.0;
	}

//Ex7.2
	public static double average(int num1, int num2, int num3)
	{
		return (num1 + num2+ num3)/3.0;
	}

//Ex7.3
	public static double average(int num1, int num2, int num3, int num4)
	{
		return (num1 + num2+ num3+ num4)/4.0;
	}

//Ex7.4
	public static String multiConcat(String str, int count)
	{
		String result = str;

		if (count > 2)
			for(int i=2; i<=count; i++)
				result += str;
		return result;
	}

//Ex7.5
	public static String multiConcat(String str)
	{
		String result = str;
				result += str;
		return result;
	}

//Ex7.6
	public static Circle makeCircle(int x, int y, int radius, Color color)
	{
		Circle circle = new Circle(x, y, radius);
		circle.setFill(color);
		return circle;
	}

//Ex7.7

		public static Circle makeCircle(int x, int y, int radius)
		{
			Circle circle = new Circle(x, y, radius);
			circle.setFill(Color.RED);
			return circle;
		}

//Ex7.8

		public static Circle makeCirlcle(int x, int y, Color color)
		{
			Random gen = new Random();
			int radius = gen.nextInt(11) + 10; //random number between 10 to 20
			Circle circle = new Circle(x, y, radius);
			circle.setFill(color);
			return circle;
		}

//Ex7.9

		public static Circle makeCirlcle(int x, int y)
		{
			Circle circle = new Circle(x, y, 40);
			circle.setFill(Color.GREEN);
			return circle;
		}
}
