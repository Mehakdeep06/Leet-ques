class Solution {
    public void rotate(int[] nums, int k) {
      
        int l=nums.length;
          k =k%l;
        int j=0;
        int[] result=new int[l];
    
        for(int i=l-k;i<=l-1;i++){
            result[j++]=nums[i];
        }
         for(int i=0;i<l-k;i++){
            result[j++]=nums[i];
        }
        for(int i=0;i<l;i++){
            nums[i]=result[i];
        }
        
            
        


    }
}