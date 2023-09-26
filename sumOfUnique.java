class Solution {
    public int sumOfUnique(int[] nums) {
        int n=nums.length;
        Arrays.sort(nums);
        int sum=0;
        if(n==1){
            return nums[0];
        }
        if(nums[0]!=nums[1]){
            sum=nums[0];
        }
        if(nums[n-1]!=nums[n-2]){
            sum=sum+nums[n-1];
        }
        for(int i=1;i<n-1;i++){
            if(nums[i]!=nums[i+1] && nums[i]!=nums[i-1]){
                sum=sum+nums[i];
            }
        }
        return sum;
    }
}
