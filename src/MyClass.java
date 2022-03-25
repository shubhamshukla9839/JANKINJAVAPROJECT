
class Person
{
	
	
	String name ;
	int age;
	
	Person(String name , int  age)
	{
		this.name=name;
		this.age=age;
	}
	
	public String toString()
	{
		return name+" : "+age;
	}
}

public class MyClass {
	
	
	
	public static void main(String[] args)
	{
		System.out.println("Jankins is working fine");
		Person p=new Person("shubham",22);
		System.out.println(p);
	}

}
