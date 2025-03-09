import java.util.Scanner;
class Retail{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
System.out.println("enter the number of rows");
int rows=sc.nextInt();
String[][] retail=new String[rows][2];
System.out.println("enter the products and the number of available items");
for(int i=0;i<rows;i++)
{
for(int j=0;j<2;j++)
{
retail[i][j]=sc.next();
}
System.out.println();
}

System.out.println("entered list");
for(int i=0;i<rows;i++){
for(int j=0;j<2;j++){
System.out.print(retail[i][j]+" ");
}
System.out.println();
}
System.out.println("enter the item name");
String name=sc.next();
System.out.println("eneter the reduced number");
int reduce=sc.nextInt();
int i;
for(i=0; i<rows;i++){
if(name.equals(retail[i][0])){
int no_of_products=Integer.parseInt(retail[i][1]);
no_of_products-=reduce;
retail[i][1]=Integer.toString(no_of_products);
}
}
 System.out.println("Updated list:");
        for (i = 0; i < rows; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(retail[i][j] + " ");
            }
            System.out.println();
        }

}
}
