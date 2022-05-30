package main;
import java.util.Scanner;

public class PowerOfTwo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("40");
		int num = sc.nextInt();
		if(checkNumber(num))
		{
			System.out.println(+40+" is a power of 2");
			
		}
		else
		{
			System.out.println(+40+" is not a power of 2");
		}
	}
	public static boolean checkNumber(int num)
	{
		while (num%2==0)
		{
			num=num/2;
		}
		if (num==1)
		{
			return true;
		}
		else
		{
			return false;
		}
	
	}

}
