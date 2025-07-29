public class kadane{
    public static int kadane(int arr[]){
        int ms = Integer.MIN_VALUE;
        int cs = 0;

        for(int i=0 ; i < arr.length; i++){
            cs += arr[i];
            if(cs < 0) cs = 0;
            ms = Math.max(cs, ms);
        }
        return ms;
    }
    public static void main(String[] args) {
         int num[]= {10,-5,6,-8,-9,15,25};
        System.out.println(kadane(num));
    }
}