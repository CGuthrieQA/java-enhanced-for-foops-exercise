package com.qa.main;

public class Runner {
		
	public static void main(String[] args) {
		
		Methods mtds = new Methods();
		
		String[] stringArray = {
				"This",
				"is",
				"an",
				"array",
				"of",
				"strings!"
		};
		
		mtds.printString(stringArray);
		
		int[] intArray = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20 };
		
		mtds.printInteger(intArray);
		
		mtds.squareCube(intArray);
		
	}

}
