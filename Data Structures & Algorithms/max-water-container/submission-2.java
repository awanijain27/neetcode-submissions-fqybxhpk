class Solution {
    public int maxArea(int[] arr) {
        int i=0, j=arr.length-1, vol=0, ml=0;
        while(i<j){
            vol=Math.min(arr[i], arr[j]) * (j-i);
            if(ml<vol) ml=vol;

            if(arr[i]<arr[j]){
                i++;
            }
            else if(arr[j]<arr[i]){
                j--;
            }
            else{
                if(arr[i+1]>arr[j-1]) i++;
                else j--;
            }
            

        }

        return ml;
    }
}
