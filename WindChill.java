import java.util.*;
public class WindChill
{
public static void main(String args[])
{
Scanner sc = new Scanner(System.in);
System.out.println("Enter t and v");
int t=sc.nextInt();
int v=sc.nextInt();
double w = 35.74+0.6215*t+(0.42578*t-35.75)*Math.pow(v,0.16);
System.out.println(w);
}
}
