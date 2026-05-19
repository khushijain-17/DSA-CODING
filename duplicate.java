import java.util.HashSet;
import java.util.Set;

public class duplicate {
    public static boolean dupli(int[] nums){
        Set<Integer> set = new HashSet<>();

        for (int num : nums){
            if (set.contains(num)){
                return true;
            }
            set.add(num);
        }
            return false;
           }

    
    public static void main(String[] args){
        int[] nums ={1,2,3,3,4,4};
        boolean result = dupli(nums);
        System.out.println(result);    }
    
}
