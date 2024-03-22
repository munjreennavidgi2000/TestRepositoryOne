package com;

import java.util.Arrays;

public class EqualArrayCheck {
	public static void main(String[] args) {

		int[] a = { 4, 5, 6, 7 };
		int[] b = { 4, 6, 7 };
		System.out.println(Arrays.toString(a) + Arrays.toString(b));

		if (Arrays.equals(a, b)) {
			System.out.println("Arrays are equal");
		} else {
			System.out.println("Arrays are not equal");
		}

	}

}
