import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static String timeConversion(String s) {
        StringBuilder str = new StringBuilder(s);
        String result="";
        int hour=0;
        String daytime= new StringBuilder("").append(str.charAt(8)).append(str.charAt(9)).toString();
        String hourtime = new StringBuilder("").append(str.charAt(0)).append(str.charAt(1)).toString();
        if(daytime.equals("PM"))
        {   
            if(!hourtime.equals("12"))
            {
            hour=Integer.parseInt(hourtime)+12;
            hourtime=Integer.toString(hour);
            str.replace(0,2,hourtime);
            }
            str.delete(8,10);
        }
        if(daytime.equals("AM"))
        {   
            if(hourtime.equals("12"))
            str.replace(0,2,"00"); 
            str.delete(8,10);
        }
        result = str.toString();
        return result;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        String result = timeConversion(s);
        System.out.println(result);
    }
}

