class Solution {
    public int[] twoSum(int[] arr, int target) {
        int l=0, h=arr.length-1;

        while(l<h){
            // if(arr[h]>=target) h--;
            if(arr[l]+arr[h]==target) return new int[]{l+1, h+1};

            if(arr[l]+arr[h]>target) h--;
            else l++;
        }

        return new int[]{0,1};
    }
}
