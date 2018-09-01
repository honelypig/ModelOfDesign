package com.zda;

import com.zda.color.Color;

public abstract class Shape {
	public Color color;
	
	public void setColor(Color color) {
		this.color = color;
	}
	public abstract void draw();
}
