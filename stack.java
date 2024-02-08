class underflowexception
{
    String  tostring()
    {
        return "stack is under flow";
    }
}
class overflowexception
{
    String  tostring()
    {
        return "stack is over flow";
    }
}
class stack
{
    private size;
    private top=-1;
    private int s[];
    stack(int sz)
    {
        size=sz;
        s=new int[sz];
    }
static int push(int x)throws overflowexception
{
{
    if(top==size-1)
    {
        throw new overflowexception();
    }
    top++;
   s[top]=x;
}
static int push()throws underflowexception
{
    if(top==-1)
    {
        throw new underflowexception();
    }
   
   int p_ele=s[top];
    top--;
   return p_ele;
}


}
class scexception
{
    public static void main(String[] args) 
    {
        Stack st=new Stack(5);
        try
        {
        st.push(10);
        st.push(15);
        st.push(10);
        st.push(15);
        st.push(10);
        
        }
        catch(overflowexception s)
        {
            System.out.println(s);
        }
        
    }  
}

