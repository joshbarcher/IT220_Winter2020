package shapes;

public class Square extends Rectangle
{
	//attributes?
	
	public Square(double side)
	{
		super(side, side);
	}

	public double area()
	{
		return this.getLength() * this.getWidth();
	}
	
	public String toString()
	{
		return super.toString() + " Square[]";
	}
}
