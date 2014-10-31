package edu.virignia.cs2110;

import android.content.Context;

public class Ghost extends Character 
{
	public Ghost(int health, int startX, int startY, int startVelocity, Context context)
	{
		super(context);
		maxHealth = health;
		xCoordinate = startX;
		yCoordinate = startY;
		velocity = startVelocity;

		isEnemy = false;
	}
	
}
