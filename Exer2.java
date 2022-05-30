package lab2;
import java.util.Arrays;
import java.util.Scanner;
public class Exer2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Create a method which accepts an integerarray and removes all
				// the duplicates in the array
				Scanner sc=new Scanner(System.in);
				System.out.println("Enter the size of a array");
			//	int Size=Integer.parrseInt(sc.nextLine());
				int size=sc.nextInt();
				int [] arr=new int[size];
				System.out.println("Enter array elements:");
				for(int i=0;i<=size;i++) {
					arr[i]=sc.nextInt();
					}
				//String s = sortstring(names);	
			}
		private static String sortString(String[] names) {
			Arrays.sort(names);
			int len=names.length;
			int mid=len/2;
			System.out.println("Resultant array is:");
			if(len%2==0) {
				for(int j=0;j<len;j++) //int j=len;j>=len/2;j--
				{
					System.out.println(names[j].toLowerCase());
					
				}
			}
			else {
				for(int i=0;i<(mid)+1;i++) {
					System.out.println(names[i].toLowerCase());
					
					
				}
				for(int j=(mid+1);j<=len;j++)//int j=len-1;j>=len/2;j--
				{
					System.out.println(names[j].toLowerCase());
				}
					
			}
			return null;
	}

}
