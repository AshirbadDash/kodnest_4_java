package com.strings;

public class Solution2 {

	// input:Hello Java Programs
	// output :smarg orpa vaJolleH

	public static void main(String[] args) {
		String str = "Hello Java Programs";
		
		String[] str1 = str.split(" ");
		String space="";
		for (int i = 0; i < str1.length; i++) {
			String reverseWord = " ";
			String str2 = str1[i];
			
			for (int j = str2.length() - 1; j >= 0; j--) {
//	                System.out.print(str2.charAt(j));
				reverseWord = reverseWord + str2.charAt(j);
			}

			space=space+reverseWord+"";
		}
		System.out.println(space);

	}
}
