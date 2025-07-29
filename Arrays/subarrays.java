
public class subarrays {

    public static void subarr(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            // System.out.println("1");
            for (int j = i; j < arr.length; j++) {

                for (int k = i; k <= j; k++) {
                    System.out.print(arr[k] + " ");
                }
                  System.out.println("");
            }
          
        }
    }

    public static void main(String[] args) {

        int nums[] = {1, 2, 3, 4, 5, 6};
        subarr(nums);

    }

}
