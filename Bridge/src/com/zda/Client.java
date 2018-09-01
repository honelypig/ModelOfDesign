package com.zda;

import com.zda.color.Color;
import com.zda.color.GrayImplColor;
import com.zda.color.WhiteImplColor;
import com.zda.shape.RectangleExtendsShape;
import com.zda.shape.SquareExtendsShape;

public class Client {

	public static void main(String[] args) {
		Color color=new WhiteImplColor();
		Shape rectangle=new RectangleExtendsShape();
		rectangle.setColor(color);
		rectangle.draw();
		
		Shape square=new SquareExtendsShape();
		square.setColor(new GrayImplColor());
		square.draw();
	}

}
