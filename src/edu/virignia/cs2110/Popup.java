package edu.virignia.cs2110;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;

public class Popup extends Activity {
	
	// Override the onCreate method
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		Player circle = new Player(100, 100, 100, 1, this); //entire pop up takes CircleView
		//this- the savedInstanceState passed into onCreate method
		
		// For dynamic display (added)
		//ChangeCircles changer = new ChangeCircles(); // new class
		
		setContentView(circle); //set the ContentView to be the circle view
		
		// For dynamic display (added) 
		//changer.execute(circle); //goes after setContentView
	}
}
