import java.util.ArrayList;
import java.util.Collections;
public class chocolate {
    public long choc (ArrayList <Integer> a, int n , int m){
        if (a.isEmpty()){
            return 0 ;
        }
        Collections.sort(a);
        long res = Long.MAX_VALUE;
        for(int i=0 ; i<n-m+1;i++){
            int min_val = a.get(i);
            int max_val = a.get(i+m-1);
            res = Math.min(res , max_val-min_val);
        }
        return res;

    }
    public static void main(String[] args){
       int n = 7;
       int m = 5;
       ArrayList <Integer> a = new ArrayList<>();
       a.add(1);
       a.add(5);
       a.add(7);
       a.add(3);
       a.add(6);
       a.add(4);
       a.add(9);
     chocolate obj = new chocolate();
       long result = obj.choc(a,n,m);
       System.out.println(result);
       



    }
    
}
