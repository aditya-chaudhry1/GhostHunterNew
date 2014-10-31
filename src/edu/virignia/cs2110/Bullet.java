package edu.virignia.cs2110;

public abstract class Bullet 
{

	protected int xCoordinate;
	protected int yCoordinate;
	protected int direction;
	
	protected int range;
	protected int distanceTravlled;
	protected int velocity;
	
	protected int damage;
	
	protected boolean isVisible;
	
	public int getDamage()
	{
		return damage;
	}
	private void move()
	{
		
		if (distanceTravlled > range)
			isVisible = false;
		
		if (distanceTravlled < range && isVisible)
		{
			if (direction == 0)
				yCoordinate += velocity;
			
			else if (direction == 1)
				xCoordinate -= velocity;
			
			else if (direction == 2)
				yCoordinate -= velocity;
			
			else
				xCoordinate += velocity;
			
			distanceTravlled += velocity;
		} 

	}
	
	public boolean isThisBulletStillVisible()
	{
		return isVisible;
	}
	
	public abstract void animateBullet();
	
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub

	}

}
