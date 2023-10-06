 class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        char[] arr1=new char[ransomNote.length()];
        char[] arr2=new char[magazine.length()];
        for(int i=0;i<ransomNote.length();i++){
            arr1[i]=ransomNote.charAt(i);
        }
        for(int i=0;i<magazine.length();i++){
            arr2[i]=magazine.charAt(i);
        }
        for(int i=0;i<magazine.length();i++){
            for(int j=0;j<ransomNote.length();j++){
                if(arr1[j]==arr2[i]){
                    arr2[i]='1';
                    arr1[j]='1';
                }
            }
        }
        for(int i=0;i<ransomNote.length();i++){
            if(arr1[i]!='1'){
                return false;
            }
        }
        return true;
    }
}
