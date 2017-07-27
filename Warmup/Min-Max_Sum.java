import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long[] arr = new long[5];
        long min;
        long max;
        min=Integer.MAX_VALUE;
        max=Integer.MIN_VALUE;        
        int max_i = 0;
        int min_i = 0;
        long sum_min=0;
        long sum_max=0;
        for(int arr_i=0; arr_i < 5; arr_i++){
            arr[arr_i] = in.nextInt();
            if(arr[arr_i]>max)
            {
                max=arr[arr_i];
                max_i = arr_i;
//                System.out.println(max);
                
            }
            
            if(arr[arr_i]<min)
            {
                min=arr[arr_i];
                min_i = arr_i;
//                System.out.println(min);
                
            }            
        }
        for(int i=0;i<5;i++)
        {
            if(i!=max_i)
                sum_min+=arr[i];
            if(i!=min_i)
                sum_max+=arr[i];
        }
        System.out.println(sum_min +" " +sum_max);
    }
}

