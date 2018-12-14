package com.qa.Assessment;

public class Compass 
{
	int trXPosition;
	int trYPosition;
	private int xDistance;
	private int yDistance;
	
	Compass(){}
	
	Compass (int treasureXPosition, int treasureYPosition)
	{

		if(treasureXPosition < 4)
		{
			this.trXPosition = (-treasureXPosition) -3; 
		}
		else
		{
			this.trXPosition = treasureXPosition;
		}
		if(treasureYPosition < 4)
		{
			this.trYPosition = (-treasureYPosition) -3; 
		}
		else
		{
			this.trYPosition = treasureYPosition;
		}
	}
	
	public void distanceAway(int playerXPosition, int playerYPosition)
	{
		xDistance = Math.abs(trXPosition) - Math.abs(playerXPosition);
		yDistance = Math.abs(trYPosition) - Math.abs(playerYPosition);
		System.out.println("You are " + xDistance + "m away and " + yDistance +" m away");
	}

	public int getTrXPosition() {
		return trXPosition;
	}

	public void setTrXPosition(int trXPosition) {
		this.trXPosition = trXPosition;
	}

	public int getTrYPosition() {
		return trYPosition;
	}

	public void setTrYPosition(int trYPosition) {
		this.trYPosition = trYPosition;
	}

	public int getxDistance() {
		return xDistance;
	}

	public void setxDistance(int xDistance) {
		this.xDistance = xDistance;
	}

	public int getyDistance() {
		return yDistance;
	}

	public void setyDistance(int yDistance) {
		this.yDistance = yDistance;
	}

}
