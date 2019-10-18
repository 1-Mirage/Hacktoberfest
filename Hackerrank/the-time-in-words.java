import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;
public class word
{
    public static void main(String args[])
    {
        Scanner obj=new Scanner(System.in);
        int a=obj.nextInt();
        int b=obj.nextInt();
        String f="";
        int c=0,j;
        String time[]={"one","two","three","four","five","six","seven","eight","nine","ten","eleven","twelve","thirteen","fourteen","quater","sixteen","seventeen","eighteen","nineteen","twenty","twenty one","twenty two","twenty three","twenty four","twenty five","twenty six","twenty seven","twenty eight","twenty nine","half past"};
        
        for( j=0;j<12;j++)
        {
            if((j+1)==a)
            {
             f=time[j];
             break;
            }

        }
        if(b<=30)
        {

        for(int i=0;i<30;i++)
        {
            if(b==0)
            {
            System.out.println(f+" o' clock");
            break;
            }
            if(b==15)
            {
                System.out.println("quarter past "+f);
                break;
            }
            if(b==30)
            {
                System.out.println("half past "+f);
                break;
            }
            if(b==1)
            {
                 System.out.println(time[i]+" minute past "+f);
                 break;
            }
            else
            if(b==(i+1))
            {
            System.out.println(time[i]+" minutes past "+f);
            break;
            }

        }
        }
        else
        c=60-b;
        for(int i=1;i<30;i++)
        {
            if(c==15)
            {
            System.out.println("quarter to "+time[j+1]);
            break;
            }
            if(c==i)
            {
            System.out.println(time[i-1]+" minutes to "+time[j+1]);
            break;
            }
        }


    }

}

