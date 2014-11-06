package edu.virignia.cs2110;


import android.app.ActionBar.LayoutParams;
import android.app.Activity;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Point;
import android.os.Bundle;
import android.util.Log;
import android.view.Display;
import android.view.View;
import android.widget.Button;
import android.widget.GridLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;



public class Popup extends Activity {
	
	
	Player mainCharacter;
	GridLayout gl;
	LinearLayout l2;
	
	// Override the onCreate method
	@Override
	protected void onCreate(Bundle savedInstanceState) {
	 //d=debug message.   format: tag + message
		super.onCreate(savedInstanceState);
		 mainCharacter = new Player(100, 5, 5, 1, this, "@drawable/guy.bmp"); //entire pop up takes CircleView
		//this- the savedInstanceState passed into onCreate method
		
		// For dynamic display (added)
		//ChangeCircles changer = new ChangeCircles(); // new class
		
		//setContentView(R.layout.popup);
			Log.d("2110", "Do we get here 1?");

		
		//setContentView(mainCharacter); //set the ContentView to be the circle view
		Log.d("2110", "Do we get here 2?");

		
		Button button = new Button(this);//(Button) findViewById(R.id.button1);
		
		
		Log.d("2110", "Do we get here 3?");

        button.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v) 
            {
            	
            	doStuff();
//
//            	MoveGuy up = new MoveGuy(); // new class
//    			
//
//    			
//    			up.execute(mainCharacter);
//    			
//    			
//    	    	Log.d("2110", "We oughta be moving"); //d=debug message.   format: tag + message
            }
        });
        
        
		Log.d("2110", "Do we get here 5?");
		
		
	    // Creating a new RelativeLayout
		// creating LinearLayout
        //LinearLayout linLayout = new LinearLayout(this);
        // specifying vertical orientation
      //  linLayout.setOrientation(LinearLayout.VERTICAL);
        // creating LayoutParams  
        //LinearLayout.LayoutParams linLayoutParam = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.MATCH_PARENT); 
        // set LinearLayout as a root element of the screen 
       // setContentView(linLayout, linLayoutParam);
       // setContentView(linLayout);
        // Defining the RelativeLayout layout parameters.
        // In this case I want to fill its parent
//        RelativeLayout.LayoutParams rlp = new RelativeLayout.LayoutParams(
//                RelativeLayout.LayoutParams.FILL_PARENT,
//                RelativeLayout.LayoutParams.FILL_PARENT);

		Log.d("2110", "Do we get here 6?");

		gl = new GridLayout(this);
		gl.setColumnCount(10);
		gl.setRowCount(10);
		
		setContentView(gl);
		
//		gl.setLayoutParams(new LayoutParams
//				(LayoutParams.MATCH_PARENT, LayoutParams.MATCH_PARENT));

		Display display = getWindowManager().getDefaultDisplay();
		Point size = new Point();
		display.getSize(size);
		int width = size.x;
		int height = size.y;
		Log.d("2110", width + "\t" + height);

		for(int row = 0; row < 10; row ++)
			for(int col = 0; col < 10; col ++)
			{
				ImageView box = new ImageView(this);
				box.setImageResource(R.drawable.box);
				LinearLayout l = new LinearLayout(this);
				LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(width/10, height/10);
				box.setLayoutParams(layoutParams);
				l.addView(box);
				Log.d("2110", "Do we get here 7?");

				GridLayout.LayoutParams p = new GridLayout.LayoutParams (GridLayout.spec(row), GridLayout.spec(col));
				
				gl.addView(l);
			
			}
		
		
		GridLayout.LayoutParams glp = new GridLayout.LayoutParams (GridLayout.spec(0), GridLayout.spec(1));
		
		Log.d("2110", "Do we get here 8?");

		//GridLayout.LayoutParams glp = new GridLayout.LayoutParams (GridLayout.LayoutParams.WRAP_CONTENT, GridLayout.LayoutParams.WRAP_CONTENT);
		LinearLayout l1 = new LinearLayout(this);
		LinearLayout.LayoutParams lp1 = new LinearLayout.LayoutParams(width/10, height/10);
		button.setLayoutParams(lp1);
		l1.addView(button);

		
		gl.addView(l1, glp);
		
		Button button2 = new Button(this);
//		
		l2 = new LinearLayout(this);
		LinearLayout.LayoutParams lp2 = new LinearLayout.LayoutParams(width/10, height/10);
		mainCharacter.setLayoutParams(lp2);
		l2.addView(mainCharacter);
		
		GridLayout.LayoutParams glp2 = new GridLayout.LayoutParams (GridLayout.spec(mainCharacter.getyCoordinate()), GridLayout.spec(mainCharacter.getxCoordinate()));
		gl.addView(l2, glp2);
		Log.d("2110", "Do we get here 8?");
	
	//	LinearLayout.LayoutParams lpView = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.WRAP_CONTENT, LinearLayout.LayoutParams.WRAP_CONTENT);
//	        
//	        ImageView iv = new ImageView(this);
//	        Bitmap bMap = BitmapFactory.decodeFile("@drwable/guy.bmp");
//	        iv.setImageBitmap(bMap);	        
//	        iv.setLayoutParams(lpView);
	     //   linLayout.addView(button);
	        
	       // setContentView(mainCharacter);
	       // Button btn = new Button(this);
	      //  button.setText("Button");
	       // linLayout.addView(button, lpView);
		
        // Defining the layout parameters of the TextView
//		RelativeLayout.LayoutParams lp = new RelativeLayout.LayoutParams(RelativeLayout.LayoutParams.MATCH_PARENT, RelativeLayout.LayoutParams.WRAP_CONTENT);
//        
//       // lp.addRule(RelativeLayout.ALIGN_PARENT_TOP);
//        addView(mainCharacter, lp);
//
//        
//        RelativeLayout.LayoutParams lp2 = new RelativeLayout.LayoutParams(
//                RelativeLayout.LayoutParams.WRAP_CONTENT,
//                RelativeLayout.LayoutParams.WRAP_CONTENT);
//        
//       // lp2.addRule(RelativeLayout.BELOW);
//        addView(button, lp2);
        
//        
//		Log.d("2110", "Do we get here 7?");
//
//		button.setLayoutParams(lp);
//		
//		
//       // lp.addRule(RelativeLayout.CENTER_IN_PARENT);
//
//		Log.d("2110", "Do we get here 8?");
//
//        // Adding the TextView to the RelativeLayout as a child
//    
//        relativeLayout.addView(button);
//		Log.d("2110", "Do we get here 10?");
//		
//		//relativeLayout.addView(mainCharacter);
//
//
//        // Setting the RelativeLayout as our content view
//        setContentView(mainCharacter, rlp);
//		Log.d("2110", "Do we get here 11?");
//
//		// For dynamic display (added) 
//		//changer.execute(circle); //goes after setContentView
	}
	
	public void doStuff()
	{
		//MoveGuy up = new MoveGuy(); // new class
		
    	Log.d("2110", "1"); //d=debug message.   format: tag + message

		
		//up.execute(mainCharacter);
		mainCharacter.move();
		GridLayout.LayoutParams glp = new GridLayout.LayoutParams (GridLayout.spec(mainCharacter.getyCoordinate()), GridLayout.spec(mainCharacter.getxCoordinate()));
		Log.d("2110", mainCharacter.getxCoordinate() + "\t" + mainCharacter.getyCoordinate());
		
    	Log.d("2110", "2"); //d=debug message.   format: tag + message
    	
		gl.removeView(l2);
    	Log.d("2110", "3"); //d=debug message.   format: tag + message

		gl.addView(l2, glp);
		
		//setContentView(gl);
    	Log.d("2110", "We oughta be moving"); //d=debug message.   format: tag + message
	}
	
	 
}
