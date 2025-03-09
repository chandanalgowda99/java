import java.util.Scanner;
class Emp{
public static void main(String[] args){
Scanner sc= new Scanner(System.in);
double incr=0.10;
int rows=sc.nextInt();
int cols=sc.nextInt();
String[][] emp=new String[rows][cols];
double[]  fin_salary=new double[rows];
for(int i=0;i<rows;i++)
{
for(int j=0;j<cols;j++)
{
emp[i][j]=sc.next();
}
System.out.println();
}
for (int i = 0; i < rows; i++) {
String name = emp[i][0];
int Salary = Integer.parseInt(emp[i][1]);
fin_salary[i]=Salary+(Salary*incr);
System.out.println(name+" updated salary "+fin_salary[i]);
}
}
}
