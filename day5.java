class day5
{
    static boolean palindrome(int start,String str)
    {
        int n=str.length();
        if(start>(n/2))return true;
        if(str.charAt(start)!=str.charAt(n-start-1))
        {
            return false;
        }
       return palindrome(start+1,str);
    }

    public static void main(String args[])
    {
        String str="raina";
        System.out.println(palindrome(0,str));
    }
}