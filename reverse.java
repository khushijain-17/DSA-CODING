import java.util.Arrays;
public class reverse {
    public static void rev(int[] arr){
        int left = 0;
        int right = arr.length-1;
        while( left < right){
            int temp = arr[left];
            arr[left]=arr[right];
            arr[right]= temp;

        
        left++;
        right--;

    }}
    public static void main(String[] args){
        int[] arr ={2005,3,17};
        rev(arr);
        System.out.println(Arrays.toString(arr));
    }
    
}
