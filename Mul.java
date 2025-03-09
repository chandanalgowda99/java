import java.util.Scanner;
class Mul{
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        System.out.println("enter a number");
        int num=scan.nextInt();
        for(int i=1;i<=10;i++)
        {
            System.out.println(num+"x"+i+"="+i*num);
        }
    }
}