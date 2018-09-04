package test;

public class Fabonacci {
	public static int fabonacci(int n){
		if(n==1 || n==2) {
			return 1;
		}
		return fabonacci(n-1) + fabonacci(n-2);
	}
	
	
	public static void main(String[] args) {
		System.out.println(fabonacci(5));
	}
}
