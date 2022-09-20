package practice_programs;

import java.util.Scanner;

public class Ternary {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
      int a = 50;int q=40;
		int b = 65;int r=16;
		int c = 70;int p=50;
		
		/*
		int max = (a > b) ? (a > c ? a : c) : (b > c ? b : c);
		String ans=a>b && a>c ? a +"is maxium": b>a && b>c ? b+"is maximum": c+"is maximum";
//		String ans = p > q && p > r ? p + " is maxmimum" : q > p && q > p ? q + " is maximum" : r + "is maximum";
		
		System.out.println("max digitis" + max);
		System.out.println(ans);    */
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Marks");
		int marks=sc.nextInt();
		String result=(marks>40)?"Pass":"Fail";
		System.out.println(result);
		sc.close();
		
		String s=p>q && p>r? p +"is max":q>p && q>r ? q+"Is max": r+ "id max";
	}
}
