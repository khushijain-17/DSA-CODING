class Solution {
    public int maxDepth(String s) {
    int cur_depth=0;
    int max_depth=0;
    for(char c : s.toCharArray()){
        if(c == '('){
            cur_depth++;
            max_depth = Math.max(cur_depth,max_depth);
        }
        else if(c == ')'){
            cur_depth--;
        }
    }
    return max_depth;    
    }
}