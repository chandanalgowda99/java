import java.util.Scanner;
class Constructorexample{
    //non parameterized constructor 
    Constructorexample()
    {
        System.out.println("non parameterized constructor");
    }
    //parameterized constructor
    Constructorexample(int a)
    {
        System.out.println("parameterized constructor:"+a);
    }
    Constructorexample(int a, String s)
    {
        System.out.println("parameterized constructor, a: "+a+"s="+s);
    }
    public static void main(String[] args)
    {
        Scanner scan= new Scanner(System.in);
        System.out.println("enter the value number");
        int num=scan.nextInt();
        Constructorexample ce=new Constructorexample();
        Constructorexample ce1=new Constructorexample(num);
        Constructorexample ce2=new Constructorexample(num,s::hello);
    }
}