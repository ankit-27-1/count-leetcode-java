class Solution {
    public char repeatedCharacter(String s) {
        int[] arr=new int[s.length()];
        for(int i=0;i<s.length();i++){
            for(int j=0;j<s.length();j++){
                if(arr[j]==s.charAt(i)){
                    return s.charAt(i);
                }
            }
            arr[i]=s.charAt(i);
        }
        return 'a';
    }
}
