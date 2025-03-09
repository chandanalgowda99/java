import java.util.Scanner;
class Account{
private long acc_No;
private String name;
private String email;
private float amount;

long getAcc_No()
{
return acc_No;
}

void setAcc_No(long acc_No)
{
if(acc_No<=0)
{
System.out.println("enter valid acc no");
}
else{
this.acc_No=acc_No;
}
}

String getName()
{
return name;
}

void setName(String name)
{
if(name!="")
{
this.name=name;
}
else{
System.out.println("enter valid name");
}
}

String getEmail()
{
return email;
}

void setEmail(String email)
{
if(email!="")
{
this.email=email;
}
else{
System.out.println("enter valid format");
}
}

float getAmount()
{
return amount;
}

void setAmount(float amount)
{
if(amount<=0)
{
System.out.println("not valid");
}
else{
this.amount=amount;
}
}

void Withdraw(float amount, float withdrawn){
if(withdrawn>amount){
System.out.println("insufficient bank balance");
}
else{
amount-=withdrawn;
System.out.println("transaction successfull");
System.out.println("balance "+amount);
}
}

public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
System.out.println("enter Account number");
long acc_No=sc.nextLong();
System.out.println("enter name ");
String name=sc.next();
System.out.println("enter the email id");
String email=sc.next();
System.out.println("enter the amount");
float amount=sc.nextInt();
System.out.println("enter the amount to be withdrawn");
float withdrawn=sc.nextFloat();
Account a=new Account();
a.setAcc_No(acc_No);
a.setName(name);
a.setEmail(email);
a.setAmount(amount);
acc_No=a.getAcc_No();
name=a.getName();
email=a.getEmail();
amount=a.getAmount();
a.Withdraw(amount, withdrawn);
}
}








