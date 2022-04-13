import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        int aday, amonth, ayear, eday, emoth, eyear, fine = 0;
        Scanner sc = new Scanner(System.in);
        aday =sc.nextInt();
        amonth=sc.nextInt();
        ayear=sc.nextInt();
    // cin >> aday >> amonth >> ayear;
        eday=sc.nextInt();
        emoth=sc.nextInt();
        eyear=sc.nextInt();
    // cin >> eday >> emoth >> eyear;
    int dday = aday - eday;
    int dmonth = amonth - emoth;
    int dyear = ayear - eyear;

    if (dyear == 0)
    {
        if (dmonth == 0)
        {
            if (dday == 0)
            {
                fine = 0;
            }
            else if (dday > 0)
            {
                fine = 15 * dday;
            }
            else
            {
                fine = 0;
            }
        }
        else if (dmonth > 0)
        {
            fine = 500 * dmonth;
        }
        else
        {
            fine = 0;
        }
    }
    else if (dyear > 0)
    {
        fine = 10000;
    }
    else
    {
        fine = 0;
    }
    /* Enter your code here. Read input from STDIN. Print output to STDOUT */
    System.out.println(fine);
        
    }
}
