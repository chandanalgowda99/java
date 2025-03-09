import java.util.Scanner;
class Matr{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
System.out.println("enter the rows and cols");
int rows=sc.nextInt();
int cols=sc.nextInt();
int[][] matrix1=new int[rows][cols];
System.out.println("enter the values");
for(int i=0;i<rows;i++){
for(int j=0;j<cols;j++){
matrix1[i][j]=sc.nextInt();
}
}
int[][] matrix2=new int[rows][cols];
System.out.println("enter the values");
for(int i=0;i<rows;i++){
for(int j=0;j<cols;j++){
matrix2[i][j]=sc.nextInt();
}
}
int[][] matrix3=new int[rows][cols];
for(int i=0;i<rows;i++)
{
for(int j=0;j<cols;j++)
{
matrix3[i][j]=(matrix1[i][j]+matrix2[i][j]);
System.out.print(matrix3[i][j]);
}
}
}
}