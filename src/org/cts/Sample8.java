package org.cts;

import java.util.Scanner;

public class Sample8 {
	public static void main(String[] args) {
		System.out.println("Enter No");
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		int u=0,l=0,d=0,sp=0;
		String u1="",l1="",d1="";
		for(int i=0;i<s.length();i++) {
			char c=s.charAt(i);
			if(Character.isUpperCase(c)) 
				u++;
				
			else if(Character.isLowerCase(c)) 
				l++;
		
		else if(Character.isDigit(c)) 
			d++;
			
		else 
		{
			sp++;
		}
		}
			System.out.println("upper"+u);
			System.out.println("lower"+l);
			System.out.println("digit"+d);
			System.out.println("special"+sp);
		
		}
	}


