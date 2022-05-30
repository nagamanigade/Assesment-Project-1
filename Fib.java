package main;
import java.util
.Scanner;

public class Fib {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the no for print Fibonocci");
		int n=sc.nextInt();
		for(int i=1;i<=n;i++) {
			System.out.println(printFibonacci(i)+" ");
		}
	}
		private static int printFibonacci(int CurrentNumber)
		{
			if(CurrentNumber==1||CurrentNumber==2) {
				return 1;
			}
			return printFibonacci(CurrentNumber-1)+printFibonacci(CurrentNumber -2);
	}

}
