import java.util.Arrays;

class Solution {
    public int bagOfTokensScore(int[] tokens, int power) {
        Arrays.sort(tokens); 
        int maxScore = 0, score = 0;
        int i = 0, j = tokens.length - 1;
        
        while (i <= j) {
            if (power >= tokens[i]) {
                power -= tokens[i++];
                maxScore = Math.max(maxScore, ++score);
            } else if (score > 0 && i != j) {
               
                power += tokens[j--];
                --score;
            } else {
               
                break;
            }
        }
        
        return maxScore;
    }
}
