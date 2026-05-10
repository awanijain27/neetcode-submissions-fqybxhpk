class Solution {
    public int[] productExceptSelf(int[] nums) {
        int prod=1, cnt=0;
        for(int i:nums){
            if(i==0) cnt++;
            else prod*=i;
        }

        if(cnt>1){
            for(int i=0; i<nums.length; i++){
                nums[i]=0;
            }
            return nums;
        }

        for(int i=0; i<nums.length; i++){
            if(nums[i]==0) nums[i]=prod;
            else{
                if(cnt==1) nums[i]=0;
                else nums[i]=prod/nums[i];
            }
        }

        return nums;
    }
}  
