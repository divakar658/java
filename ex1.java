
interface mylambda
{
    int display(String str1,String str2);

}
class ex1
{
    public ex1(String str)
    {
        StringBuffer str1=new StringBuffer(str);
        str1.reverse();
        System.out.println(str1);
    }
    public static void main(String args[])
    {
        mylambda my=String::compareTo;
       System.out.println(my.display("striver","abdulbari"));
    }
}