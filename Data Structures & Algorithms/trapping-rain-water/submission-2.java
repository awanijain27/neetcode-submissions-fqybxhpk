class Solution {
    public int trap(int[] arr) {
        int maxi=0, maxj=0, i=0, j=arr.length-1, trw=0;

        // while(arr[i]<arr[i+1]) i++;
        // while(arr[j]<arr[j-1]) j--;

        while(i<j){
            if(arr[i]<=arr[j]){
                
                if(i<j && arr[i]>=maxi) maxi=arr[i];
                else trw+=maxi-arr[i];
                i++;
            }
            else{
                
                if(i<j && arr[j]>=maxj) maxj=arr[j];
                else trw+=maxj-arr[j];
                j--;
            }
        }

        return trw;
        
    }
}
