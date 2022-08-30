public class Main
{
  public static void main (String[]args)
  {
     int num = Integer.parseInt(args[0]);
     int flag =0;
     if(num==1)
        {
            System.out.println("Neither a Prime nor a Composite");
        }
        if(num==2)
        {
            flag=0;
        }
        else
        {
            for(int i=2;i<=num/2;i++)
            {
                if(num%i==0)
                {
                    flag=1;
                    break;
                }
            }
        }
        if(flag==0)
        {
            System.out.println("Prime number");
        }
        else
        {
            System.out.println("Not Prime Number");
        }
  }
}