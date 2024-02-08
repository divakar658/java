class command
{
    public static void main(String args[]) 
    {
        StringBuilder str1= new StringBuilder("divakar");
        StringBuilder str2=new StringBuilder("krishna");
        for(int i=0;i<str1.length();i++)
        {
            for(int j=0;j<str2.length();j++)
            {
                if(str1.charAt(i)==str2.charAt(j))
                {
               String str3=str1.replace(str1.charAt(i),"");
               String str4=str2.replace(str2.charAt(j),"");
                }
            }
        }
        int length=str1.length()+str2.length();
        System.out.println(length);
        

    }
}