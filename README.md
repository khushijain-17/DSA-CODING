# DSA-CODING
## Solving DSA questions
*Given an integer array nums, return true if any value appears more than once in the array, otherwise return false.*
### 1. Brute Force
```
class Solution {
public:
    bool hasDuplicate(vector<int>& nums) {
        for (int i = 0; i < nums.size(); i++) {
            for (int j = i + 1; j < nums.size(); j++) {
                if (nums[i] == nums[j]) {
                    return true;
                }
            }
        }
        return false;
    }
};

```
### Time & Space Complexity
~~~
  Time complexity: O(n^2)
  Space complexity: O(1)
~~~
  
