package lab2;

public class Exer3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//initialize array

				int[] arr=new int[] {1,2,3,4,5}; 
				System.out.println("original array:");
				 for(int i=0;i<arr.length; i++)
				{
				System.out.print(arr[i]+" ");

				 System.out.println();
				}
				System.out.println("array in reverse order:"); //loop through the array in reverse order 
				for(int i=arr.length-1;i>=0;i--)
				{
				System.out.print(arr[i] + " ");
				}
	}

}
