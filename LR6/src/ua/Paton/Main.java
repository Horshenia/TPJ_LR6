package ua.Paton;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		System.out.println("2)");
		for(float x = -2; x<2; x+=0.2) {
			System.out.println("y="+( (Math.pow(x, x-1)-1)*(Math.pow(x, x+1)+1) ));
		}
		System.out.println("3)");
		float nu = 0;
		Scanner scan = new Scanner(System.in);
		for(float i = 0; i<10; i++) {
			System.out.println("№"+i+"\\->");
			nu += scan.nextFloat() % 1;
		}
		System.out.println("Сума дійсних частин: "+nu);
		System.out.println("4)");
		String s = null, n, key = "done";
		do {
			n = scan.nextLine();
			if(s == null || (s.length()>n.length() && !s.equalsIgnoreCase(key))) {
				s = n;
			}
		}while(!n.equalsIgnoreCase(key));
		scan.close();
		System.out.println("Найкоротший з введених рядків: "+s);
	}
}
