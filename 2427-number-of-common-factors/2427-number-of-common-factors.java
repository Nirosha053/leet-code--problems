class Solution {
    public int commonFactors(int a, int b) {
        int g = gcd(a, b);
        int count = 0;
        for (int i = 1; i <= g; i++) {
            if (g % i == 0) count++;
        }
        return count;
    }
    
    private int gcd(int a, int b) {
        return b == 0 ? a : gcd(b, a % b);
    }
}