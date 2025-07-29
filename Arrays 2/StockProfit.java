public class StockProfit{
    public static int profit(int price[]){
        int Buyprice = Integer.MAX_VALUE;
        int Maxprofit = 0 ;
    
        for(int i=0 ;i < price.length; i ++){


            if(Buyprice < price[i]  ) {
                int profit = price[i] - Buyprice;
                Maxprofit = Math.max(profit, Maxprofit);
            }else{
                Buyprice = price[i];
            }
            
            

          


        }
         
        return Maxprofit;
    }
     public static void main(String[] args) {
        int prices[]= {7,1,5,3,6,4}; 
        System.out.println(profit(prices));
    }
}