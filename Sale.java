import java.util.Scanner;
class Sales{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
System.out.println("enter the no of years");
int year=sc.nextInt();
System.out.println("enter the no of regions");
int regions=sc.nextInt();
System.out.println("enter the no of products");
int product=sc.nextInt();
int[][][] sale=new int[year][regions][product];
for(int i=0;i<years;i++){
for(int j=0;j<regions;j++){
for(int k=0;k<product;k++){
sale[i][j][k]=sc.nextInt();
}
}
System.out.println();
}
}
}
