package me.checkhomework;

import java.util.Arrays;

public class SortTest {
	public static void main(String[] args) {
		int[] arr = { 8, 2, 3, 7, 1 };
		int count = 0;
		for (int i = 1; i < arr.length; i++) {
			int temp = arr[i];
			int j = i - 1;
			for (; j >= 0 && temp < arr[j]; j--) {
				arr[j + 1] = arr[j];
				count++;
				System.out.println("====>第" + count + "次尝试交换后：" + Arrays.toString(arr));
			}
			arr[j + 1] = temp;
			System.out.println("=================>第" + (i + 1) + "轮交换后：" + Arrays.toString(arr));
		}
	}

}
