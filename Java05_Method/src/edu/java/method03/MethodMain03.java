package edu.java.method03;

public class MethodMain03 {
    public static void main(String[] args) {
        // sum
    	int[] arr = {1, 2, 3};
    	System.out.println("sum = " + sum(arr));
    	
    	// mean
    	int[] arr2 = {4, 5, 6};
    	System.out.println("avg = " + mean(arr2));
    	
    	// max
    	int[] arr3 = {7, 8, 9};
    	System.out.println("max = " + max(arr3));
    	
    	// maxAt
    	int[] arr4 = {10, 11, 12, 12};
    	System.out.println(maxAt(arr4));
    	
    	// min
    	int[] arr5 = {13, 14, 15};
    	System.out.println(min(arr5));
    	
    	//minAt
    	int[] arr6 = {17, 16, 16, 18};
    	System.out.println(minAt(arr6));
    	

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
    	int sum = 0;
    	for (int x : arr) {
    		sum += x;
    	}
    	double avg = (double)sum / arr.length;
    	return avg;
    }
    
    /**
     * max
     * 정수 배열에서 최댓값을 찾아서 리턴.
     * @param arr 정수 배열.
     * @return 배열 arr의 원소들 중 최댓값. int
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
//    public static int maxAt(int[] arr) {
//    	int max = arr[0];
//    	for (int i = 0; i < arr.length; i++) {
//    		int x = arr[i];
//    		if ( max < x) {
//    			max = i;
//    		}
//    		
//    	}
//    	return max;
//    }

    
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
     * @return 배열 arr의 원소들 중 최솟값. int
     */
    public static int min(int[] arr) {
    	int min = arr[0];
    	for (int x : arr) {
    		if ( min > x) {
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
     * 최솟값이 여러개 있는 경우, 첫번째 최솟값의 인덱스. int
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
