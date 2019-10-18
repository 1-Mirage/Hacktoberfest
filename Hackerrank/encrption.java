import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution 
{

    public static void main(String args[])
    {
        Scanner obj=new Scanner(System.in);
        {String n=" ";
        int c1;
        double r,c;
            String s=obj.nextLine();
            int l=s.length();
            
            
            c=(Math.ceil(Math.sqrt(l)));
            r= (Math.floor(Math.sqrt(l)));
            for(int i=l;i<((r*c)-l);i++)
            {
                s=s+" ";
            }
            c1=(int)(c);

            for(int i=0;i<c1;i++)
            {
                for(int j=i;j<l;j=j+c1)
                {
                    System.out.print(s.charAt(j));
                }
                System.out.print(" ");
            }
        }
    
    }
}
