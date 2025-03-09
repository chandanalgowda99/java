class Calculator2{
    //instance method
    int add(int a, int b){
        return a+b;
    }
    //static method
    static int multiply(int a, int b){
        return a*b;
    }
    }
    public class methodexample{
        public static void main(String[] args){
            Calculator2 calc=new Calculator2();
            System.out.println("addition:"+calc.add(5,3));//calls instance method
        }
    }
