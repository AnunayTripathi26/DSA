package Arrays;

public class LC121 {
    public static void main(String[] args) {
//        int arr[]={7,1,5,3,6,4};
//        int arr[]={7,6,4,3,1};
//        int arr[]={2,4,1,5};
        int arr[]={3,2,6,1,7};



        System.out.println(maxProfit(arr));

    }
    public static int maxProfit(int[] prices) {
        if(prices.length==1 || prices.length==0){
            return 0;
        }
        int buy=0;
        int sell=1;
        int SP=prices[1];
        int profit=0;

        while(sell<prices.length-1){
            if(prices[buy]>prices[sell] ){
                buy=sell;
                sell++;
                SP=prices[sell];
            }
            else{
                if(SP-prices[buy]>profit){
                    profit=SP-prices[buy];
                }
                sell++;
                if(prices[sell]>SP){
                    SP=prices[sell];
                }
            }

        }
        if(prices[prices.length-1]-prices[buy]>profit){
            return prices[prices.length-1]-prices[buy];
        }

        return profit;
    }
}
