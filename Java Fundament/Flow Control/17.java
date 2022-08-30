public class Main
{
	public static void main(String[] args) {
		String str = args[0];
		
	String reversed="";
        for(int i=str.length()-1;i>=0;i--)
        {
            reversed=reversed+str.charAt(i);
        }
        if(str.equals(reversed))
        {
            System.out.println("Palindrome");
        }
        else
        {
            System.out.println("Not a Pallindrome");
        }
		
		
		
		
}
}