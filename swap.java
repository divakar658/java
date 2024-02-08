import java.util.Scanner;

import javax.swing.event.MenuDragMouseListener;
public class command
{
    public static void main(String args[]) 
    {
        int a,b;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter values");
        a=sc.nextInt();
        b=sc.nextInt();
        a=a^b;MenuDragMouseListenerkr
        b=a^b;
        a=a^b;
        System.out.println("a value"+a);
        System.out.println("b value"+b);

    }
}


