package com.qa.Assessment;

import java.util.Scanner;

public class Person 
{
	private String name;
	private String movement;
	private int xPosition = 0;
	private int yPosition = 0;
	private Scanner sc = new Scanner(System.in);
	private boolean foundTreasure;
	private Compass cp = new Compass();
	private Treasure tr = new Treasure();
	private int random;
	
	Person(){}
	
	Person(String movment, Compass cp, Treasure tr)
	{
		System.out.println("Enter your Player name");
		this.name = sc.next();
		this.movement = movment;
		this.cp = cp;
		this.tr = tr;
	}
	
	public void action(String action)
	{
		checking(xPosition, yPosition, tr);
		if(!foundTreasure) 
		{
			if(action.equals("n") || action.equals("N") || action.equals("North") || action.equals("north"))
			{
				yPosition += 1;
				cp.distanceAway(xPosition, yPosition);
				System.out.println("You have moved North");
			}
			else if(action.equals("e") || action.equals("E") || action.equals("East") || action.equals("east"))
			{
				xPosition += 1;
				cp.distanceAway(xPosition, yPosition);
				System.out.println("You have moved East");
			}
			else if(action.equals("s") || action.equals("S") || action.equals("South") || action.equals("south"))
			{
				yPosition -= 1;
				cp.distanceAway(xPosition, yPosition);
				System.out.println("You have moved South");
			}
			else if(action.equals("w") || action.equals("w") || action.equals("West") || action.equals("west"))
			{
				xPosition -= 1;
				cp.distanceAway(xPosition, yPosition);
				System.out.println("You have moved West");
			}
	/*		else if(movment.equals("A") || movment.equals("a") || movment.equals("Action") || movment.equals("action"))
			{
				System.out.println("");
			}*/
			else
			{
				System.out.println("That is not a valid option");
			}	
			checking(xPosition, yPosition, tr);
		}
	}
	
	public void checking(int xPos, int yPos, Treasure tr)
	{
		xPosition = xPos;
		yPosition = yPos;
		System.out.println(xPos + " - Players Position");
		System.out.println(yPos+ " - Players Position");
		System.out.println(tr.getStartingXLocation()+ " - Treasures position");
		System.out.println(tr.getStartingYLocation()+ " - Treasures position");
		
		if (xPos == tr.getStartingXLocation() && yPos == tr.getStartingYLocation())
		{
			foundTreasure = true;
			System.out.println("In fornt of you are the some massive doors you glance upwards and see a sign above 'Santas Workshop', do you wish to open the door? (Y/N)");
			String input = sc.next();
			if(input.equals("y") || input.equals("Y"))
			{
				System.out.println("You enter the workshop and see the elves happily making their toys for Chirstmas, Santa comes down into the workshop and greets you.");
				System.out.println("I've been waiting for you to come, here have some hot coco, and enjoy the night.");
				
			}
			else
			{
				System.out.println("You away from the doors and back into the forest deciding not to disturb Santa at this busy time.");
			}
		}
	}


	
	public boolean isFoundTreasure() {
		return foundTreasure;
	}
	
	public void setFoundTreasure(boolean foundTreasure) {
		this.foundTreasure = foundTreasure;
	}

	public int getxPosition() {
		return xPosition;
	}

	public void setxPosition(int xPosition) {
		this.xPosition = xPosition;
	}

	public int getyPosition() {
		return yPosition;
	}

	public void setyPosition(int yPosition) {
		this.yPosition = yPosition;
	}
}
