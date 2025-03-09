import java.util.Scanner;
class Book{
String title;
String author;
int year;
int ISBN;
int years;
bool published=false;

Book(String title, String author, int year, int ISBN)
{
System.out.println(title);
}
void display_info()
{
System.out.println("title <"+title+">");
System.out.println("author<"+author+">");
System.out.println("year <"+year+">");
System.out.println("ISBN <"+ISBN+">");
}
void is_published_after(int years)
{
if(year<years)
{
bool published=false;
System.out.println("not published");
}
else{
bool published=true;
System.out.println("book was already published by the year "+years);
}
}
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
Book b1=new Book();
b1.constructor(physics, Chandra, 2016, 12);
b1.display_info();
b1.is_published_year(2017);
}
}