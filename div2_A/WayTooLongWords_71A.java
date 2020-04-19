package div2_A;

import java.util.Scanner;

public class WayTooLongWords_71A {
	
	/*
	 * https://codeforces.com/problemset/problem/71/A
	 */
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		while(num >= 0) {
			String st = sc.nextLine();
						
			if(st.length() > 10) {
				System.out.println(st.charAt(0) + "" + (st.length() - 2) + "" + st.charAt(st.length() - 1));
			} else {
				System.out.println(st);
			}
			
			num--;
		}
		
		sc.close();
	}
}
