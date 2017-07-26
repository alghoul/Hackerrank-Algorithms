import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int sum_d1=0;
        int sum_d2=0;
        int diff=0;
        int a[][] = new int[n][n];
        for(int a_i=0; a_i < n; a_i++){
            for(int a_j=0; a_j < n; a_j++){
                a[a_i][a_j] = in.nextInt();
                if(a_i==a_j)
                sum_d1 +=a[a_i][a_j];  
                if((a_i+a_j) == n-1)
                sum_d2 +=a[a_i][a_j]; 
            }
        }
        diff = Math.abs(sum_d2-sum_d1);
        System.out.println(diff);
    }
}

