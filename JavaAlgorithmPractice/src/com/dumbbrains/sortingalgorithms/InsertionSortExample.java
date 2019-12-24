package com.dumbbrains.sortingalgorithms;

public class InsertionSortExample {

	public static void main(String[] args) {
		int[] array = { 15, 32, 6, 86, 43, 90, 45 };
		
		//Insertion Sort called
		insertionSort(array);
	}

	private static void insertionSort(int[] array) {
		int temp =0, j;
		
		for(int i=1;i<array.length;i++) {
			temp = array[i];
			j=i;
			
			while(j>0 && array[j-1] > temp) {
				array[j] = array[j-1];
				j--;
			}
			array[j] = temp;
		}
		
		
		for(int arr:array) {
			System.out.print(arr+" ");
		}
	}

}
