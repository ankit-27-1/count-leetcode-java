class Solution {
    public boolean halvesAreAlike(String s) {
        int n=s.length();
        int count1=0;
        int count2=0;
        for(int i=0;i<(n/2);i++){
            if(Character.toLowerCase(s.charAt(i))=='a' || Character.toLowerCase(s.charAt(i))=='e' || Character.toLowerCase(s.charAt(i))=='i' || Character.toLowerCase(s.charAt(i))=='o' || Character.toLowerCase(s.charAt(i))=='u') {
                count1++;
            }
        }
        for(int i=(n/2);i<n;i++){
            if(Character.toLowerCase(s.charAt(i))=='a' || Character.toLowerCase(s.charAt(i))=='e' || Character.toLowerCase(s.charAt(i))=='i' || Character.toLowerCase(s.charAt(i))=='o' || Character.toLowerCase(s.charAt(i))=='u') {
                count2++;
            }
        }
        if(count1==count2){
            return true;
        }
        return false;
    }
}
