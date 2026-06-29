class Solution {
    public boolean squareIsWhite(String coordinates) {
        char c = coordinates.charAt(0);  
        char r = coordinates.charAt(1);  
        
        if (c % 2 == 0 && r % 2 == 1) return true;  
        if (c % 2 == 1 && r % 2 == 0) return true;  
        
        return false;
    }
}