package com.strings;

public class Solution1 {

	// input:Hello Java Programs
	// output :smarg orpa vaJolleH

	public static void main(String[] args) {
		String str = "Hello Java Programs";

		String[] str1 = str.split(" ");

		for (String i : str1) {
			String str2 = i;
			System.out.println(str2);
			System.out.println(str2.length());
//			String revW = "";
//			for (int j = str2.length() - 1; j >= 0; j--) {
//				
//				System.out.print(str2.charAt(j));
//
			}
		}

	}
//}
