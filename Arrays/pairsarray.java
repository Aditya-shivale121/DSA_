public class pairsarray{

    public static void pairsOf(int arr[]){
       int count = 0;
        for(int i = 0; i<arr.length; i++){
            for(int j= i+1; j<arr.length; j++){
                System.out.print("(" + arr[i] +"," + arr[j]+ ") ");
                count ++;
            }
        System.out.println();
       

        } 
         System.out.println("No of pairs are: "+ count);
    }
    // practice
    public static void pairs(int arr[]){

        for(int i =0 ; i<arr.length; i++){
            for (int j = i ; j < arr.length; j++){
                System.out.print("("+arr[i]+","+arr[j]+")");
            }
            System.out.println("");
        }
    }


    public static void main(String[] args) {
        int arr[]= {1 , 4 , 3 ,8 ,5};

       // pairs(arr);
        pairsOf(arr);
    }

}