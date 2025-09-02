class RichestCustomerWealth {      //Q.1672
    public static int maximumWealth(int[][] accounts) {
        int sum=0;
        int max=0;
        for(int i=0;i<accounts.length;i++){
            for(int j=0;j<accounts[i].length;j++){
            sum=sum+accounts[i][j];
            }
            if (max<sum){
                max=sum;
            }
            sum=0;
        }
        return max;
    }
    public static void main(String args[]){
        int[][] accounts={
            {4,7,29},
            {12,47,38,29},
            {18,39}
        };
        maximumWealth(accounts); 
    }
}
