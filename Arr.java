import java.util.Scanner;
class Arr{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
int rows=sc.nextInt();
int cols=sc.nextInt();
int arr[][]=new int[rows][cols];
arr[0]=new int[3];
arr[0][0]=10;
arr[0][1]=20;
arr[0][2]=30;
arr[1]=new int[2];
arr[1][0]=1;
arr[1][1]=2;
}
}