package Section_two_Basic_DSA.Searching;

public class SquareRoot {

    static long  findSquareRoot(long  n){

        for(int i=0;i<n;i++){   
        if(i*i == n) return i;  
        if(i*i > n){      
           square(n, i-1, i);
        }  
    }
        return 0;
    }

    static double square(long n,double low, double high){
        double mid = (low+high)/2;
        if(mid*mid == n) return mid;

        if(mid*mid > n) {
            return square(n, low, mid);
        }
      
        return square(n, mid, high);
    }

    public static void main(String args[]){
        System.out.println(findSquareRoot(144));
    }
}
