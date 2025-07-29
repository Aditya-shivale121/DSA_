public class MaxsubArrsum2{
    public static int maxsum2(int arr[]){
        // create prefix arr
        int prefix[]= new int [arr.length];

        prefix[0]= arr[0];
        for(int i=1; i<arr.length; i++){
            prefix[i]= prefix[i-1]+ arr[i];
        }

        int maxsum = Integer.MIN_VALUE;

        // Calculate all subarrays
        for (int i = 0 ; i< arr.length; i++){
            for(int j=i ; j<arr.length;j++ ){
                int currsum = i == 0 ? prefix[j] : prefix[j] - prefix[i-1];

                if (maxsum < currsum){
                    maxsum  = currsum;
                }

            }
        }
        return maxsum;

    }
    public static void main(String[] args) {
        int num[]= {10,-5,6,-8,-9,15,25};
        System.out.println(maxsum2(num));
    }
}