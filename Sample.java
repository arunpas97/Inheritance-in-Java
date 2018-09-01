class first_class
	{
		public void display1()
			{
				System.out.println("Inheritance");
			}
	}
class second_class extends first_class
	{
		public void display2()
			{
				System.out.print("It is Single Inheritance");
			}
	}
class Sample
	{
		public static void main(String a[])
			{
				second_class obj=new second_class();
				obj.display1();
				obj.display2();
			}
	}