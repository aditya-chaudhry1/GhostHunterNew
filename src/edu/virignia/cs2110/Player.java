package edu.virignia.cs2110;

import android.content.Context;

public class Player extends Character 
{
	public Player(int health, int startX, int startY, int startVelocity, Context context)
	{
		super(context);
		
		maxHealth = health;
		xCoordinate = startX;
		yCoordinate = startY;
		velocity = startVelocity;
		
		isEnemy = false;
	}
	
	public void changeDirection(int newDirection)
	{
		currentDirection = newDirection;
		
	}
	
}
