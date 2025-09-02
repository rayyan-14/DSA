class EvenNumberOfDigits {     //Q.1295
    public static int findNumbers(int[] arr) {
        int count=0;
        for(int i=0;i<arr.length;i++){
            if(even(arr[i])){
                count++;
            }
        }
        return count;
    }

    public static boolean even(int arr) {
        int nofDigits=Digits(arr);
        if(nofDigits%2==0) {
            return true;
        }
        return false;
    }
    public static int Digits(int arr){
       int count=0;
        while(arr>0){
            count++;
            arr=arr/10;

        }
        return count;

    }
   public static void main(String[] args) {
        int[] arr={123, 113, 1467, 1, 1347, 1637, 123, 1456};
        System.out.println(findNumbers(arr));
    }
}
