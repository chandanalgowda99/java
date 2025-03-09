import java.util.Scanner;
class Seat{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
int[][] seat=new int[5][5];
System.out.println("enter initial arrangements");
for(int i=0;i<5;i++){
for(int j=0;j<5;j++){
seat[i][j]=sc.nextInt();
}
System.out.println();
}
System.out.println("initial arrangement");
for(int i=0;i<5;i++){
for(int j=0;j<5;j++){
System.out.print(seat[i][j]);
}
System.out.println();
}
System.out.println(" select the seat i.e., enter the row and column number of that seat");
int row=sc.nextInt();
int col=sc.nextInt();
if(row>=5||row<0||col>=5||col<0){
System.out.println("invalid");
}
else if(seat[row][col]==1){
System.out.println("already booked");
}
else{
seat[row][col]=1;
System.out.println("booking success");
}
System.out.println("updated arrangement");
for(int i=0;i<5;i++){
for(int j=0;j<5;j++){
System.out.print(seat[i][j]);
}
System.out.println();
}
int count=0;
for(int i=0;i<5;i++){
for(int j=0;j<5;j++){
if(seat[i][j]==0){
count++;
}
}
}
System.out.println(count);

}
}
