package shapes;

import interfaces.IShapeWithArea;

public class TestShapes
{
	public static void main(String[] args)
	{
		//create a few shapes
		Rectangle rect = new Rectangle(10, 20);
		Square square = new Square(30);
		RightTriangle triangle = new RightTriangle(1, 4);
		Point point = new Point(1, 2);
		
		//this is called up-casting
		Shape shape = square;
		printMe(shape);
		printMe(triangle);
		printMe("hello, world");
		printMe(new Object());

		//group together shapes based on an ancestor class
		Shape[] shapes = {rect, square, triangle};
		//Shape shape = new Shape("Rhombus");

		//group together shapes based on an interface
		IShapeWithArea[] shapesWithAreas = {rect, square, triangle};

		for (int i = 0; i < shapesWithAreas.length; i++)
		{
			printMe(shapesWithAreas[i]);
			System.out.println("Area: " + shapesWithAreas[i].area());
		}

		square.printArea();
	}

	public static void printMe(Object thing)
	{
		System.out.println(thing.toString());
	}
}



