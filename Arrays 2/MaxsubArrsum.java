public class MaxsubArrsum{
    public static int maxsum(int arr[]){
    
       int maxsum=Integer.MIN_VALUE;
       for(int i=0 ; i< arr.length; i++){
        for(int j=i; j<arr.length;j++){
            int currsum = 0;
            for(int k= i;k<=j;k++){
              currsum += arr[k];
              System.out.println("currsum is "+ currsum);
            }
              if(maxsum < currsum){
                    maxsum = currsum;
                }
        }
       }
       return maxsum;
    }
    public static void main(String[] args) {
        int num[]= {10,-5,6,-8,-9,15,25};
        System.out.println(maxsum(num));
    }
}