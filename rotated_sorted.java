public class rotated_sorted {
    public int rotate(int[] arr ,int target){
        int start= 0;
        int end = arr.length-1;
        int ans = 0;
        while (start <= end){
           int mid = start+(end-start)/2;
            if(target == arr[mid]){
            return mid;
           }
           //left side is sorted
           if (arr[start] <= arr[mid]){
              if (target >= arr[start] && target < arr[mid]){
                end = mid -1;
              }
              else {
                start= mid+1;
              }
            }
            else {
                if(target >arr[mid] && target <= arr[end]){
                    start =mid +1 ;
                }
                else {
                    end = mid-1;
                }
            }
           } return ans;
        
        }
        public static void main(String[] args){
            int[] arr ={4,5,6,7,0,1,2,3};
            int target = 0;
            rotated_sorted obj = new rotated_sorted(); 
            int result = obj.rotate(arr,target);
            System.out.println(result);
        }
    }

    

