class Solution {
    public int strStr(String haystack, String needle) {
        // Edge case: if needle is empty, return 0 (as per LeetCode instructions)
        if (needle.length() == 0) return 0;
        
        int n = haystack.length();
        int m = needle.length();
        
        // If needle is longer than haystack, it can't be a substring
        if (m > n) return -1;
        
        // Iterate only up to the point where the needle can still fit
        for (int i = 0; i <= n - m; i++) {
            int j = 0;
            
            // Check character by character match
            while (j < m && haystack.charAt(i + j) == needle.charAt(j)) {
                j++;
            }
            
            // If the entire needle matches, return the start index
            if (j == m) {
                return i;
            }
        }
        
        return -1;
    }
}
