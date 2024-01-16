import java.util.HashSet;

public class SubArrayWithZeroSum {   // tc O(n^2)

        static boolean findZeroSumNaive(int arr[]){
        int sum = 0;
         
        for(int i=0;i<arr.length;i++){
            for(int j=i;j<arr.length;j++){
                sum = sum + arr[j];
                if(sum==0) return true;
            }
        }
        return false;
    }

    static boolean fintZeroSumEfficient(int arr[]){
        
        HashSet<Integer> h = new HashSet<>();

        int preSum = 0;

        for(int i=0;i<arr.length;i++){

            preSum = preSum + arr[i];

            if(h.contains(preSum)) return true;

            if(preSum == 0) return true;

            h.add(preSum);

        }

        return false;
    }

    public static void main(String[] args) {
         int arr[] =  {2,3,-2,-3,5,6};
        // System.out.println( findZeroSumNaive(arr));
        System.out.println( fintZeroSumEfficient(arr));

    }
}