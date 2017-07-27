import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        StringBuilder line = new StringBuilder("");  
        int i=0;
        while(i<n)
        {
           line.insert(i,' ');
            i++;
        }
        line.setLength(n);
        for(int j=n;j>0;j--)
        {
        line.setCharAt(j-1,'#');
        System.out.println(line);
        }
    }
}

