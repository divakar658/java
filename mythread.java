public class mythread extends Thread
{
    public mythread(String name)
    {
        super(name);
    }
     public void run()
    {
    int i=1;
    while(true)
   {   
     try
    {
        System.out.println(i);
        i++;
    }
    catch(InterruptedException e)
    {
        System.out.println(e);
    }
}
}
public static void main(String args[])
        mythread t=new mythread("divakar");
        t.start();
       
        System.out.println(t.getPriority());
}
    
    
