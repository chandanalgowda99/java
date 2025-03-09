import java.util.Scanner;
class Shape{
Scanner sc=new Scanner(System.in);
System.out.println("enter side of square");
int a=sc,nextInt();
System.out.println("enter sides of rectangle");
int a=sc.nextInt();
int b=sc.nextInt();
System.out.println("enter the radius");
double rad=sc.nextDouble();
int shape(int a){
int area=a*a;
System.out.println("area :" +area);
}
int shape(int a, int b){
int area=a*b;
System.out.println("area :"+area);
}
double shape(double rad){
double area=3.14*(rad)*(rad);
System.out.println("area :"area);
}
public static void main(String args[])
{
Shape s1=new Shape();
s1.shape(2);
s1.shape(2,2);
s1.shape(2);
}
}

 

