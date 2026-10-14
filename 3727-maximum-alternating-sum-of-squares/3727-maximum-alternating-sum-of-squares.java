class Solution {
    public long maxAlternatingSum(int[] nums) {
        int len = nums.length;
        long[] arr = new long[len]; 
        
        for(int i=0;i<len;i++){
            arr[i] = (long) nums[i] * nums[i];
        }
        Arrays.sort(arr);
        long res[] = new long[len];

        long sum = 0; int right = len-1; int left = 0;
        for(int k=0;k<len;k++){
            if(k%2==0)
            res[k] = arr[right--];
            else res[k] = arr[left++];

        }
         for(int j=0;j<len;j++){
            if(j%2==0)
            sum += res[j];
            else sum -= res[j];
        }
        return sum;
    }
}