import java.util.Scanner;
class Working{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
System.out.println("enter the number of employees");
int num=sc.nextInt();
int[][] jaggedArray=new int[num][];
for(int i=0;i<num;i++)
{
System.out.println("enter the number of days for employee "+(i+1));
int days=sc.nextInt();
jaggedarray[i]=new int[days];
System.out.println("enter the number of hours of employee"+(i+1)+"for the day"+(j+1)+":");
for(int j=0;j<days;j++)
{
jaggedarray[i][j]=sc.nextInt();
}
}
System.out.println(" working hours sheet :");
for(int i=0;i<num;i++){
for(int j=0;j<jaggedarray[i].length;j++){
System.out.print(jaggedarray[i][j]+" ");
}
System.out.println();
}
}
}

