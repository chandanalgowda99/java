import java.util.Scanner;
class Shape{
void sh(int a){
int area=a*a;
System.out.println("area :" +area);
}
int sh(int b, int c){
int area=b*c;
System.out.println("area :"+area);
return area;
}
void sh(double rad){
double area=3.14*(rad)*(rad);
System.out.println("area :"+area);
}

public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("enter side of square");
int a=sc.nextInt();
System.out.println("enter sides of rectangle");
int b=sc.nextInt();
int c=sc.nextInt();
System.out.println("enter the radius");
double rad=sc.nextDouble();
Shape s1=new Shape();
s1.sh(a);
s1.sh(b,c);
s1.sh(rad);

}
}

 

