package lab5;
import java.util.Scanner;

public class Exer2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc = new Scanner(System.in);

	     System.out.println("enter first name");
	     String firstname = sc.nextLine();
	     
	     System.out.println("enter last name");
	     String lastname = sc.nextLine();
	     try
	     {
	    	 if(firstname.length()==0 && lastname.length()==0)
	    	 {
	    		 throw new Exception("invalid name");
	    		
	    	 }
	    	 else
	    	 {
	    		 System.out.println("valid name");
	    	 }
	     }
	     catch(Exception a)
	     {
	    	 System.out.println(a);
	     }
	}

}
