class StaticKeyWordExample{

static int counter;
int c;
static
{
counter++;
System.out.println("this is a static block");
}

void function_1()
{
c++;
System.out.println("this is the normal function:"+c);
}

static void function_2()
{
counter++;
System.out.println("this is the static function: "+counter);
}
public static void main(String[] args)
{
System.out.println("________calling object 1_________________");
StaticKeyWordExample s=new StaticKeyWordExample();
s.function_1();
function_2();
System.out.println("_____________calling object 2______________");
StaticKeyWordExample s1=new StaticKeyWordExample();
s1.function_1();
function_2();
System.out.println("c in object 1: "+s.c);
System.out.println("c in object 1: "+s1.c);
System.out.println("counter : "+counter);
}
}