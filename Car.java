import java.util.Scanner;

class Car extends Vehicle{
Car(String brand,int speed,int NoOfDoors){
super(brand, speed);
}

public static void main(String args[]){
Car c=new Car();
c.start();
c.stop();
c.displayDetails();
c.Car("abc",200,4);
}
}