package com;

public class ArraySort {

	public static void main(String[] args) {

		int[] a = { 1, 5, 8, 7, 66 };

		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] > a[j]) {
					int temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
		for (int i : a) {
			System.out.println(i);
		}

	}

}
