package sort;

public class ShellSort {
	public static void shellSort(int[] a, int n) {
		for(int gap = n/2; gap>0; gap/=2) {
			for(int i=0; i<gap; i++) {
				for(int j=i+gap; j<n; j+=gap) {
					if(a[j] < a[j-gap]) {
						int tmp = a[j];
						int k = j-gap;
						while(k>=0 && a[k]>tmp) {
							a[k+gap] = a[k];
							k -= gap;
						}
						a[k+gap] = tmp;
					}
				}
			}
		}
	}
}
