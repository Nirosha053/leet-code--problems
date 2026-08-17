class Solution {
   public static int reverse(int n){
    int rev=0,r;
    while(n!=0){
        r=n%10;
        rev=rev*10+r;
        n/=10;
    }
    return rev;
   }
    public boolean sumOfNumberAndReverse(int num) {
        for(int i=0;i<=num;i++){
            if(i+reverse(i)==num){
                return true;
            }
        }
        return false;
    }
}