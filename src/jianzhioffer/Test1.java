package jianzhioffer;

public class Test1 {
	public boolean Find(int target, int[][] array) {
		int i = array.length - 1;
		int j=0;
		while(i>=0 && j<array[0].length-1) {
			if(target > array[i][j]) {
				i--;
			}else if(target < array[i][j]) {
				j++;
			}else {
				return true;
			}
		}
		return false;
	}
}
