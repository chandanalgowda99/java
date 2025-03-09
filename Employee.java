import java.util.Scanner;
class Employee{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
boolean flag=false;
String search=sc.next();
String names[]= new String[5];
for(int i=0; i<4; i++){
names[i]=sc.nextLine();}
for(int i=0; i<4; i++)
System.out.println(names[i]);
for(int i=0; i<5; i++){
if(names[i].equals(search))
{
System.out.println("match found");
flag=true;
break;
} 
}
if(flag==false)
{
System.out.println("match not found");
}
}
}