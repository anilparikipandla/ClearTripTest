package com.ClearTrip.Utils;

import java.util.List;

public class Misc {

	public static int getSecondLargestPrice(int arr[]) {
		int arr_size = arr.length;
		int i, first, second;
		/* There should be atleast two elements */
		if (arr_size < 2) {
			System.out.println("Second Highest flight not found");
			return arr[0];
		}
		first = second = 0;
		for (i = 0; i < arr_size; i++) {
			if (arr[i] > first) {
				second = first;
				first = arr[i];
			} else if (arr[i] > second && arr[i] != first)
				second = arr[i];
		}
		if (second == 0){
			System.out.print("There is no second largest element\n");
			return arr[0];
		}
		else
			System.out.print("The second largest element is " + second);

		return second;
	}
	
}