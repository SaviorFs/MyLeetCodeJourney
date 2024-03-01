class Solution {
    public String maximumOddBinaryNumber(String s) {
        // Count the number of '1's in the string
        int onesCount = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '1') {
                onesCount++;
            }
        }
        
        if (onesCount == s.length()) {
            return s;
        }

        StringBuilder result = new StringBuilder();
        for (int i = 0; i < onesCount - 1; i++) {
            result.append('1');
        }
        
        for (int i = onesCount; i < s.length(); i++) {
            result.append('0');
        }
        
        result.append('1');
        
        return result.toString();
    }
}
