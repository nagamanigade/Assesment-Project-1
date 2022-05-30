package lab6;
import java.util.*;
public class Exer7 {
	//reversing array
		//function reverses the element of array
		 static void reverse(Integer a[])
		{
			 //create a list of elements in reverse order
			Collections.reverse(Arrays.asList(a));
			//print all the elements
			System.out.println(Arrays.asList(a));
			
		}
	public static void main(String[] args) {
		//given array list
				Integer[] arr= {10,20,30,40,50};
				reverse(arr);

	}

}
