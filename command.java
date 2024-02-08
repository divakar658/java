import java.util.*;
class command
{
    public static void main(String args[]) 
    {   Scanner sc=new Scanner(System.in);
        String str_1=sc.next();
        String str_2=sc.next();
        StringBuilder str1= new StringBuilder(str_1);
        StringBuilder str2=new StringBuilder(str_2);
        StringBuilder str3=new StringBuilder("FLAMES");
        
        int len;
        for(int i=0;i<str1.length();i++)
        {
            for(int j=0;j<str2.length();j++)
            {
                if(str1.charAt(i)==str2.charAt(j))
                {
                   str1.deleteCharAt(i);
                   str2.deleteCharAt(j);
                    i--;
                    j--;
                }
            }
        }
        int length=str1.length()+str2.length();
        length=length-1;
        len=length;
        System.out.println(length+1);
        //flames
        for(int i=0;i<5;i++)
        {
            for(int j=0;j<5;j++)
            {
                if(length>=str3.length())
                {
                    length=length-str3.length();
                }
            }
           
                str3.deleteCharAt(length);
                // this is today part
                for(int k=str3.length();k<length+str3.length();k++)
                {
                    if(k>=str3.length())
                    {
                        k=k-str3.length();
                    }
                    str3.insert(str3.length(),str3.charAt(k));
                }
                for(int k=0;k<length;k++)
                {
                    str3.deleteCharAt(k);
                }
                length=len;
        }
        System.out.println( "out put is"+str3);
        

    }
}