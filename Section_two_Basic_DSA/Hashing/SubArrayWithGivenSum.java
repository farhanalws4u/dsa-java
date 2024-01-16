import java.util.HashSet;

public class SubArrayWithGivenSum {

    static boolean findGivenSumNaive(int arr[]){

        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length;j++){
                
            }
        }

        return false;
    }

    static boolean findGivenSumEfficient(int arr[],int GivenSum){
        
        HashSet<Integer> preSet = new HashSet<Integer>();
        int preSum = 0;
        for(int i=0;i<arr.length;i++){
            preSum = preSum + arr[i];
            // preSum = SumInHash + givenSum
            // check if sumInHash = preSum - givenSum
            if(preSet.contains(preSum - GivenSum)) return true;

            if(preSum == GivenSum) return true;

            preSet.add(preSum);

        }
        
        return false;
    }
    // added test comment for stash testing again adn again.
    public static void main(String args[]){
        int arr[] = {5,8,6,13,3,-1};
        System.out.println(findGivenSumNaive(arr)); 
    }
}
