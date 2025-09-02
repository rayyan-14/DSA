class BuildArrayFromPermutation {   // Q.1920
    
    public static int[] buildArray(int[] nums) {
        int ans[]=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            ans[i]=nums[nums[i]];
        }
        return ans;
    }
        
    public static void main(String args[]){
        Scanner in=new Scanner(System.in);
        int[] nums= new int[1000];
        System.out.print("nums = ");
        for(int i=0; i<1000; i++){
            nums[i]=in.nextInt();
        }
        buildArray(nums);
    }
    }
