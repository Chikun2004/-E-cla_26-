public class q1
{
public static void main (String args[])
{
int dividend=Integer.parseInt(args[0]);
int divisor=Integer.parseInt(args[1]);
System.out.println(dividend);
System.out.println(divisor);
int quotient=dividend/divisor;
int reminder=dividend%divisor;
System.out.println("quotient:"+quotient);
System.out.println("reminder:"+reminder);
}
}
