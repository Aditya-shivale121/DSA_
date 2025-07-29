
public class countingSort {

    public static void countingSort(int arr[]) {
        int largest = Integer.MIN_VALUE;
        // store largest element
        for (int i = 0; i < arr.length; i++) {
            largest = Math.max(largest, arr[i]);
        }
        // count frequency ;
        int count[] = new int[largest + 1];
        for (int i = 0; i < arr.length; i++) {
            count[arr[i]]++;

        }
        // buid arr

        int j = 0;
        for (int i = 0; i < count.length; i++) {
            while (count[i] > 0) {
                arr[j] = i;
                j++;
                count[i]--;
            }

        }

    }

    public static void print(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

           

    
    }
    public static void cs(int arr[]) {
        int lar = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            lar = Math.max(lar, arr[i]);
        }

        int count[] = new int[lar+1];
        for(int i=0 ; i<arr.length; i++){
            count[arr[i]]++;
        }

        int j = 0;
        for(int i = 0 ; i < count.length; i++){
            while (count[i]> 0){
                arr[j] = i;
                
                count[i] -- ;
                j++;
            }
        }
    }

    public static void main(String[] args) {
        int nums[] = {5, 6, 6, 1, 2, 2, 4};
        cs(nums);
        print(nums);

    }
}
