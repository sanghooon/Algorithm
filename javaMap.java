/* You are given a phone book that consists of people's names and their phone number. After that you will be given some person's name as query. For each query, print the phone number of that person. */
import java.util.*;
import java.io.*;

class Main {
   public static void main(String []argh)
   {
      Scanner in = new Scanner(System.in);
      Map myMap = new HashMap();
      int n=in.nextInt();
      in.nextLine();
      for(int i=0;i<n;i++)
      {
         String name=in.nextLine();
         int phone=in.nextInt();
         in.nextLine();
         myMap.put(name, phone);
      }
      while(in.hasNext())
      {
         String s=in.nextLine();
         if(myMap.get(s) == null) {
             System.out.println("Not found");
         }
         else {
             System.out.println(s +"=" +myMap.get(s));
         }
      }
   }
}

/*
INPUT
3
uncle sam
99912222
tom
11122222
harry
12299933
uncle sam
uncle tom
harry

OUTPUT
uncle sam=99912222
Not found
harry=12299933
*/
