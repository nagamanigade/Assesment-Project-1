package main;

import java.util.Scanner;

public class IncreasingNumber {

	public static void main(String[] args) {
		 int num=20;
	       boolean flag = false;

	       
	       Scanner s=new Scanner(System.in);   
	       
      
	       System.out.println("num ");
	       num = s.nextInt();

	       
	       int currentNumber = num % 10;
	       num = num/10;
	       while(num>0){
	           
	           if(currentNumber <= num % 10){
	               flag = true;
	               break;
	           }

	           currentNumber = num % 10;
	           num = num/10;
	       }

	       
	       if(flag){
	           System.out.println("Numbers are not in increasing order.");
	       }else{
	           System.out.println("Numbers are in increasing order.");
	       }
	    }
	
	}


