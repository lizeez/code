package meituan;

import java.util.Scanner;

public class Test2 {
	private static int getMaxNum(int[] num, int k) {  
        // TODO Auto-generated method stub  
        int len =num.length;  
        int[] result = new int[len];  
        int temsum=0,maxsum=0;  
        if(len==1&&num[0]%k==0){  
            return 1;  
        }  
        for(int i=0;i<len;i++){  
            temsum =0;  
            for(int m=0;m<len;m++){  
                result[m] =num[m];  
            }  
            if(num[i]%k==0){  
                temsum = 1;  
            }  
            for(int j=i+1;j<len;j++){  
                result[j]+=result[j-1];  
                if(result[j]%k==0){  
                    temsum =j-i+1;  
                    if(temsum>=maxsum){  
                        maxsum =temsum;  
                    }  
                }  
            }  
        }  
        return maxsum;  
    }  
    public static void main(String[] args) {  
        Scanner sc =new Scanner(System.in);  
        while(sc.hasNext()){  
            int n = sc.nextInt();  
            int[] num = new int[n];  
            for(int i=0;i<n;i++){  
                num[i] = sc.nextInt();  
            }  
            int k = sc.nextInt();  
            System.out.println(getMaxNum(num,k));  
        }  
    }
}
