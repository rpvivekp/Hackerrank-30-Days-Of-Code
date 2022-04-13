import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        int T;
        Scanner sc = new Scanner(System.in);
        T = sc.nextInt();
        String str = new String();
        for(int i=0;i<T;i++){
            str = sc.next();
            for(int j=0;j<str.length();j++){
                if(j%2==0){
                    System.out.print(str.charAt(j));
                }
            }
            System.out.print(" ");
            for(int j=0;j<str.length();j++){
                if(j%2!=0){
                    System.out.print(str.charAt(j));
                }
            }
            System.out.println();
        }
    }
}
