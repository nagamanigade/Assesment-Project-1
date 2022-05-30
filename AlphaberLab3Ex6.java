package lab3;
static boolean alphabetical_order(String my_str){
    int str_len = my_str.length();
    for (int i = 1; i < str_len; i++){
       if (my_str.charAt(i) < my_str.charAt(i - 1)){
          return false;
       }
    }
    return true;
}

public class AlphaberLab3Ex6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 String my_str = "abcmnqxz";
	      if (Alphabetical order(my _Str)){
	         System.out.println("The letters are in alphabetical order.");
	      }
	      else {
	         System.out.println("The letters are not in alphabetical order.");
	      }
	   }
	
}


