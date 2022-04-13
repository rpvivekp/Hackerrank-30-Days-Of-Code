//Complete this code or write your own from scratch
import java.util.*;
import java.io.*;

class Solution{
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        Map<String,Integer> phoneBook = new HashMap<String,Integer>();
        int n = in.nextInt();
        for(int i = 0; i < n; i++){
            String name = in.next();
            int phone = in.nextInt();
            phoneBook.put(name, phone);
        }
        while(in.hasNext()){
            String s = in.next();
            Integer phoneNumber = phoneBook.get(s);
            // System.out.println((phoneNumber != null) ? s + "=" + phoneNumber : "Not                     found");
            if(phoneNumber != null){
                System.out.println(s+"="+phoneNumber);
            }
            else
                System.out.println("Not found");
        }
        in.close();
    }
}
