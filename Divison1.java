import java.util.Scanner;
class Division1{
private int numer;
private int denom;
int getNumer(int numer)
{
return numer;
}
void setNumer()
{
if(Numer!=0)
{
this.numer=numer;
}
else{
System.out.println("enter valid numer");
}
}
int getDinom()
{
return denom;
}
void setDinom(int denom)
{
if(dinom!=0){
this.denom=deom;
}
else{
denom=10;
}
}
division{
set numer=1;
set denom=1;
}
void div(int a, int b)
{
int res=a/b;
System.out.println("res "+res);
}
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
System.out.println("enter the value of numerator");
int numer=sc.nextInt();
System.out.println("enter the value of denominator");
int denom=sc.nextInt();
Division1 d=new Division1();
d.setNumer(numer);
d.setDenom(denom);
denom=d.getDenom();
numer=d.getNumer();
d.div(numer, denom);
}
}


