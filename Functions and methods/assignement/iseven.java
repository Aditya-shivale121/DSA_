// Write a method named isEven that accept san intargument.The method should return true if the argument iseven ,or false otherwise .Also write a program to test your method.

public class iseven{

    public static void isEven(int no){
        boolean isEven = true;
        if (no % 2 == 1){
            isEven = false;
        }
        System.out.println(isEven);


    }
    public static void main(String[] args) {
        
        isEven(1);

    }
}