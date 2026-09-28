class Solution {
    public int nthUglyNumber(int n) {
        int[] ugly = new int[n];
        ugly[0] = 1; // 1 is the first ugly number

        // Pointers for 2, 3, and 5
        int p2 = 0, p3 = 0, p5 = 0;

        for (int i = 1; i < n; i++) {
            // Next candidate values
            int next2 = ugly[p2] * 2;
            int next3 = ugly[p3] * 3;
            int next5 = ugly[p5] * 5;

            // Pick the minimum among candidates
            int nextUgly = Math.min(next2, Math.min(next3, next5));
            ugly[i] = nextUgly;

            // Advance the pointer(s) that produced the minimum value
            if (nextUgly == next2) p2++;
            if (nextUgly == next3) p3++;
            if (nextUgly == next5) p5++;
        }

        return ugly[n - 1];
    }
}