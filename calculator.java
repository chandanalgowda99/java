import java.util.Scanner;
public class calculator{
    int result=0;
	void add(int a, int b){
		result=a+b;
	}
 

	void subs(int a, int b){
		result=a-b;
	}
	

	void mul(int a, int b){
		result=a*b;
	}

    void div(int a, int b){
        result=a/b;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
    }
}
