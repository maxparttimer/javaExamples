package com.dumbbrains.patternexamples;

public class StarPattern1 {

	public static void main(String[] args) {
		for(int rows=0;rows<=4;rows++){
			for (int columns=0;columns<=rows; columns++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	
}
