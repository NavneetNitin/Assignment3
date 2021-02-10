package com.Shape;

public class Square implements Polygon {
	float side;
	

	public Square(float side) {
		super();
		this.side = side;
	}


	public void calcArea()
	{
		System.out.println("Area of Square is "+ side*side);
	}

	
	public void calcPeri() 
	{
	System.out.println("Perimeter of Square is "+4*side);
	}

}
