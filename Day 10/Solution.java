import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;



public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        bufferedReader.close();
        int arr[] = new int[n];
        int rem=0,s=0,t=0;


        while(n>0)
            {
            rem=n%2;
            n=n/2;
            if(rem==1)
            {   s++;
            if(s>=t)

                t=s;

            }
            else{

                s=0;
            }   
        }

        System.out.println(t);
    }
}
