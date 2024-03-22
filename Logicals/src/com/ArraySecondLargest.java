package com;

import java.util.Arrays;

public class ArraySecondLargest {

	public static void main(String[] args) {

		int[] a = { 4, 8, 7, 1 };

		Arrays.sort(a);
		System.out.println(Arrays.toString(a));

		System.out.println("Second largest is " + a[1]);

	}

}
