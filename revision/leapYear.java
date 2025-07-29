public class leapYear{
    public static boolean  isleapYear(int num){
        if((num % 4 == 0 && num % 100 != 0 ) || num % 400 == 0  ){
            return true;
            
        }
        return false;
    }
    public static void main(String[] args) {
        System.out.println(isleapYear(2000));
        
    }
}