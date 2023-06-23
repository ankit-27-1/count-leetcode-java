class countNum {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int n=nums.length;
        int[] arr=new int[n];
        int k=0;
        int count=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(nums[i]>nums[j]){
                    count++;
                }
                arr[k]=count;
            }
            k++;
            count=0;

        }
        return arr;
    }
}
