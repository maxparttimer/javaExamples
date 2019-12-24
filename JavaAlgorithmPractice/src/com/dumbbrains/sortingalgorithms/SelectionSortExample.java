package com.dumbbrains.sortingalgorithms;

public class SelectionSortExample {
	public static void main(String[] args) {
		int[] array = { 15, 32, 6, 86, 43, 90, 45 };
		// Calling selection Sort method to perform bubble sort on the supplied
		// array
		selectionSort(array);
	}

	private static void selectionSort(int[] array) {
		int tempHolder = 0;
		for (int loop = 0; loop < array.length; loop++) {
			int min = loop;
			for(int iteration = loop+1;iteration<array.length;iteration++) {
				if(array[iteration]< array[min]) {
					min = iteration;
				}
			}
			tempHolder = array[loop];
			array[loop] = array[min];
			array[min] = tempHolder;
			
		}
		
		//Printing the sorted array.
		for(int element : array) {
			System.out.print(element + " ");
		}

	}


}
