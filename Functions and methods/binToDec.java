public class binToDec{
    public static void bintodec(int no){
        int myno =no;
        int pow = 0;
        int dec =0;
        while(no>0){
            int ld = no % 10;
            dec += ld*(int)Math.pow(2,pow);
            pow ++;
            no = no / 10 ;
        }
        System.out.println("Decimal form of "+myno+" is: "+dec);
        
     }
    public static void main(String[] args) {

        bintodec(111);       
     
    }
}