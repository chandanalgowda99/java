import java.util.Scanner;
class Student{
public static void main(String[] args){
Scanner sc= new Scanner(System.in);
int passingThreshold=50;
int rows=sc.nextInt();
int cols=sc.nextInt();
String[][] Stu=new String[rows][cols];
for(int i=0;i<rows;i++)
{
for(int j=0;j<cols;j++)
{
Stu[i][j]=sc.next();
}
System.out.println();
}
for (int i = 0; i < rows; i++) {
String name = Stu[i][0];
int marks = Integer.parseInt(Stu[i][1]);
if(marks>=passingThreshold){
System.out.println(name+"  passed");
}
else{
System.out.println(name+"  failed");
}
}
}
}