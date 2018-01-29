package indi.twc.algorithm.sort.improve;

import indi.twc.algorithm.utils.AlgorithmUtils;

import java.util.Arrays;

/**
 * 堆排序
 */
public class HeapSort {
	
	public static void main(String[] args) {
		int arr[] = {2,6,13,8,4,1,9,15,3,10,11,12,7,5,14,16};
		heapSort(arr);
	}

	public static void heapSort(int[] arr) {
		if(arr == null || arr.length == 0){
			return ;
		}

		//首先建立大顶堆
		for(int i=arr.length/2; i>=0; i--) {
			heapAdjust(arr, i, arr.length-1);
		}
		//其余其它分别建立大顶堆
		for(int i=arr.length-1; i>=0; i--) {
			AlgorithmUtils.swap(arr, 0, i);
			heapAdjust(arr, 0, i-1);
		}
		System.out.println(Arrays.toString(arr));

	}

	public static void heapAdjust(int[] arr, int start, int end) {
		int temp = arr[start];

		for(int i=2*start+1; i<=end; i*=2) {
			//左右孩子的节点分别为2*i+1,2*i+2

			//选择出左右孩子较大的下标
			if(i < end && arr[i] < arr[i+1]) {
				i ++;
			}
			if(temp >= arr[i]) {
				break; //已经为大顶堆，=保持稳定性。
			}
			arr[start] = arr[i]; //将子节点上移
			start = i; //下一轮筛选
		}

		arr[start] = temp; //插入正确的位置
	}


	
}

