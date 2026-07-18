class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> set = new HashSet <>();
        int len1 = nums1.length;
        int len2 = nums2.length;
        
        for(int i=0;i<len1;i++){
            for(int j=0;j<len2;j++){
                if(nums1[i] == nums2[j]){
                    set.add(nums1[i]);
                }
            }
        }   int[] result = new int[set.size()]; int i=0;
        for(int x: set)
        result[i++] = x;
    return result;
    }
}