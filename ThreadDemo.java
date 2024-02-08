import java.lang.*;
public class ThreadDemo extends Thread 
{
 public void run()
 {
 System.out.println("Inside run method");
 }
 public static void main(String[] args)
 {
 ThreadDemo t1 = new ThreadDemo();
 ThreadDemo t2 = new ThreadDemo();
 
 t1.setPriority(2);
 t2.setPriority(5);
 t1.start();
 t2.start();
 }
}