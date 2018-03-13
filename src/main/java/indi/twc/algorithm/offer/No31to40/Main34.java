package indi.twc.algorithm.offer.No31to40;


/**
 * 数组中的逆序对
 */
public class Main34 {
    private static long cnt = 0;

    public static void main(String[] args) {
        int[] array = new int[]{7, 5, 6, 4};
        System.out.println(InversePairs(array));
    }

    public static int InversePairs(int [] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length ; j++) {
                if (array[i] > array[j]) {
                    sum++;
                }
            }
        }
        return sum;
    }

    public static int InversePairs2(int [] array) {
        mergeSortUp2Down(array, 0, array.length - 1);
        return (int) (cnt % 1000000007);
    }

    private static void mergeSortUp2Down(int[] a, int start, int end) {
        if (end - start < 1) return;
        int mid = start + (end - start) / 2;
        mergeSortUp2Down(a, start, mid);
        mergeSortUp2Down(a, mid + 1, end);
        merge(a, start, mid, end);
    }

    private static void merge(int[] a, int start, int mid, int end) {
        int[] tmp = new int[end - start + 1];
        int i = start, j = mid + 1, k = 0;
        while (i <= mid || j <= end) {
            if (i > mid) tmp[k] = a[j++];
            else if (j > end) tmp[k] = a[i++];
            else if (a[i] < a[j]) tmp[k] = a[i++];
            else {
                tmp[k] = a[j++];
                cnt += mid - i + 1; // a[i] > a[j] ，说明 a[i...mid] 都大于 a[j]
            }
            k++;
        }

        for (k = 0; k < tmp.length; k++) {
            a[start + k] = tmp[k];
        }
    }
}
