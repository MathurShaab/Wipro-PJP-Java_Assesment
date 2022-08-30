public class Main
{
	public static void main(String[] args) {
		int num = Integer.parseInt(args[0]);
        int retainNum=num;
        int sum=0;
        while(num!=0)
        {
            sum=sum+num%10;
            num=num/10;
        }
        System.out.println(retainNum+" -> "+ sum);
	}
}