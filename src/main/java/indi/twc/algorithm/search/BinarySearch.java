package indi.twc.algorithm.search;

/**
 * 二分查找（面试必备）
 */
public class BinarySearch {
    public static void main(String[] args) {
        int arr[] = {0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};
        //要寻找的目标数字
        int target = 6;
        //返回下标
        int index =  binarySearch(arr,target);
        System.out.println(index);
    }

    /**
     * 给定一个有序的数组，查找 value 是否在数组中，不存在返回-1。
     * 例如：{1, 2, 3, 4, 5} 找 3，返回下标 2（下标从 0 开始计算）。
     * @param a
     * @param target
     * @return
     */
    public static int binarySearch(int a[], int target){
        int left = 0;
        int right = a.length-1;
        //循环条件，适时而变
        while (left<=right){
            int middle = left+(right-left)/2;
            if (a[middle] > target){
                right = middle-1;
            }else if (a[middle] < target){
                left = middle+1;
            }else {
                return middle;
            }
        }
        return -1;
    }
}
