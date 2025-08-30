class Solution {
    public static int strStr(String haystack, String needle) {
      for(int i=0; i<haystack.length();i++){
        if(haystack.charAt(i)==needle.charAt(i)){
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
