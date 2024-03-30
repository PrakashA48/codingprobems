package in.programming;

import java.util.Scanner;

public class AddElements {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of elements in the array:");
		int n = sc.nextInt();
		int[] a = new int[n + 1];

		System.out.println("Enter " + n + " elements:");
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}
		System.out.println("Enter the element you want to insert:");
		int z = sc.nextInt();
		System.out.println("Enter the position where you want to insert the element:");
		int pos = sc.nextInt();
		if (pos < 1 || pos > n + 1) {
			System.out.println("Invalid position");
		} else {
			for (int i = n; i > pos - 1; i--) {
				a[i] = a[i - 1];
			}
			a[pos - 1] = z;

		}

		System.out.println("Array after insertion:");
		for (int i = 0; i < n + 1; i++) {
			System.out.print(a[i] + " ");
		}
	}
}
