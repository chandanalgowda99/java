import java.util.Scanner;
class Division1{
private double numer;
private double denom;


double getNumer()
{
return numer;
}


void setNumer(double numer)
{
if(numer!=0)
{
this.numer=numer;
}
else{
this.numer=1;
}
}


double getDenom()
{
return denom;
}


void setDenom(double denom)
{
if(denom!=0){
this.denom=denom;
}
else{
this.denom=10;
}
}


void Division(){
numer=1;
denom=1;
}

void div(double a, double b)
{
double res=a/b;
System.out.println("res "+res);
}

public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
System.out.println("enter the value of numerator");
double numer=sc.nextDouble();
System.out.println("enter the value of denominator");
double denom=sc.nextDouble();
Division1 d=new Division1();
d.setNumer(numer);
d.setDenom(denom);
denom=d.getDenom();
numer=d.getNumer();
d.div(numer, denom);
}
}


