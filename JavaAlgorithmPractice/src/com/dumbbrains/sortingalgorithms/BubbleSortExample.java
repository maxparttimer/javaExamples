package com.dumbbrains.sortingalgorithms;

public class BubbleSortExample {
	public static void main(String[] args) {
		int[] array = { 15, 32, 6, 86, 43, 90, 45 };
		// Calling bubbleSort method to perform bubble sort on the supplied
		// array
		bubbleSort(array);
	}

	private static void bubbleSort(int[] array) {
		int tempHolder = 0;
		for (int loop = 0; loop < array.length; loop++) {
			int breakFlag = 0;
			for (int iteration = 0; iteration < array.length - 1 - loop; iteration++) {
				if (array[iteration] > array[iteration + 1]) {
					tempHolder = array[iteration];
					array[iteration] = array[iteration+1];
					array[iteration+1]= tempHolder;
					breakFlag = 1;
				}
			}
			if(breakFlag ==0) {
				break;
			}
		}
		
		//Printing the sorted array.
		for(int element : array) {
			System.out.print(element + " ");
		}

	}
}
