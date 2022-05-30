package lab2;

public class ArrayInteger {

	public static void main(String[] args) {
		int[]a= {9,4,5,6,8};
		int small=a[0];
		int f=0;
		for(int i=1;i<a.length;i++) {
			if(a[i]<small) {
				f=small;
				small=a[i];
			}
		}
		System.out.println(small);
		System.out.println(f);

}
}