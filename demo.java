public class demo
{
   public demo()
    {

    }
    String name;
    int age;
    String phn;
    demo(String name,int age,String phn)
    {
        this.name=name;
        this.age=age;
        this.phn=phn;
    }
    void display()
    {
        System.out.println("name"+name+"age="+age+"phn number"+phn);
        
    }
    
}
class y extends demo
{
    void display()
    {
        System.out.println("this is class demo1");
    }
    public static void main(String[] args) {
        // TODO code application logic here
        y obj1=new y();
        demo obj=new demo("STARK",60,"865");
        obj1.display();
    }
    
}
