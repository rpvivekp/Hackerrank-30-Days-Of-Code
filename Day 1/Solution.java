import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
	
    public static void main(String[] args) {
        int i = 4;
        double d = 4.0;
        String s = "HackerRank ";
		
        Scanner scan = new Scanner(System.in);

        int n;
        double value;
        String str = new String();
        n=scan.nextInt();
        value = scan.nextDouble();
        scan.nextLine();
        str = scan.nextLine();
        System.out.println(i+n);
        System.out.println(d+value);
        System.out.println(s+str);

        scan.close();
    }
}