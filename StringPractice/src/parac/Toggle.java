package parac;

import java.util.Scanner;

public class Toggle {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string");
		StringBuilder sb = new StringBuilder(sc.nextLine());
		// toggle
		// PHysiCs --> phYSicS
		for (int i = 0; i < sb.length(); i++) {
			// P-->p
			// check --> alphabet -small,capital
			boolean flag = true; // true -->capital
			char ch = sb.charAt(i); // A
			if (ch == ' ')
				continue;
			int ascii = (int) ch;// 65

			if (ascii >= 97) {
				flag = false;// small
			}

			if (flag == true) {// capital
				ascii += 32;
				char dh = (char) ascii;// a
				sb.setCharAt(i, dh);
			} else {// small
				ascii -= 32;
				char dh = (char) ascii;
				sb.setCharAt(i, dh);
			}

		}
		sc.close();
	}

}
