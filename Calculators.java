import java.util.Scanner;
public class Calculators{
    public double add(double a, double b){
        return a+b;
    }
    public double sub(double a, double b){
        return a-b;
    }
    public double mul(double a, double b){
        return a*b;
    }
    public double divide(double a, double b){
        if(b==0){
            System.out.println("error! division by zero.");
            return 0;
        }
        return a/b;
    }
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);

        Calculators cal=new Calculators();
        System.out.println("simple calculator");
        System.out.println("select operation:");
        System.out.println("1.add");
        System.out.println("2.subtract");
        System.out.println("3.multiplication");
        System.out.println("4.divide");

        int choice=sc.nextInt();
        System.out.print("enter the first number: ");
        double num1=sc.nextDouble();
        System.out.println("enter second number: ");
        double num2=sc.nextDouble();
        double result=0;
        switch(choice){
            case 1:
            result=cal.add(num1,num2);
            break;
            case 2:
            result=cal.sub(num1,num2);
            break;
            case 3:
            result=cal.mul(num1,num2);
            break;
            case 4:
            result=cal.divide(num1,num2);
            break;
            default:
            System.out.println("invalid operation choice");
            return;
        }
        System.out.println("result:"+result);
        
    }

}