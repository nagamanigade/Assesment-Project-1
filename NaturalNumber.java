package main;

import java.util.Scanner;

public class NaturalNumber {
	public static int sum(int n)
	{
		int s=0;
		for(int i=1;i<=n;i++)
			if(i%3==0||i%5==0)
			{
				s=s+i;
				
			}
		return s;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		int t=sc.nextInt();
		System.out.println(sum(t));
	}

}
