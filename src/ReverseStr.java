public class ReverseStr
{
    public static void main(String args[])
    {
        String str = "Ravi";
        String rev = " ";
        for(int i=str.length()-1 ; i>=0 ; i--)
        {
            rev += str.charAt(i);
        }
        System.out.println(rev);
    }
}
// in-build method to reverse the string:
// return new StringBuilder(input).reverse().tostring();