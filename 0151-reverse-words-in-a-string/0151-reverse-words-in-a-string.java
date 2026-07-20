class Solution {
    public String reverseWords(String s) {
        s = s.trim();

String[] words = s.split("\\s+");

String sb = "";

for(int i = words.length - 1; i >= 0; i--){
    sb += words[i];

    if(i != 0)
        sb+=" ";
}

return sb.toString();
        
    }
}