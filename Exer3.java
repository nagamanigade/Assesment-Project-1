package lab6;
import java.util.*;
public class Exer3 {
	//create a method m and return hashmap
		public static HashMap m(int[] array )
		
		{
			//create a hashmap object
			HashMap<Integer,Integer> map=new HashMap<Integer,Integer>();
			//taking int n value form array
			for(int n:array)
			{
				//take n as 1 then n*n as 1*1 that can assign to map
				map.put(n, n*n);
			}
			//and return map
			return map;
			
			}
		//create a main method

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//create an integer object
				int array[]=new int[] {1,2,3,4,5,6,7,8,11};
				
				HashMap<Integer,Integer> map=m(array);
				//here by using iterator
				Iterator<Integer> i=map.keySet().iterator();
				
				while(i.hasNext()) {
					Integer key=i.next();
					System.out.println(key +":"+map.get(key));
					
				}
	}

}
