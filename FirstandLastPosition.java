public class FirstandLastPosition {
    // 34. Find First and Last Position of Element in Sorted Array

    // Given an array of integers nums sorted in non-decreasing order, find the
    // starting and ending position of a given target value.

    // If target is not found in the array, return [-1, -1].

    // You must write an algorithm with O(log n) runtime complexity.

    // Example 1:

    // Input: nums = [5,7,7,8,8,10], target = 8
    // Output: [3,4]
    // Example 2:

    // Input: nums = [5,7,7,8,8,10], target = 6
    // Output: [-1,-1]
    // Example 3:

    // Input: nums = [], target = 0
    // Output: [-1,-1]

    public static void main(String[] args) {
        int[] arr = { 5, 6, 7, 7, 7, 7, 7, 8, 8, 10, 12 };
        int target = 7;

        FirstandLastPosition obj = new FirstandLastPosition();
        int[] ans = obj.searchRange(arr, target);

        System.out.println("First Position: " + ans[0]);
        System.out.println("Last Position: " + ans[1]);
    }

    public int[] searchRange(int[] arr, int target) {
        int[] result = { -1, -1 };

        result[0] = findFirst(arr, target);
        result[1] = findLast(arr, target);

        return result;
    }

    // Binary search for first occurrence
    public int findFirst(int[] arr, int target) {
        int start = 0, end = arr.length - 1;
        int ans = -1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] == target) {
                ans = mid; // store answer
                end = mid - 1; // move left
            } else if (arr[mid] < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return ans;
    }

    // Binary search for last occurrence
    public int findLast(int[] arr, int target) {
        int start = 0, end = arr.length - 1;
        int ans = -1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] == target) {
                ans = mid; // store answer
                start = mid + 1; // move right
            } else if (arr[mid] < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return ans;
    }
}
