package Starl_Pattern_;

import java.util.Scanner;

public class Star13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in); 
        int n =sc.nextInt();
        int i,j;
        
        for(i=1;i<=n;i++) {
        	for(j=1;j<=i;j++) {
        		System.out.print("*");
        	}
        	System.out.println();
        }
        	for(i=1;i<=n;i++) {
        		for(j=1;j<=n-i;j++) {
        			System.out.print("*");
        		}
        	
        	System.out.println();
        }
	}

}