class Solution {
    public String reverseVowels(String s) {
        ArrayList<Character> list = new ArrayList<>();
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if(ch == 'a' || ch == 'e'  || ch == 'i' || ch == 'o'
            || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I' 
            || ch == 'O' || ch == 'U' ){
                list.add(ch);
            }

        }   
        int k=0;
        Collections.reverse(list);
        char arr[] = s.toCharArray();
        for(int j =0;j<arr.length;j++){
             char ch = s.charAt(j);
            if(ch == 'a' || ch == 'e'  || ch == 'i' || ch == 'o'
            || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I' 
            || ch == 'O' || ch == 'U' ){
                arr[j] = list.get(k++);
            }
        }
        return new String (arr);
    }
}