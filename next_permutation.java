import java.util.Arrays;
public class next_permutation {
    public void permute(int[] arr){
        int pivot= -1;
        for(int i=arr.length-2 ; i>=0 ; i--){
            if(arr[i] < arr[i+1]){
                 pivot =i;
                 break;

            }}

     if (pivot == -1){
        reverse( arr , 0 , arr.length-1);
        return;
    }
    for(int i = arr.length-1 ; i > pivot ;i --){
        if (arr[i]>arr[pivot]){
            int temp = arr[i];
            arr[i] = arr[pivot];
            arr [pivot] = temp;
            break;
        }}
        reverse (arr, pivot+1 , arr.length-1);
    }
    public void reverse(int[] arr, int start, int end){
        while(start<end){
            int temp = arr[start];
           arr[start] = arr[end];
            arr[end] = temp;
                start++;
                end--;
        }
    }
    public static void main (String[] args){
        int[] arr = {1,2,3,6,5,4};
        next_permutation obj = new next_permutation();
        obj.permute(arr);
        System.out.println(Arrays.toString(arr));


    }
}
