package div2_A;

import java.util.Scanner;

public class Watermelon_4A {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		if(num <= 2 || num%2 != 0) {
			System.out.println("NO\n");
		} else {
			System.out.println("YES\n");
		}
	}
}
