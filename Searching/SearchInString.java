class SearchInString {
    public static int strStr(String haystack, String needle) {
        int n=haystack.length();
        int m=needle.length();
      for(int i=0; i<=n-m;i++){
        if(haystack.substring(i,i+m).equals(needle)){
            return i;
        }

      }  return -1;
    }
    public static void main(String args[]){
        Scanner in=new Scanner(System.in);
        String haystack=in.next();
        String needle=in.next();
        System.out.println(strStr(haystack,needle));
    }
}
