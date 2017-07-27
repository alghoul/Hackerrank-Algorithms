import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int [] count= new int[3];
        int arr[] = new int[n];
        for(int arr_i=0; arr_i < n; arr_i++){
            arr[arr_i] = in.nextInt();
            if(arr[arr_i]>0)
                count[0]++;
            if(arr[arr_i]<0)
                count[1]++;
            if(arr[arr_i]==0)
                count[2]++;
        }
        double result;
        for(int i=0; i<3;i++)
        {   
            result = Double.parseDouble(String.format("%.6f", (double)count[i]/n)); 
            System.out.println(result);            
        }
    }
}
