package test;

public class Test7 {
public static void getFanXu(){
		
		for(int i=101 ; i<=999 ; i++){
			int num = i;
			int aaa = num/100;   //��λ��
			num = num%100;
			int bb = num/10; 	//ʮλ��
			int c = num%10;		//��λ��
			if((aaa==bb&&aaa==c&&c==bb)||c==0){
				continue;
			}
			else{
				int z = i ; //����
				int n = c*100+bb*10+aaa;  //����
				if(z*n==280021){
					System.out.println(z+","+n);
				}else{
					continue;
				}
			}
		}
		
	}
	public static void main(String[]Args){  
		getFanXu();
	}
}

