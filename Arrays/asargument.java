import java.util.*;

public class asargument{
    public static void update(int marks[], int nonChangable){
        nonChangable = 10;
        for(int i=0 ; i<marks.length; i++){
            marks[i] = marks[i] + 1  ;
            }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int marks[]={96,97,98,99};
        int nonChangable = 5;

        update(marks, nonChangable);

        for(int i = 0; i <marks.length; i++){
            System.out.println(marks[i]);
        }

        System.out.println( nonChangable );

    }
}