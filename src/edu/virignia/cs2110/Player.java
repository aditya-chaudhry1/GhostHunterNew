package edu.virignia.cs2110;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;

public class Player extends Character 
{
	public Player(int health, int startX, int startY, int startVelocity, Context context, String bitMapFileLocation)
	{
		super(context);
		
		maxHealth = health;
		xCoordinate = startX;
		yCoordinate = startY;
		velocity = startVelocity;
		
		isEnemy = false;
//		
//		Bitmap bMap = BitmapFactory.decodeFile(R.drawable.googlelogo320x480);
//        setImageBitmap(bMap);
	}
	
	public void changeDirection(int newDirection)
	{
		currentDirection = newDirection;
		
	}
	
}
