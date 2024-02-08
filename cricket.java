class dhoni
{
    int age=40;
    int jersey_no=7;
    class raina
    {
        public void display()
        {
            System.out.println("age:"+age);
            System.out.println("jersey_no:"+jersey_no);


        }
    }
    public void tester()
    {
        raina i=new raina();
        i.display();
    }
}
class cricket
{
    public static void main(String args[])
    {
        dhoni info=new dhoni();
       info.tester();
    }
}