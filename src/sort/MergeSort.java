package sort;
/**
 * �鲢����Java
 *
 * @author skywang
 * @date 2014/03/12
 */

public class MergeSort {

    /*
     * ��һ�������е�����������������ϲ���һ��
     *
     * ����˵����
     *     a -- ���������������������
     *     start -- ��1�������������ʼ��ַ��
     *     mid   -- ��1����������Ľ�����ַ��Ҳ�ǵ�2�������������ʼ��ַ��
     *     end   -- ��2����������Ľ�����ַ��
     */
    public static void merge(int[] a, int start, int mid, int end) {
        int[] tmp = new int[end-start+1];    // tmp�ǻ���2������������ʱ����
        int i = start;            // ��1��������������
        int j = mid + 1;        // ��2��������������
        int k = 0;                // ��ʱ���������

        while(i <= mid && j <= end) {
            if (a[i] <= a[j])
                tmp[k++] = a[i++];
            else
                tmp[k++] = a[j++];
        }

        while(i <= mid)
            tmp[k++] = a[i++];

        while(j <= end)
            tmp[k++] = a[j++];

        // ��������Ԫ�أ�ȫ�������ϵ�����a�С�
        for (i = 0; i < k; i++)
            a[start + i] = tmp[i];

        tmp=null;
    }

    /*
     * �鲢����(��������)
     *
     * ����˵����
     *     a -- �����������
     *     start -- �������ʼ��ַ
     *     endi -- ����Ľ�����ַ
     */
    public static void mergeSortUp2Down(int[] a, int start, int end) {
        if(a==null || start >= end)
            return ;

        int mid = (end + start)/2;
        mergeSortUp2Down(a, start, mid); // �ݹ�����a[start...mid]
        mergeSortUp2Down(a, mid+1, end); // �ݹ�����a[mid+1...end]

        // a[start...mid] �� a[mid...end]����������ռ䣬
        // �����������һ������ռ�a[start...end]
        merge(a, start, mid, end);
    }


    /*
     * ������a�����ɴκϲ�������a���ܳ���Ϊlen��������Ϊ���ɸ�����Ϊgap�������飻
     *             ��"ÿ2�����ڵ�������" ���кϲ�����
     *
     * ����˵����
     *     a -- �����������
     *     len -- ����ĳ���
     *     gap -- ������ĳ���
     */
    public static void mergeGroups(int[] a, int len, int gap) {
        int i;
        int twolen = 2 * gap;    // �������ڵ�������ĳ���

        // ��"ÿ2�����ڵ�������" ���кϲ�����
        for(i = 0; i+2*gap-1 < len; i+=(2*gap))
            merge(a, i, i+gap-1, i+2*gap-1);

        // �� i+gap-1 < len-1����ʣ��һ��������û����ԡ�
        // ����������ϲ���������������С�
        if ( i+gap-1 < len-1)
            merge(a, i, i + gap - 1, len - 1);
    }

    /*
     * �鲢����(��������)
     *
     * ����˵����
     *     a -- �����������
     */
    public static void mergeSortDown2Up(int[] a) {
        if (a==null)
            return ;

        for(int n = 1; n < a.length; n*=2)
            mergeGroups(a, a.length, n);
    }

    public static void main(String[] args) {
        int i;
        int a[] = {80,30,60,40,20,10,50,70};

        System.out.printf("before sort:");
        for (i=0; i<a.length; i++)
            System.out.printf("%d ", a[i]);
        System.out.printf("\n");

        mergeSortUp2Down(a, 0, a.length-1);        // �鲢����(��������)
        //mergeSortDown2Up(a);                    // �鲢����(��������)

        System.out.printf("after  sort:");
        for (i=0; i<a.length; i++)
            System.out.printf("%d ", a[i]);
        System.out.printf("\n");
    }
}