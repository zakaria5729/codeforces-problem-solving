package div2_A;

import java.util.Scanner;

public class YoungPhysicist_69A {
		
	public static void main(String[] args) {
		int num, sum1 = 0, sum2 = 0, sum3 = 0, x, y, z;
		
		Scanner sc = new Scanner(System.in);
		num = sc.nextInt();
		
		while (num > 0) {
			x = sc.nextInt();
			y = sc.nextInt();
			z = sc.nextInt();
			
			sum1 += x;
			sum2 += y;
			sum3 += z;
			
			num--;
		}
		
		if(sum1 == 0 && sum2 == 0 && sum3 == 0) {
			System.out.println("YES\n");
		} else {
			System.out.println("NO\n");
		}
		
		sc.close();
	}
}
