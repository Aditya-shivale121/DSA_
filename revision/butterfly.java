public class butterfly{
    public static void main(String[] args) {
        int num = 4;
        for(int i=1; i<= num ; i++){
            for(int j=1;j<=i;j++){
                System.out.print(j);
            }
            for(int j=1; j<=2*(num-i); j++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print(j);
            }
            System.out.println();
        }
        for(int i=num; i>= 1 ; i--){
            for(int j=1;j<=i;j++){
                System.out.print(j);
            }
            for(int j=1; j<=2*(num-i); j++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
}