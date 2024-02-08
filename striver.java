import java.util.*;
public class striver
{
   public static void main(String args[])
   {
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int x=0;
      while(n-->=1)
      {
         String op=sc.next();
         if(op.charAt(0)=='X')
         {
            if(op.charAt(1)=='+')
            {
               x++;
            }
            else{
               x--;
            }
         }
         else if(op.charAt(0)=='+')
         {
            ++x;
         }
         else
         {
            --x;
         }
      }
      System.out.print(x);
   }
   

}