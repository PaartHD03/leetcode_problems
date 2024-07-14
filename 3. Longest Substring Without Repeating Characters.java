class Solution {
    public int lengthOfLongestSubstring(String s) {
        
        Set<Character> set = new HashSet<>();
        int left = 0;  // Left pointer of the window
        int right = 0; // Right pointer of the window
        int maxLength = 0;

        // Slide the window [left, right]
        while (right < s.length()) {
            char currentChar = s.charAt(right);
            // If the current character is already in the set, remove characters from the left
            while (set.contains(currentChar)) {
                set.remove(s.charAt(left));
                left++;
            }
            // Add the current character to the set and update maxLength if needed
            set.add(currentChar);
            maxLength = Math.max(maxLength, right - left + 1);
            right++;
        }

        return maxLength;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();

        // Test cases
        String s1 = "abcabcbb";
        System.out.println("Length of longest substring without repeating characters: " + solution.lengthOfLongestSubstring(s1)); // Output: 3

        String s2 = "bbbbb";
        System.out.println("Length of longest substring without repeating characters: " + solution.lengthOfLongestSubstring(s2)); // Output: 1

        String s3 = "pwwkew";
        System.out.println("Length of longest substring without repeating characters: " + solution.lengthOfLongestSubstring(s3)); // Output: 3
    }
}
