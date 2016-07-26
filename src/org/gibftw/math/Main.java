package org.gibftw.math;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		System.out.println("What is 2+2?");
		Scanner num = new Scanner(System.in);
		int numInt = num.nextInt();
		if(numInt==4) { System.out.println("Correct!"); 
		} else { 
			
			System.out.println("Wrong!");
			Main.main(args);
			 
		}
		
		
		
	}

}
