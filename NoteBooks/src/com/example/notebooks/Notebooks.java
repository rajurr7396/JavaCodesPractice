package com.example.notebooks;

public class Notebooks {
	
	private int cost;
	int booksize = 90;
	 
	 public int getCost() {
		return cost;
	}


	public void setCost(int cost) {
		this.cost = cost;
	}


	public void OpenLabel() {
		 System.out.println("Label Opened");
	 }


	public void setIncreaseCost(int increaseAmount) {
		setCost(this.cost + increaseAmount);
		
	}
	 
	 

}
