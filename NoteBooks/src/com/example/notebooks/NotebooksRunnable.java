package com.example.notebooks;

public class NotebooksRunnable {

	public static void main(String[] args) {
		
		Notebooks Java = new Notebooks();
		Notebooks Python = new Notebooks();
		
		Java.OpenLabel();
        Python.OpenLabel();
        
       int Java_Book_Size =  Java.booksize;
       int Python_Book_Size = Python.booksize;
       
       System.out.println("Java booksize " +" " +r);
       System.out.println("Python booksize\t=\t" +y);
      
       Java.setCost(800);
       Python.setCost(400);
       
       int a = Java.getCost();
       
		
		
	}

}
