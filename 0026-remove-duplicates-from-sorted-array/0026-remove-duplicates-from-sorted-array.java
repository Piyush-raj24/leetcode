class Solution {
    public int removeDuplicates(int[] nums) {
        // Edge case: If the array is empty, there are 0 unique elements.
        if (nums.length == 0) {
            return 0;
        }
        
        // 'insertIndex' tracks the position where the next unique element should be written.
        // The first element (index 0) is always unique, so we start writing from index 1.
        int insertIndex = 1; 
        
        // Loop through the array starting from the second element (index 1)
        for (int i = 1; i < nums.length; i++) {
            // If the current element is different from the previous one, it's unique
            if (nums[i] != nums[i - 1]) {
                nums[insertIndex] = nums[i]; // Move the unique element forward
                insertIndex++;               // Move the insertion pointer
            }
        }
        
        // 'insertIndex' represents the total count of unique elements
        return insertIndex;
    }
}
