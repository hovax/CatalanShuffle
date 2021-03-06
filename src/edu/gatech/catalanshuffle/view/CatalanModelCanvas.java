package edu.gatech.catalanshuffle.view;

import javafx.scene.canvas.Canvas;

public abstract class CatalanModelCanvas extends Canvas {
	
	public CatalanModelCanvas(int n, double width, double height) {
		super(width, height);
	}
	
	public void setWeightedLambda(double weightedLambda) {}
	public void setAdjToggle() {};

	public abstract void tick();
	public abstract void reset();
	
}
