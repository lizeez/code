package test;
import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		int ans = 0;
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] a = {};
        int[] t = {};
        for(int i = 0; i < n; i++){
            a[i] = sc.nextInt();
        } 
        for(int i = 0; i < n; i++){
            t[i] = sc.nextInt();
        } 
        for(int i = 0; i < n; i++){
            if(i==0 && t[i] == 1) {
            	ans = ans + a[i]*t[i];            	
            }else if(t[i] == 1){
            	ans = ans + a[i]*t[i];  
            	i++;
            	ans = ans + a[i]*t[i]; 
            	i++;
            	ans = ans + a[i]*t[i]; 
            	i++;
            	ans = ans + a[i]*t[i]; 
            }
        } 
        System.out.println(ans);
    }
}
