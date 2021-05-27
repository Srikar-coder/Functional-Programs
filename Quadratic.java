import java.util.*;
public class Quadratic
{
public static void main(String args[])
{
Scanner sc = new Scanner(System.in);
System.out.println("Enter a, b and c");
int a=sc.nextInt();
int b=sc.nextInt();
int c=sc.nextInt();
int delta = (int)Math.pow(b,2)-4*a*c;
System.out.println("Root1 = "+(int)(-b+Math.sqrt(delta))/(2*a));
System.out.println("Root2 = "+(int)(-b-Math.sqrt(delta))/(2*a));
}
}
