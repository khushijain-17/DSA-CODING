public class first {
    public int BinarySearch( int[] arr ,int target){
        int left = 0;
        int right= arr.length-1;
        while (left <= right){
          int mid = left + ( right - left ) / 2 ;
          if(arr[mid] == target){
            return mid;
          }
          else if ( arr[mid] < target){
            left = mid + 1;
          }
          else{
            right = mid - 1;
          }
          
        }
       return -1;
    }
 public static void main (String[] args){
    first obj = new first();
    int[] arr = {1,3,4,5,6};
    int target = 5;
    int result = obj.BinarySearch(arr , target);
    System.out.println(result);
 } 
}
       