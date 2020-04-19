package div2_A;

import java.util.Scanner;

public class ChatRoom_58A {

	/*
	 * https://codeforces.com/problemset/problem/58/A
	 */	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		
		String str2 = "hello";
		int counter = 0;
		
		for (int i = 0; i < str.length(); i++) {
			if(str.charAt(i) == str2.charAt(counter)) {
				counter++;
				System.out.println(counter);
			}
			
			if(counter == 5) {
				break;
			}
		}
		
		if(counter == 5) {
			System.out.println("YES\n");
		} else {
			System.out.println("NO\n");
		}
		
		sc.close();
	}
}
