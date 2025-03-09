import java.util.Scanner;
class Counts{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
System.out.println("enter the string");
String word=sc.nextLine();
int count=0;
for(int i=0; i<word.length(); i++){
char ch=word.charAt(i);
if(ch=='s'){
count++;
}
}
System.out.println(count);
}
}
