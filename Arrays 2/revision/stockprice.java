// You  are  given  an  array prices where prices[i] is  the  price  of  a  given  stock  on  the ith day.Return the maximum profit you can achieve from this transaction. If you cannot achieve any profit, return 0. Example 1:Input:prices = [7, 1, 5, 3, 6,  4]   Output:   5 Explanation:Buy on day 2 (price = 1) and sell on day 5 (price = 6), profit = 6-1 = 5. Note that buying on day 2 and selling on day 1 is not allowed because you must buy before you sell.Example 2:Input:Prices = [7, 6, 4,  3, 1]   Output:   0 Explanation:In this case, no transactions are done and the max profit = 0.Constraints:•1 <= prices . length <= 105•0   <= prices [ i ] <= 104


public class stockprice{
    public static int profit(int arr[]){
        int buyprice=Integer.MAX_VALUE;
        int maxprofit = 0 ;
        for(int i= 0; i < arr.length; i++){
            if(arr[i]< buyprice ){
                buyprice = arr[i];
            }
            int currproft = arr[i] - buyprice;
            maxprofit= Math.max(currproft,maxprofit);
        }
        return maxprofit;

    }
    public static void main(String[] args) {
        int prices[] ={7, 6, 4,  3, 1};
        System.out.println(profit(prices));
    }
}