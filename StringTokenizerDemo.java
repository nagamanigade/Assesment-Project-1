package main;
import java.io.*;
import java.lang.*;
import java.util.*;
public class StringTokenizerDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		int sum=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter integers with one space gap");
		String s=sc.nextLine();
		StringTokenizer st=new StringTokenizer(s," ");
		while(st.hasMoreTokens())
		{
		String temp=st.nextToken();
		n=Integer.parseInt(temp);
		System.out.println(n);
		sum=sum+n;
		}
		System.out.println("sum of the integer is:"+sum);
		}
		

	}



