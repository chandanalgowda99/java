class Contractor implements Employee, Payable{
private String name;
private String id;
private double hourlyRate;
private double hoursWorked;
Contractor(String name, String id, double hourlyRate, doublr hoursWorked){
this.name=name;
this.id=id;
this.hourlyRate=hourlyRate;
this.hoursWorked=hoursWorked;
}
public void setEmployeeDetails(String name, String id){
this.name=name;
this.id=id;
}
public void displayEmployeeDetails(){
System.out.println("contractor name:"+name);
System.out.println("contractor id:"+id);

public double calculatePayy(){
return hourlyRate*hoursWorked;
}
}