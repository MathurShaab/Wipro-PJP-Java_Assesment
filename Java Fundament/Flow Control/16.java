public class Main
{
	public static void main(String[] args) {
		int num = Integer.parseInt(args[0]);
		
	int reverse=0;
        int digit;
        while(num!=0)
        {
            digit=num%10;
            reverse=reverse*10+digit;
            num= num/10;
        }
        System.out.println("Reversed Number is: " + reverse);
		
		
		
		
}
}