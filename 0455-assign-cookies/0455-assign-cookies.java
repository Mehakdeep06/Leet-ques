class Solution {
    public int findContentChildren(int[] g, int[] s) {
        int len1 = g.length;
        int c=0;
        int k=0;
        int len2 = s.length;
       
        Arrays.sort(g); Arrays.sort(s);
        for(int i=0;i<len1;i++){
            for(int j=k;j<len2;j++){
                if(g[i] <= s[j]){
                    c++;
                    k =j+1; 
                     break;
                }

            }
        }
        return c;
    }
}