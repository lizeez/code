package meituan;

public class Test1 {
	public static void main(String[] args) {
		String str = "1122334455667788990";
		System.out.println(getMinInt(str));
	}

	private static int getMinInt(String str) {
		// TODO Auto-generated method stub
		char[] cArray = str.toCharArray();
		int[] cDictionary = new int[256];
		
		for(int i=0; i<cArray.length; i++) {
			cDictionary[cArray[i]]++;
		}
		int tem = 1;
		for(int i=1; i<=9; i++) {
			if(cDictionary[(char)(i+48)] == 0) {
				return i;	
			}
			if(cDictionary[(char)(i+48)] < cDictionary[(char)(tem+48)]) {
				tem = i;
			}
		}
		if(cDictionary['0'] == 0) {
			return 10;
		}else if(cDictionary[(char)(tem+48)] <= cDictionary['0']) {
			int num = 0;
			for(int i=0; i<=cDictionary[(char)(tem+48)]; i++) {
				num = num*10 + tem;
			}
			return tem;
		}
		return 0;
	}
}
