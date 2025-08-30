class RunningSum {
    public static int[] runningSum(int[] nums) {
        int sum=0;
        for(int i=0;i<nums.length;i++){
            sum=sum+nums[i];
            nums[i]=sum;
        }
        return nums;
    }
    public static void main(String args[]){
        Scanner in= new Scanner(System.in);
        int[] nums=new int[1000];
        
        for(int i=0; i<nums.length;i++){
            nums[i]=in.nextInt();
        }
        runningSum(nums);
    }
}
