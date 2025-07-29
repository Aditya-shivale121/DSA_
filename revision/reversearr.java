


public class reversearr{
    public static void ReverseArr(int arr[]){
        int start = 0;
        int end = arr.length-1;
        while(start < end){
            int temp = arr[start];
            arr [start]= arr[end];
            arr[end]= temp;

            start ++;
            end --;
        }
       
    }
    public static void main(String[] args) {
        int num[] = {12,10,8,8,6,4};

        ReverseArr(num);
        for(int i = 0; i< num.length;i++){
            System.out.println(num[i]);

        }
       
        
    }
}