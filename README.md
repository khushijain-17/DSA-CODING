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
  
### 2. Sorting
```
class Solution {
public:
    bool hasDuplicate(vector<int>& nums) {
        sort(nums.begin(), nums.end());
        for (int i = 1; i < nums.size(); i++) {
            if (nums[i] == nums[i - 1]) {
                return true;
            }
        }
        return false;
    }
};

```
#### Time & Space Complexity
~~~

Time complexity: O(nlog⁡n)
Space complexity: O(1)O(1) or O(n)O(n) depending on the sorting algorithm.

~~~
### 3. Hash Set
```
class Solution {
public:
    bool hasDuplicate(vector<int>& nums) {
        unordered_set<int> seen;
        for (int num : nums) {
            if (seen.count(num)) {
                return true;
            }
            seen.insert(num);
        }
        return false;
    }
};
```
####  Time & Space Complexity
~~~
Time complexity: O(n)
Space complexity: O(n)
~~~



