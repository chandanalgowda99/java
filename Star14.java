import java.util.Scanner;
class Star14{
public static void main(String[] args)
{
int m=5;
int n=5;
for(int i=1;i<=m;i++)
{
for(int j=1;j<=n;j++)
{
if(i==1)
{
System.out.print("*");
}
else if(i==m)
{
System.out.print("*");
}
else if(j==n)
{
System.out.print("*");
}
else if(j==1)
{
System.out.print("*");
}
else
{
System.out.print("-");
}
}
System.out.println();
}
}
}




