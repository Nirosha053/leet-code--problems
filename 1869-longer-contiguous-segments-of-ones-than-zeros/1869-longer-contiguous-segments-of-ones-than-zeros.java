class Solution {
    public boolean checkZeroOnes(String s) {
        int maxOnes = 0, maxZeros = 0;
        int currentRun = 1;
        
        for (int i = 0; i < s.length(); i++) {
            if (i > 0 && s.charAt(i) == s.charAt(i - 1)) {
                currentRun++;
            } else {
                currentRun = 1;
            }
            
            if (s.charAt(i) == '1') {
                maxOnes = Math.max(maxOnes, currentRun);
            } else {
                maxZeros = Math.max(maxZeros, currentRun);
            }
        }
        
        return maxOnes > maxZeros;
    }
}