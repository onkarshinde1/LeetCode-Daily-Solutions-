public class EvenNumberDigitsinArr {

    // 1295. Find Numbers with Even Number of Digits

    // Given an array nums of integers, return how many of them contain an even
    // number of digits.

    // Example 1:
    // Input: nums = [12,345,2,6,7896]
    // Output: 2
    // Explanation:
    // 12 contains 2 digits (even number of digits).
    // 345 contains 3 digits (odd number of digits).
    // 2 contains 1 digit (odd number of digits).
    // 6 contains 1 digit (odd number of digits).
    // 7896 contains 4 digits (even number of digits).
    // Therefore only 12 and 7896 contain an even number of digits.
    
    // Example 2:
    // Input: nums = [555,901,482,1771]
    // Output: 1
    // Explanation:
    // Only 1771 contains an even number of digits.

    public static void main(String[] args) {
        int[] nums = { 12, 345, 2, 6, 7896, 7667, 854, 33446, 767563, 45675683 };

        int solution = evenDigit(nums);
        System.out.println("The even count numbers in array is " + solution + ".");
    }

    public static int evenDigit(int[] nums) {
        int count = 0;
        for (int num : nums) {
            int digits = countDigit(num);
            if (digits % 2 == 0) {
                count++;
            }
        }
        return count;
    }

    public static int countDigit(int num) {
        int digit = 0;
        while (num > 0) {
            digit++;
            num = num / 10;
        }
        return digit;
    }
}
