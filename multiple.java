class base_class
	{
		public void display()
			{
				System.out.println("This is Base Class");
			}
	}
class derived_class1 extends base_class
	{
		public void display1()
			{
				System.out.println("Derived Class 1");
			} 
	}
class derived_class2 extends base_class
	{
		public void display2()
			{
				System.out.println("Derived Class 2");
			}
	}
class multiple
	{
		public static void main(String a[])
			{
				derived_class2 obj=new derived_class2();
				obj.display();
				obj.display2();
				derived_class1 obj1=new derived_class1();
				obj1.display();
				obj1.display1();
			}
	}