// Write a Java program to check if a number is a palindrome inJava? (121 is a palindrome, 321 is not)

public class palidrome{

    public static void isPalidrome(int no){
        boolean palidrome = true;
        int a =no;
        int newNum =0;
        while(no>0){
            int ld = no % 10;
            newNum = (newNum*10) + ld;
            no= no/10;

        }
        if(newNum != a){
            palidrome = false;
        }

        System.out.println(palidrome);

    }
    public static void main(String[] args) {
        isPalidrome(101);
        
    }

}