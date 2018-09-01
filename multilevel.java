class first_class
	{
		public void display1()
			{
				System.out.println("Base Class");
			}
	}
class second_class extends first_class
	{
		public void display2()
			{
				System.out.println("Derived Class 1");
			}
	}
class third_class extends second_class
	{
		public void display3()
			{
				System.out.println("Derived Class 2");
			}
	}
class multilevel
	{
		public static void main(String a[])
			{
				third_class obj=new third_class();
				obj.display1();
				obj.display2();
				obj.display3();
			}
	}