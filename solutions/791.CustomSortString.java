public class Solution {
    public String customSortString(String order, String s) {
        // Step 1: Count occurrences of each character in s
        int[] count = new int[26]; // Assuming s consists of lowercase English letters
        for (char c : s.toCharArray()) {
            count[c - 'a']++;
        }
        
        StringBuilder result = new StringBuilder();
        
        // Step 2: Construct result based on the order
        for (char c : order.toCharArray()) {
            while (count[c - 'a'] > 0) {
                result.append(c);
                count[c - 'a']--;
            }
        }
        
        // Step 3: Add remaining characters not in order
        for (char c = 'a'; c <= 'z'; c++) {
            while (count[c - 'a'] > 0) {
                result.append(c);
                count[c - 'a']--;
            }
        }
        
        return result.toString();
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        String order = "cba";
        String s = "abcd";
        
        System.out.println(solution.customSortString(order, s));
        
    }
}
