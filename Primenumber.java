package day2;

public class Primenumber {

	public static void main(String[] args) {
		int n;
		int p;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a number: 19");
		n=s.nextInt();
		for(int i=2;i<n;i++)
		{
			p=0;
			for(int j=2;j<i;j++)
			{
				if(i%j==0)
				p=1;
			}
			if(p==0)
				System.out.println(i);
		}
	


	}

}
