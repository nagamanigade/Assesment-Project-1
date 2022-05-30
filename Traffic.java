package main;
import java.util.Scanner;

public class Traffic {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("\n1 for red \n2 for yellow \n3 for green");
		int color = sc.nextInt();
		String message = "";
		switch(color) 
		{
		case 1:
			message = "stop";
			break;
		case 2:
			message = "ready";
			break;
		case 3:
			message ="go";
			break;
			default:
				message = "Invalid input";
				break;
		
		}
		System.out.println(message);
		
	}
	}


