class Solution {
    public boolean isHappy(int n) {
        Set<Integer> seen = new HashSet<>();
      while (n!=1 && !seen.contains(n)){
        seen.add(n);
        n = getnext(n);
      }  
      return n == 1;
    }
    static int getnext(int n){
        int sum =0;
        while(n>0){
            int last_digit = n%10;
            sum = sum+(last_digit*last_digit);
            n= n/10;

        }
        return sum;
    }
}