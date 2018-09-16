package sort;

public class QuickSort{
	public static void quickSort(int[] a, int l, int r) {
		if(l >= r)
			return;
		int i = l;
		int j = r;
		int x = a[i];
		while(i < j) {
			while(i<j && a[j]>x)
				j--;
			if(i<j)
				a[i++] = a[j];
			while(i<j && a[i]<x)
				i++;
			if(i<j)
				a[j--] = a[i];
		}
		a[i] = x;
		quickSort(a, l, i-1);
		quickSort(a, i+1, r);
	}
	
	public static void main(String[] args) {
		int a[] = {30, 40, 60, 10, 20, 50};
		
		System.out.println("before sort:");
		for(int i=0; i<a.length; i++)
			System.out.print(a[i] + " ");
		System.out.println();
		
		quickSort(a, 0, a.length-1);
		
		System.out.println("After sort:");
		for(int i=0; i<a.length; i++)
			System.out.print(a[i] + " ");
		System.out.println();
	}
}

