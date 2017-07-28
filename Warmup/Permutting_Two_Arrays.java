import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
                Scanner scan = new Scanner(System.in);
                int query = scan.nextInt();
                int n, k;
                while(scan.hasNext())
                {
                n=scan.nextInt();
                k=scan.nextInt();
                scan.nextLine();
                int fact =1;    
               // System.out.print(n+" "+k+" ");    
                int line=0;
                int count=0;    
                int i=0;
                int [] a = new int[n];
                int [] b = new int[n];
                     while(i<n) 
                     {
                     a[i]=scan.nextInt();
                     i++;  
                     fact=fact*(i);    
                     }
                     i=0;
                     while(i<n)
                     {
                     b[i]=scan.nextInt();
                     i++;    
                     }
                 Arrays.sort(a);
                 Arrays.sort(b);   
                 for(int j=0;j<n;j++)
                 {
                     if(a[j]+b[n-1-j]>=k)
                       count++;
                 }
                if(count==n)
                 System.out.println("YES");
                else
                 System.out.println("NO");   
          }
    }
}
