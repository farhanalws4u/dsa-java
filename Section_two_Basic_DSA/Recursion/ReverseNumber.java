package Recursion;

import java.util.*;

public class ReverseNumber {

    static int reverse(int num,int res){
        if(num ==0) return res;

        int rem =  num % 10;
        res = res*10 + rem;
        num = num /10;

        return reverse(num, res);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        System.out.println(reverse(num, 0));
        sc.close();
    }
}
