public class sorting{
    public static void bubbleSort(int arr[]){
        for(int i= 0; i<arr.length-1; i++){
            boolean swap = false;
            for(int j=0; j<arr.length-1-i;j++){
                
                if(arr[j]<arr[j+1]){
                    int temp = arr[j];
                    arr[j]= arr[j+1];
                    arr[j+1] = temp;
                    swap = true;
                } 
             

            }
               if (! swap) break; 
            
        }
    }

    public static void selectionSort(int arr[]){
        for(int i=0;i < arr.length-1; i++ ){
            int maxPos= i;
            for(int j = i+1 ;j< arr.length; j++){
                if(arr[maxPos]>arr[j]){
                maxPos = j;
                }
            } 
            int temp = arr[maxPos];
            arr[maxPos]= arr[i];
            arr[i] = temp;
        }
    }
     public static void print(int arr[]){
        for(int i = 0; i < arr.length ; i++){
            System.out.print(arr[i]+" ");
        }
     }
    public static void main(String[] args) {
        int nums[] = {3,2,1};
    selectionSort(nums);
        print(nums);
    }
}