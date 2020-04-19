package div2_A;

import java.util.Scanner;

public class PetyaAndStrings_112A {
	
	/*
	 * https://codeforces.com/problemset/problem/112/A
	 */
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String str1 = sc.nextLine().toLowerCase();
		String str2 = sc.nextLine().toLowerCase();
		boolean flag1 = false, flag2 = false;
		
		for (int i = 0; i < str1.length(); i++) {
			if(str1.charAt(i) < str2.charAt(i)) {
				flag1 = true;
				break;
			} else if(str2.charAt(i) < str1.charAt(i)) {
				flag2 = true;
				break;
			}
		}
		
		if(flag1) {
			System.out.println("-1\n");
		} else if(flag2) {
			System.out.println("1\n");
		} else {
			System.out.println("0\n");
		}
				
		sc.close();
	}
}
