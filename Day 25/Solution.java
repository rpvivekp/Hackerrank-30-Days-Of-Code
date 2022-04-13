import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. */
        int t;
        int flag=0;
        Scanner sc = new Scanner(System.in);
        t=sc.nextInt();
        for(int j=0;j<t;j++){
            int n=sc.nextInt();
            for(int i=2; i<=n/i; i++){
                if(n%i==0)
                    n=1;
            }

            if(n==1)
                System.out.println("Not prime");
            else
                System.out.println("Prime");
        }
        
    }
}
