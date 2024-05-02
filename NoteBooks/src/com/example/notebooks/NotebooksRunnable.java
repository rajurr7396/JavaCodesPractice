package com.example.notebooks;

public class NotebooksRunnable {

	public static void main(String[] args) {
		
		Notebooks Java = new Notebooks();
		Notebooks Python = new Notebooks();
		
		Java.OpenLabel();
        Python.OpenLabel();
        
       int Java_Book_Size =  Java.booksize;
       int Python_Book_Size = Python.booksize;
       
       System.out.println("Java booksize" +" " +Java_Book_Size);
       System.out.println("Python booksize" + " " +Python_Book_Size);
      
       Java.setCost(800);
       Python.setCost(400);
       
       int Java_Book_Cost = Java.getCost();
       int Python_Book_Cost = Python.getCost();
       
       System.out.println(Java_Book_Cost);
       System.out.println(Python_Book_Cost);
       
       Java.setIncreaseCost(100);
      int Java_Book_CostChanged = Java.getCost();
       System.out.println("Java book cost increased" + " " +Java_Book_CostChanged);
		
	}

}
