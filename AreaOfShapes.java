
package com.test;
import com.Shape.*;

public class AreaOfShapes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Square sq=new Square(6);
		sq.calcArea();
		sq.calcPeri();
		
		Rectangle rec =new Rectangle(10, 20);
		rec.calcArea();
		rec.calcPeri();
	}

}
