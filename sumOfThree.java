import java.util.*;
public class sumOfThree
{
public static void main(String args[])
{
Scanner sc = new Scanner(System.in);
System.out.println("Enter the size");
int n = sc.nextInt();
int arr[]=new int[n];
System.out.println("Enter array elements");
for(int i=0; i<n; i++)
arr[i]=sc.nextInt();
int count=0;
String str="";
for(int i=0; i<n-2; i++)
{
for(int j=i+1; j<n-1; j++)
{
for(int k=j+1; k<n; k++)
{
if(arr[i]+arr[j]+arr[k] == 0)
{
str+=arr[i]+" "+arr[j]+" "+arr[k]+"\n";
count++;
}
}
}
}
System.out.println("\nTriplets are \n"+str);
System.out.println("Number of triplets are "+count);
}
}
