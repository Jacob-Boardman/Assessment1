package com.qa.Assessment;

public class Treasure 
{
	private int setXLocation;
	private int setYLocation;
	private int startingXLocation;
	private int startingYLocation;
	
	Treasure(){}
	
	Treasure(int setXLocation, int setYLocation)
	{	
		if(setXLocation < 4)
		{
			this.startingXLocation = (-setXLocation) -3; 
		}
		else
		{
			this.startingXLocation = setXLocation;
		}
		if(setYLocation < 4)
		{
			this.startingYLocation = (-setYLocation) -3; 
		}
		else
		{
			this.startingYLocation = setYLocation;
		}
		
	}

	public int getStartingYLocation() {
		return startingYLocation;
	}

	public void setStartingYLocation(int startingYLocation) {
		this.startingYLocation = startingYLocation;
	}

	public int getStartingXLocation() {
		return startingXLocation;
	}

	public void setStartingXLocation(int startingXLocation) {
		this.startingXLocation = startingXLocation;
	}

	public int getSetXLocation() {
		return setXLocation;
	}

	public void setSetXLocation(int setXLocation) {
		this.setXLocation = setXLocation;
	}

	public int getSetYLocation() {
		return setYLocation;
	}

	public void setSetYLocation(int setYLocation) {
		this.setYLocation = setYLocation;
	}
}
