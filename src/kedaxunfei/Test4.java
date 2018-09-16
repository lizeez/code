package kedaxunfei;

import java.util.Scanner;

public class Test4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		int[] res = new int[t];
		for(int i=0; i<t; i++) {
			int n = sc.nextInt();
			int x = sc.nextInt();
			int[] a = new int[n];
			int sum=0;
			for(int j=0; j<n; j++)
			{
				a[j] = sc.nextInt();
				sum += a[j];
			}				
			for(int j=0; j<n-1; j++) {
				for(int k=j+1; k<n; k++) {
					if(a[j] > a[k]) {
						int tem = a[k];
						a[k] = a[j];
						a[j] = tem;
					}
				}
			}
			
			
			if(sum >= n*x) {
				res[i] = 0;
			}else {
				int count = 0;
				for(int j=0; j<n; j++) {
					count++;
					sum = sum + 100 - a[j];
					
					if(sum >= n*x)
						break;
				}
				res[i] = count;
			}
		}
		for(int i=0; i<t; i++)
			System.out.println(res[i]);
	}
}
