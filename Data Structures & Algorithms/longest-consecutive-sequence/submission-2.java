class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length==0) return 0;
        Set<Integer> set=new HashSet<>();
        for(int i:nums){
            set.add(i);
        }
        int len=1, ml=1;
        for(int i=0; i<nums.length; i++){
            int x=nums[i];
            if(set.contains(x-1)) continue;

            while(set.contains(x+1)){
                len++;
                x++;
            }

            if(ml<len) ml=len;
            len=1;
        }

        return ml;
    }
}
