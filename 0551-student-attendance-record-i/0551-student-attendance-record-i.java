class Solution {
    public boolean checkRecord(String s) {
        boolean rew = true;
      char[] arr = s.toCharArray();
      int len = arr.length;
     int counta = 0;
      for(int i=0;i<len;i++){
        if(arr[i] == 'A'){
            counta++;
            if(counta > 1){
                rew = false;
                break;
            }


        }
        if(i<=len-3){
            if(arr[i] == 'L' && arr[i+1] == 'L' && arr[i+2] == 'L'){
                rew = false;
                break;
            }
        }
      }
      return rew;

    }
}