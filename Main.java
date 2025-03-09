class Person{
    private String name;//private variable
    //stter
    void setName(String newName){
        name=newName;
    }
    //getter
    String getName(){
        return name;
    }
}
public class Main{
    public static void main(String[] args){
        Person p=new Person();
        p.setName("alice");//setting value using setter
        System.out.println(p.getName());//getting value using getter


    }
}