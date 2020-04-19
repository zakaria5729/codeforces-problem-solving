package div2_A;

import java.util.Scanner;

public class StringTask_118A {
	
	/*
	 * https://codeforces.com/problemset/problem/118/A
	 */
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		String outputStr = "";
		
		str = str.toLowerCase();
		
		for (int i = 0; i < str.length(); i++) {
			if(str.charAt(i) != 'a' && str.charAt(i) != 'o' && str.charAt(i) != 'y' && str.charAt(i) != 'e' && str.charAt(i) != 'u' && str.charAt(i) != 'i') {
				outputStr += "." + str.charAt(i);
			}
		}
		
		System.out.println(outputStr);
	
		sc.close();
	}
}
