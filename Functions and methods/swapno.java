import java.util.*;

public class swapno {
    public static void swapNo(int a, int b) {
        int temp = a;
        a = b;
        b = temp;
        System.out.println("a, b = " + a + ", " + b);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        swapNo(5, 6);
    }
}