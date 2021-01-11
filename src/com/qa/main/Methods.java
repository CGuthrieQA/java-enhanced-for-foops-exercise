package com.qa.main;

public class Methods {
	
	public void printString(String[] stringArray) {
		
		for(String str : stringArray) {
			System.out.println(str);
		}
		
	}
	
	public void printInteger(int[] intArray) {
		
		for(int i : intArray) {
			
			i = (i * i);
					
			System.out.println(i);
			
		}
		
	}
	
	public boolean returnBool(int input) {
	
		if ( input % 2 == 0 ) {
			
			return true;
			
		} else {
			
			return false;
			
		}
		
	}
	
	public void squareCube(int[] intArray) {
		
		for(int i : intArray) {
			
			if ( returnBool(i) == true ) {
				i = (i * i * i);
			} else {
				i = (i * i);
			}
					
			System.out.println(i);
			
		}
		
	}
	
}
