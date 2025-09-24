class 34 {
    public int[] searchRange(int[] nums, int target) {
        int[] ans={-1,-1};
        ans[0]=findIndices(nums,target,true);
        if(ans[0]!=-1){
            ans[1]=findIndices(nums,target,false);
        }
        return ans;
    }

    public int findIndices(int[] arr, int target, boolean checker){
        int ans=-1;
        int start=0;
        int end=arr.length-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(arr[mid]<target){
                start=mid+1;
            }
            else if(arr[mid]>target){
                end=mid-1;
            }
            else{
                ans=mid;
                if(checker){
                    end=mid-1;
                }
                else {
                    start=mid+1;
                    }
            }
        }
        return ans;
    }
}
