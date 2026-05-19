public class maxSubarray {
    public int maxSubarry(int[] arr){
        int CurrSum = arr[0];
        int maxSum = arr[0];
      for (int i=1;i<arr.length ; i++ ){
        CurrSum = Math.max(arr[i] , CurrSum + arr[i]);
        maxSum = Math.max(maxSum ,CurrSum);
      } 
      return maxSum;
        }
        public static void main (String[] args){
            maxSubarray obj = new maxSubarray();
            int[] arr={ -1 ,2,3,-5,6};
            int result = obj.maxSubarry(arr);
            System.out.println(result);
            
        }
    
}
