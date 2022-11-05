package fundamentals.tasks01;

/*
An element is called a peak element if its value is not smaller than the value of its adjacent elements(if they exist).
Given an array arr[] of size N, Return the index of any one of its peak elements.
Note: The generated output will always be 1 if the index that you return is correct. Otherwise, output will be 0.
 */
public class Task32 {
    int peakElement(int[] arr, int n) {
        // Your code here
        int result = 0;
        for (int i = 0; i < n; i++) {
            if (arr[0] > arr[1]) {
                break;
            } else if (i > 0 && arr[i] > arr[i - 1] && arr[i] > arr[i + 1]) {
                result = i;
                break;
            } else if (i == n - 1 && arr[n - 1] > arr[n - 2]) {
                result = n - 1;
                break;
            }
        }
        return result;
    }
}
