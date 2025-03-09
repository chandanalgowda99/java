public class Mains{
public static void main(String[] args){
Contractor contractor=new Contractor("john doe', "C123",50.0,160);
contractor.displayEmployeeDetails();
double pay=contractor.calculatePay();
System.out.println("Contractor's Pay: $" +pay);
}
}