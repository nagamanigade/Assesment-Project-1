package lab3;
import java.util.*;
public class MirrorImageOfString {
	public String getImage (String str)

	 {

	 StringBuffer sbr=new StringBuffer(str); 

	 sbr.append('|');

	 StringBuffer sb=new StringBuffer(str);
	 sb.reverse();
	 sbr.append(sb);
	return sbr.toString();
	 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MirrorImageOfString m=new MirrorImageOfString();

		 Scanner sc=new Scanner(System.in); 
		System.out.println("Enter a string"); 
		String str=sc.next();



		System.out.println(m.getImage (str));
	}

}
