class Solution {
    public int[] plusOne(int[] digits) {
        int n = digits.length;
        
        // Loop from the last digit to the first digit
        for (int i = n - 1; i >= 0; i--) {
            // If the digit is less than 9, add 1 and return immediately
            if (digits[i] < 9) {
                digits[i]++;
                return digits;
            }
            // If the digit is 9, it becomes 0
            digits[i] = 0;
        }
        
        // If all digits were 9, create a new array with a leading 1
        int[] result = new int[n + 1];
        result[0] = 1;
        return result;
    }
}
