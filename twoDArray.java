import java.util.*;
public class twoDArray
{
public static void main(String args[])
{
Scanner sc = new Scanner(System.in);
System.out.println("Enter rows and columns");
int M = sc.nextInt();
int N = sc.nextInt();
int arr[][]=new int[M][N];
System.out.println("Enter elements");
for(int i=0; i<M; i++)
{
for(int j=0; j<N; j++)
{
arr[i][j]=sc.nextInt();
}
}
System.out.println("This is your 2D array");
for(int i=0; i<M; i++)
{
for(int j=0; j<N; j++)
{
System.out.print(arr[i][j]+" ");
}
System.out.println("");
}
}
}
