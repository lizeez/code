package test;

public class GcdLcm {
	public static int gcd(int n1, int n2) {
		int gcd = 0;
		if(n1 < n2) {
			n1 = n1+n2;
			n2 = n1-n2;
			n1 = n1-n2;
		}
		while((gcd=n1%n2)!=0) {
			n1 = n2;
			n2 = gcd;
		}
		gcd = n2;
		return gcd;
	}
	
	public static int lcm(int n1, int n2) {
		return n1*n2/gcd(n1, n2);
	}
	
	public static void main(String[] args) {
		System.out.println(gcd(12, 18));
		System.out.println(lcm(12, 18));
	}
}
