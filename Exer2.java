package lab6;
import java.util.HashMap;
public class Exer2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//take a string value
				String str="Capgemini";
				//count the characters which are present in a string
				HashMap <Character,Integer> charCount = new HashMap<>();
				//using for loop
				for(int i=str.length()-1;i>=0;i--)
				{
					//converted the  given string into character array
					if(charCount.containsKey(str.charAt(i)))
					{
						//update the count value in the hashmap
				int count=charCount.get(str.charAt(i));
			//for each character we have to verify if the key already exist or not
			//if exist increase the count variable
						charCount.put(str.charAt(i), ++count);
						
					}
			//else add it to the new key and provide initial value with count 1
					
					else
					{
						charCount.put(str.charAt(i), 1);
					}
				}
				System.out.println(charCount);
	}

}
