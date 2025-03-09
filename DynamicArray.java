import java.util.Scanner;
class DynamicArray{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
System.out.println("enter the rows");
int rows=sc.nextInt();
int[][] jaggedarray=new int[rows][];
for(int i=0;i<rows;i++){
System.out.println("enter the no of colm for row "+(i+1)+":");
int columns=sc.nextInt();
jaggedarray[i]=new int[columns];
System.out.println("enter the elements for row"+(i+1)+" : ");
for(int j=0;j<columns;j++){
jaggedarray[i][j]=sc.nextInt();
}
}
System.out.println("\n jagged array:");
for(int i=0;i<rows;i++){
for(int j=0;j<jaggedarray[i].length;j++){
System.out.print(jaggedarray[i][j]+" ");
}
System.out.println();
}
}
}
