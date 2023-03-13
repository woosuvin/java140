package edu.java.method03;

public class MethodMain03_1 {   // 내 풀이

	public static void main(String[] args) {
		int[] array = {3, 6, 1, 8, 9};

		System.out.println("sum = " + sum(array));
		
		System.out.println("mean = " + mean(array));
		
		System.out.println("max = " + max(array));
		
		System.out.println("maxAt = " + maxAt(array));
		
		System.out.println("min = " + min(array));
		
		System.out.println("minAt = " + minAt(array));
	}
	
    /**
     * sum
     * 정수 배열의 모든 원소들의 합을 리턴.
     * @param arr 정수 배열.
     * @return 배열 arr의 모든 원소들의 합.
     */
    public static int sum(int[] arr) {
    	int sum = 0;
    	for (int x : arr) {
    		sum += x;
    	}
    	return sum;
    }
    
    /**
     * mean
     * 정수 배열의 모든 원소들의 평균을 리턴.
     * @param arr 정수 배열.
     * @return 배열 arr의 모든 원소들의 평균(double).
     */
    public static double mean(int[] arr) {
    	double mean = (double) sum(arr) / arr.length;
    	return mean;
    }
    
    /**
     * max
     * 정수 배열에서 최댓값을 찾아서 리턴.
     * @param arr 정수 배열.
     * @return 배열 arr의 원소들 중 최댓값.
     */
    public static int max(int[] arr) {
    	int max = arr[0];
    	for (int x : arr) {
    		if (max < x) {
    			max = x;
    		}
    	}
    	return max;
    }
    
    /**
     * maxAt
     * 정수 배열에서 최댓값의 인덱스 리턴.
     * @param arr 정수 배열.
     * @return 배열 arr의 원소들 중 최댓값의 인덱스.
     * 최댓값이 여러개 있는 경우, 첫번째 최댓값의 인덱스.
     */
    public static int maxAt(int[] arr) {
    	int max = arr[0];
    	int index = 0;
    	for (int i = 0; i < arr.length; i++) {
    		int x = arr[i];
    		if (max < x) {
    			max = x;
    			index = i;
    		}
    	}
    	return index;
    }

    /**
     * min
     * 정수 배열에서 최솟값을 찾아서 리턴.
     * @param arr 정수 배열.
     * @return 배열 arr의 원소들 중 최솟값.
     */
    public static int min(int[] arr) {
    	int min = arr[0];
    	for (int x : arr) {
    		if (min > x) {
    			min = x;
    		}
    	}
    	return min;
    }
    
    /**
     * minAt
     * 정수 배열에서 최솟값의 인덱스 리턴.
     * @param arr 정수 배열.
     * @return 배열 arr의 원소들 중 최솟값의 인덱스.
     * 최솟값이 여러개 있는 경우, 첫번째 최솟값의 인덱스.
     */
    public static int minAt(int[] arr) {
    	int min = arr[0];
    	int index = 0;
    	for (int i = 0; i < arr.length; i++) {
    		int x = arr[i];
    		if (min > x) {
    			min = x;
    			index = i;
    		}
    	}
    	return index;
    }

}
