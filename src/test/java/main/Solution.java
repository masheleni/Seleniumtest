//package main;
//
//import java.io.*;
//import java.math.*;
//import java.security.*;
//import java.text.*;
//import java.util.*;
//import java.util.concurrent.*;
//import java.util.regex.*;
//
//public class Solution {
//
//	
//	static void miniMaxSum(int[] arr) {
//		//Print min and max sums 
//		arr = sortArray(arr);
//		int minSum = minSum(arr);
//		int maxSum = maxSum(arr);
//		System.out.print(minSum + " " + maxSum);
//	}
//
//	static int minSum(int[] arr) {
//		// Calculate min sum
//		int sum = 0;
//		for (int i = 0; i < 4; i++) {
//			sum = sum + arr[i];
//		}
//		return sum;
//	}
//
//	static int maxSum(int[] arr) {
//		//Calculate max sum
//		int sum = 0;
//		for (int i = 1; i <= 4; i++) {
//			sum = sum + arr[i];
//		}
//		return sum;
//	}
//
//	static int[] sortArray(int[] arr) {
//		// Sort the array in ascending order
//		int temp;
//		for (int i = 1; i < arr.length; i++) {
//			for (int j = i; j > 0; j--) {
//				if (arr[j] < arr[j - 1]) {
//					temp = arr[j];
//					arr[j] = arr[j - 1];
//					arr[j - 1] = temp;
//				}
//			}
//		}
//		return arr;
//	}
//
//	private static final Scanner scanner = new Scanner(System.in);
//
//	public static void main(String[] args) {
//		int[] arr = new int[5];
//		String[] arrItems = scanner.nextLine().split(" ");
//		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
//		for (int i = 0; i < 5; i++) {
//			int arrItem = Integer.parseInt(arrItems[i]);
//			arr[i] = arrItem;
//		}
//		miniMaxSum(arr);
//		scanner.close();
//	}
//
//}
