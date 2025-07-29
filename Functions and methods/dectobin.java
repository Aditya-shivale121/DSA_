public class dectobin{
    public static void decToBin(int no){
        int bin =0;
        int pow =0;
        while(no>0){
            int rem = no % 2 ;
            bin = bin + rem * (int)Math.pow(10 ,pow);
            pow++;
            no= no/2 ;

            
        }
        System.out.println("Binary form is: "+ bin);

    }


    public static void main(String[] args) {
        decToBin(11);
        
    }
}