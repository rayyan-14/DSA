class SortColors {
    public static void sortColors(int[] nums) {
        boolean swapped;
        for(int i=0; i<nums.length;i++){
            swapped=false;
            for(int j=1; j<nums.length;j++){
                if(nums[j]<nums[j-1]){
                    int temp=nums[j];
                    nums[j]=nums[j-1];
                    nums[j-1]=temp;
                }
                 swapped=true;
            }
            if(!swapped){
                break;
            }
           
        }
    }
    public static void main(String args[]){
        int[] nums={2,0,2,1,1,0};
        sortColors(nums);
    }
}
