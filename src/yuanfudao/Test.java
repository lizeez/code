package yuanfudao;

import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[][] a = new int[3][];
		int[] a1 = {1, 2, 3};
		int[] a2 = {1, 2, 3, 7};
		int[] a3 = {1, 2, 3, 4};
		a[0] = a1;
		a[1] = a2;
		a[2] = a3;
		for(int i=0; i<3; i++) {
			for(int j=0; j<a[i].length; j++) {
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
	}
	
	
}
