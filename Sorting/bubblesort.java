

public class bubblesort{
    public static void bubblesort(int arr[]){
        int count =0;
        for(int i=0 ; i< arr.length - 1 ; i++){
            boolean swaped = false;
            for( int j =0 ; j< arr.length - i-1 ; j++){
                if(arr[j]> arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1]= temp;
                    swaped = true;
                    count ++;
                }

            }
            if (!swaped){
                break;
            }
            

        }
        System.out.println(count);
    }

    public static void print(int arr[]){
        for(int i =0 ; i < arr.length ; i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
        int nums[] ={1,42,3};
        bubblesort(nums);
        print(nums);
        
    }
}