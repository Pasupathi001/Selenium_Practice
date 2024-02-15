package com.java;
import java.util.Scanner;

public class Arr {
	public void hai() {
		
		Scanner a = new Scanner(System.in);
		int res[] = new int[2];
		for (int i = 0; i < res.length; i++) {
			res[i] = a.nextInt();
			System.out.println(res[i]);
			
			
		}
	}
	

	
	public void bye() {
		Scanner b = new Scanner(System.in);
		int rest[] = new int[5];
		for (int i = 0; i < rest.length; i++) {
			rest[i] = b.nextInt();
			System.out.println(rest[i]);
		
		
	}
	}
	public static void main(String[] args) {
		Arr h = new Arr();
		h.hai();
		h.bye();
		
		
	}
}

            
        

		 
	





