class Solution {
    public boolean divideArray(int[] nums) {
        int n=nums.length;
        if(n%2!=0){
            return false;
        }
        Arrays.sort(nums);
        for(int i=0;i<n;i=i+2){
            if(nums[i]!=nums[i+1]){
                return false;
            }
        }
        return true;
    }
}
